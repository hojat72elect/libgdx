package com.badlogic.gdx.backends.iosrobovm;

import com.badlogic.gdx.*;
import com.badlogic.gdx.backends.iosrobovm.objectal.OALIOSAudio;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSMutableDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSProcessInfo;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.*;
import org.robovm.rt.bro.Bro;

import java.io.File;

public class IOSApplication implements Application {

    static final boolean IS_METALANGLE = false;
    UIApplication uiApp;
    UIWindow uiWindow;
    ApplicationListener listener;
    IOSViewControllerListener viewControllerListener;
    IOSApplicationConfiguration config;
    IOSGraphics graphics;
    IOSAudio audio;
    Files files;
    IOSInput input;
    IOSNet net;
    int logLevel = Application.LOG_DEBUG;
    ApplicationLogger applicationLogger;
    /**
     * The display scale factor (1.0f for normal; 2.0f to use retina coordinates/dimensions).
     */
    float pixelsPerPoint;
    Array<Runnable> runnables = new Array<Runnable>();
    Array<Runnable> executedRunnables = new Array<Runnable>();
    Array<LifecycleListener> lifecycleListeners = new Array<LifecycleListener>();
    private IOSScreenBounds lastScreenBounds = null;
    public IOSApplication(ApplicationListener listener, IOSApplicationConfiguration config) {
        this.listener = listener;
        this.config = config;
    }

    final boolean didFinishLaunching(UIApplication uiApp, UIApplicationLaunchOptions options) {
        setApplicationLogger(new IOSApplicationLogger());
        Gdx.app = this;
        this.uiApp = uiApp;

        // enable or disable screen dimming
        uiApp.setIdleTimerDisabled(config.preventScreenDimming);

        Gdx.app.debug("IOSApplication", "iOS version: " + UIDevice.getCurrentDevice().getSystemVersion());
        Gdx.app.debug("IOSApplication", "Running in " + (Bro.IS_64BIT ? "64-bit" : "32-bit") + " mode");

        // iOS counts in "points" instead of pixels. Points are logical pixels
        pixelsPerPoint = (float) UIScreen.getMainScreen().getNativeScale();
        Gdx.app.debug("IOSApplication", "Pixels per point: " + pixelsPerPoint);

        this.uiWindow = new UIWindow(UIScreen.getMainScreen().getBounds());
        this.uiWindow.makeKeyAndVisible();
        uiApp.getDelegate().setWindow(uiWindow);

        // setup libgdx
        this.input = createInput();
        this.graphics = createGraphics();
        Gdx.gl = Gdx.gl20 = graphics.gl20;
        Gdx.gl30 = graphics.gl30;
        this.files = createFiles();
        this.audio = createAudio(config);
        this.net = new IOSNet(this, config);

        Gdx.files = this.files;
        Gdx.graphics = this.graphics;
        Gdx.audio = this.audio;
        Gdx.input = this.input;
        Gdx.net = this.net;

        this.input.setupPeripherals();

        this.uiWindow.setRootViewController(this.graphics.viewController);
        this.graphics.updateSafeInsets();

        Gdx.app.debug("IOSApplication", "created");

        // Trigger first render, special case that is caught and returned
        this.graphics.view.display();

        listener.create();
        listener.resize(this.graphics.getWidth(), this.graphics.getHeight());

        // make sure the OpenGL view has contents before displaying it
        this.graphics.view.display();

        return true;
    }

    protected Files createFiles() {
        return new IOSFiles();
    }

    protected IOSAudio createAudio(IOSApplicationConfiguration config) {
        if (config.useAudio)
            return new OALIOSAudio(config);
        else
            return new DisabledIOSAudio();
    }

    protected IOSGraphics createGraphics() {
        return new IOSGraphics(this, config, input, config.useGL30);
    }

    protected IOSUIViewController createUIViewController(IOSGraphics graphics) {
        return new IOSUIViewController(this, graphics);
    }

    protected IOSInput createInput() {
        return new DefaultIOSInput(this);
    }

