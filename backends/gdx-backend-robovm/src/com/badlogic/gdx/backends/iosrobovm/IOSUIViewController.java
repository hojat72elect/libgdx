package com.badlogic.gdx.backends.iosrobovm;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.HdpiMode;
import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.coregraphics.CGSize;
import org.robovm.apple.foundation.*;
import org.robovm.apple.glkit.GLKViewController;
import org.robovm.apple.uikit.*;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.Method;

public class IOSUIViewController extends GLKViewController {
    final IOSApplication app;
    final IOSGraphics graphics;
    protected Input.KeyboardHeightObserver observer;

    protected IOSUIViewController(IOSApplication app, IOSGraphics graphics) {
        this.app = app;
        this.graphics = graphics;
    }

    @Override
    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
        // start GLKViewController even though we may only draw a single frame
        // (we may be in non-continuous mode)
        setPaused(false);
        injectKeyboardNotification();
    }

    @Method(selector = "keyboardWillHide")
    public void keyboardWillHide(NSNotification notification) {
        if (observer != null) observer.onKeyboardHeightChanged(0);
    }

    @Method(selector = "keyboardWillShow")
    public void keyboardWillShow(NSNotification notification) {
        CGRect screenRect = UIScreen.getMainScreen().getBounds();
        double screenHeight = screenRect.getSize().getHeight();
        double heightScale = Gdx.graphics.getHeight() / screenHeight;

        NSDictionary<NSString, ?> userInfo = (NSDictionary<NSString, ?>) notification.getUserInfo();
        CGRect keyboardEndFrame = ((NSValue) userInfo.get(UIKeyboardAnimation.Keys.FrameEnd())).rectValue();

        UIView textField = null;
        // No lambdas :(
        // Also, we might need to verify the UITextField to, that it matches the one defined in DefaultIOSInput
        for (UIView e : getView().getSubviews()) {
            if (e instanceof UITextView || e instanceof UITextField) {
                if (e.isFirstResponder() && !e.isHidden()) {
                    textField = e;
                    break;
                } else {
                    if (observer != null)
                        observer.onKeyboardHeightChanged((int) (keyboardEndFrame.getSize().getHeight() * heightScale));
                    return;
                }
            }
        }

        if (textField == null) {
            if (observer != null)
                observer.onKeyboardHeightChanged((int) (keyboardEndFrame.getSize().getHeight() * heightScale));
            return;
        }

        // I haven't found any docs on when keyboardWillShow constructs a implicit animation, so iOS 15 should be fine
        if (Foundation.getMajorSystemVersion() <= 15) {
            double duration;
            long curve;
            curve = ((NSNumber) userInfo.get(UIKeyboardAnimation.Keys.AnimationCurve())).longValue();
            duration = ((NSNumber) userInfo.get(UIKeyboardAnimation.Keys.AnimationDuration())).doubleValue();

            UIView.beginAnimations(null, null);
            UIView.setAnimationDurationInSeconds(duration);
            UIView.setAnimationCurve(UIViewAnimationCurve.valueOf(curve));
        }

        CGRect newFrame = textField.getFrame();
        if (observer != null) observer
                .onKeyboardHeightChanged((int) ((keyboardEndFrame.getSize().getHeight() + newFrame.getSize().getHeight()) * heightScale));
        keyboardEndFrame = textField.convertRectToView(keyboardEndFrame, null);
        newFrame.setOrigin(new CGPoint(getView().getSafeAreaInsets().getLeft(),
                getView().getBounds().getSize().getHeight() - keyboardEndFrame.getSize().getHeight() - newFrame.getSize().getHeight()));
        newFrame.setSize(new CGSize(getView().getBounds().getSize().getWidth() - getView().getSafeAreaInsets().getLeft()
                - getView().getSafeAreaInsets().getRight(), newFrame.getSize().getHeight()));
        textField.setFrame(newFrame);

        if (Foundation.getMajorSystemVersion() <= 15) {
            UIView.commitAnimations();
        }
    }

    public void injectKeyboardNotification() {
        NSNotificationCenter.getDefaultCenter().addObserver(this, Selector.register("keyboardWillShow"),
                UIWindow.KeyboardWillShowNotification(), null);
        NSNotificationCenter.getDefaultCenter().addObserver(this, Selector.register("keyboardWillHide"),
                UIWindow.KeyboardWillHideNotification(), null);

    }

    @Override
    public void viewDidAppear(boolean animated) {
        super.viewDidAppear(animated);
        getView().setContentScaleFactor(UIScreen.getMainScreen().getNativeScale());
        if (app.viewControllerListener != null) app.viewControllerListener.viewDidAppear(animated);
    }

    @Override
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations() {
        long mask = 0;
        if (app.config.orientationLandscape) {
            mask |= (1L << UIInterfaceOrientation.LandscapeLeft.value()) | (1L << UIInterfaceOrientation.LandscapeRight.value());
        }
        if (app.config.orientationPortrait) {
            mask |= 1L << UIInterfaceOrientation.Portrait.value();
            if (UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.Pad) {
                mask |= 1L << UIInterfaceOrientation.PortraitUpsideDown.value();
            }
        }
        return new UIInterfaceOrientationMask(mask);
    }

    @Override
    public boolean shouldAutorotate() {
        return true;
    }

    @Override
    public UIRectEdge getPreferredScreenEdgesDeferringSystemGestures() {
        return app.config.screenEdgesDeferringSystemGestures;
    }

    @Override
    public void viewDidLayoutSubviews() {
        super.viewDidLayoutSubviews();
        // get the view size and update graphics
        final IOSScreenBounds oldBounds = graphics.screenBounds;
        final IOSScreenBounds newBounds = app.computeBounds();
        graphics.screenBounds = newBounds;
        // Layout may happen without bounds changing, don't trigger resize in that case
        if (newBounds.width != oldBounds.width || newBounds.height != oldBounds.height) {
            graphics.makeCurrent();
            graphics.updateSafeInsets();
            graphics.gl20.glViewport(0, 0, newBounds.backBufferWidth, newBounds.backBufferHeight);
            if (graphics.config.hdpiMode == HdpiMode.Pixels) {
                app.listener.resize(newBounds.backBufferWidth, newBounds.backBufferHeight);
            } else {
                app.listener.resize(newBounds.width, newBounds.height);
            }
        }

    }

    @Override
    public boolean prefersStatusBarHidden() {
        return !app.config.statusBarVisible;
    }

    @Override
    public boolean prefersHomeIndicatorAutoHidden() {
        return app.config.hideHomeIndicator;
    }

    @Override
    public void pressesBegan(NSSet<UIPress> presses, UIPressesEvent event) {
        if (presses == null || presses.isEmpty() || !app.input.onKey(presses.getValues().first().getKey(), true)) {
            super.pressesBegan(presses, event);
        }
    }

    @Override
    public void pressesEnded(NSSet<UIPress> presses, UIPressesEvent event) {
        if (presses == null || presses.isEmpty() || !app.input.onKey(presses.getValues().first().getKey(), false)) {
            super.pressesEnded(presses, event);
        }
    }
}