    /**
     * Returns device ppi using a best guess approach when device is unknown. Overwrite to customize strategy.
     */
    protected int guessUnknownPpi() {
        int ppi;
        if (UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.Pad)
            ppi = 132 * (int) pixelsPerPoint;
        else
            ppi = 164 * (int) pixelsPerPoint;
        error("IOSApplication", "Device PPI unknown. PPI value has been guessed to " + ppi + " but may be wrong");
        return ppi;
    }

    /**
     * Return the UI view controller of IOSApplication
     *
     * @return the view controller of IOSApplication
     */
    public UIViewController getUIViewController() {
        return graphics.viewController;
    }

    /**
     * Return the UI Window of IOSApplication
     *
     * @return the window
     */
    public UIWindow getUIWindow() {
        return uiWindow;
    }

    /**
     * @return logical dimensions of space we draw to, adjusted for device orientation
     * @see IOSScreenBounds for detailed explanation
     */
    protected IOSScreenBounds computeBounds() {
        CGRect screenBounds = uiWindow.getBounds();
        final CGRect statusBarFrame = uiApp.getStatusBarFrame();
        double statusBarHeight = statusBarFrame.getHeight();

        double screenWidth = screenBounds.getWidth();
        double screenHeight = screenBounds.getHeight();

        if (statusBarHeight != 0.0) {
            debug("IOSApplication", "Status bar is visible (height = " + statusBarHeight + ")");
            screenHeight -= statusBarHeight;
        } else {
            debug("IOSApplication", "Status bar is not visible");
        }
        final int offsetX = 0;
        final int offsetY = (int) Math.round(statusBarHeight);

        final int width = (int) Math.round(screenWidth);
        final int height = (int) Math.round(screenHeight);

        final int backBufferWidth = (int) Math.round(screenWidth * pixelsPerPoint);
        final int backBufferHeight = (int) Math.round(screenHeight * pixelsPerPoint);

        debug("IOSApplication", "Computed bounds are x=" + offsetX + " y=" + offsetY + " w=" + width + " h=" + height + " bbW= "
                + backBufferWidth + " bbH= " + backBufferHeight);

        return lastScreenBounds = new IOSScreenBounds(offsetX, offsetY, width, height, backBufferWidth, backBufferHeight);
    }

    /**
     * @return area of screen in UIKit points on which libGDX draws, with 0,0 being upper left corner
     */
    public IOSScreenBounds getScreenBounds() {
        if (lastScreenBounds == null)
            return computeBounds();
        else
            return lastScreenBounds;
    }

    final void didBecomeActive(UIApplication uiApp) {
        Gdx.app.debug("IOSApplication", "resumed");
        audio.didBecomeActive();
        graphics.makeCurrent();
        graphics.resume();
    }

    final void willEnterForeground(UIApplication uiApp) {
        audio.willEnterForeground();
    }

    final void willResignActive(UIApplication uiApp) {
        Gdx.app.debug("IOSApplication", "paused");
        audio.willResignActive();
        graphics.makeCurrent();
        graphics.pause();
        Gdx.gl.glFinish();
    }

    final void willTerminate(UIApplication uiApp) {
        Gdx.app.debug("IOSApplication", "disposed");
        audio.willTerminate();
        graphics.makeCurrent();
        Array<LifecycleListener> listeners = lifecycleListeners;
        synchronized (listeners) {
            for (LifecycleListener listener : listeners) {
                listener.pause();
            }
        }
        listener.dispose();
        Gdx.gl.glFinish();
    }

    @Override
    public ApplicationListener getApplicationListener() {
        return listener;
    }

    @Override
    public Graphics getGraphics() {
        return graphics;
    }

    @Override
    public Audio getAudio() {
        return audio;
    }

    @Override
    public Input getInput() {
        return input;
    }

    @Override
    public Files getFiles() {
        return files;
    }

    @Override
    public Net getNet() {
        return net;
    }

    @Override
    public void debug(String tag, String message) {
        if (logLevel >= LOG_DEBUG) getApplicationLogger().debug(tag, message);
    }

    @Override
    public void debug(String tag, String message, Throwable exception) {
        if (logLevel >= LOG_DEBUG) getApplicationLogger().debug(tag, message, exception);
    }

    @Override
    public void log(String tag, String message) {
        if (logLevel >= LOG_INFO) getApplicationLogger().log(tag, message);
    }

    @Override
    public void log(String tag, String message, Throwable exception) {
        if (logLevel >= LOG_INFO) getApplicationLogger().log(tag, message, exception);
    }

    @Override
    public void error(String tag, String message) {
        if (logLevel >= LOG_ERROR) getApplicationLogger().error(tag, message);
    }

    @Override
    public void error(String tag, String message, Throwable exception) {
        if (logLevel >= LOG_ERROR) getApplicationLogger().error(tag, message, exception);
    }

    @Override
    public int getLogLevel() {
        return logLevel;
    }

    @Override
    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public ApplicationLogger getApplicationLogger() {
        return applicationLogger;
    }

    @Override
    public void setApplicationLogger(ApplicationLogger applicationLogger) {
        this.applicationLogger = applicationLogger;
    }

    @Override
    public ApplicationType getType() {
        return ApplicationType.iOS;
    }

    @Override
    public int getVersion() {
        return (int) NSProcessInfo.getSharedProcessInfo().getOperatingSystemVersion().getMajorVersion();
    }

    @Override
    public long getJavaHeap() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    @Override
    public long getNativeHeap() {
        return getJavaHeap();
    }

    @Override
    public Preferences getPreferences(String name) {
        File libraryPath = new File(System.getenv("HOME"), "Library");
        File finalPath = new File(libraryPath, name + ".plist");

        @SuppressWarnings("unchecked")
        NSMutableDictionary<NSString, NSObject> nsDictionary = (NSMutableDictionary<NSString, NSObject>) NSMutableDictionary
                .read(finalPath);

        // if it fails to get an existing dictionary, create a new one.
        if (nsDictionary == null) {
            nsDictionary = new NSMutableDictionary<NSString, NSObject>();
            nsDictionary.write(finalPath, false);
        }
        return new IOSPreferences(nsDictionary, finalPath.getAbsolutePath());
    }

    @Override
    public void postRunnable(Runnable runnable) {
        synchronized (runnables) {
            runnables.add(runnable);
            Gdx.graphics.requestRendering();
        }
    }

    public void processRunnables() {
        synchronized (runnables) {
            executedRunnables.clear();
            executedRunnables.addAll(runnables);
            runnables.clear();
        }
        for (int i = 0; i < executedRunnables.size; i++) {
            executedRunnables.get(i).run();
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public Clipboard getClipboard() {
        return new Clipboard() {
            @Override
            public boolean hasContents() {
                return UIPasteboard.getGeneralPasteboard().hasStrings();
            }

            @Override
            public String getContents() {
                return UIPasteboard.getGeneralPasteboard().getString();
            }

            @Override
            public void setContents(String content) {
                UIPasteboard.getGeneralPasteboard().setString(content);
            }
        };
    }

    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        synchronized (lifecycleListeners) {
            lifecycleListeners.add(listener);
        }
    }

    @Override
    public void removeLifecycleListener(LifecycleListener listener) {
        synchronized (lifecycleListeners) {
            lifecycleListeners.removeValue(listener, true);
        }
    }

    /**
     * Add a listener to handle events from the libGDX root view controller
     *
     * @param listener The {#link IOSViewControllerListener} to add
     */
    public void addViewControllerListener(IOSViewControllerListener listener) {
        viewControllerListener = listener;
    }

    public static abstract class Delegate extends UIApplicationDelegateAdapter {
        private IOSApplication app;

        protected abstract IOSApplication createApplication();

        @Override
        public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
            application.addStrongRef(this); // Prevent this from being GCed until the ObjC UIApplication is deallocated
            this.app = createApplication();
            return app.didFinishLaunching(application, launchOptions);
        }

        @Override
        public void didBecomeActive(UIApplication application) {
            app.didBecomeActive(application);
        }

        @Override
        public void willEnterForeground(UIApplication application) {
            app.willEnterForeground(application);
        }

        @Override
        public void willResignActive(UIApplication application) {
            app.willResignActive(application);
        }

        @Override
        public void willTerminate(UIApplication application) {
            app.willTerminate(application);
        }
    }
}
