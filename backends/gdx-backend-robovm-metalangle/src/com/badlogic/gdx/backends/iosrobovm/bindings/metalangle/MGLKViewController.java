package com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;

/*<imports>*/

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.MachineSizedSInt;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/
@NativeClass
/* </annotations> */
/* <visibility> */ public/* </visibility> */ class /* <name> */ MGLKViewController/* </name> */
        extends /* <extends> */UIViewController/* </extends> */
        /* <implements> */ implements MGLKViewDelegate/* </implements> */ {

    /* </ptr> */
    /* <bind> */static {
        ObjCRuntime.bind(MGLKViewController.class);
    }/* </bind> */

    protected MGLKViewController() {
    }
    /* <constants> *//* </constants> */
    /* <constructors> */

    protected MGLKViewController(Handle h, long handle) {
        super(h, handle);
    }

    protected MGLKViewController(SkipInit skipInit) {
        super(skipInit);
    }

    /* </constructors> */
    /* <properties> */
    @Property(selector = "delegate")
    public native MGLKViewControllerDelegate getDelegate();

    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MGLKViewControllerDelegate v);

    @Property(selector = "preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();

    @Property(selector = "setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);

    @Property(selector = "framesDisplayed")
    public native @MachineSizedSInt long getFramesDisplayed();

    @Property(selector = "timeSinceLastUpdate")
    public native double getTimeSinceLastUpdate();

    @Property(selector = "isPaused")
    public native boolean isPaused();

    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);

    @Property(selector = "pauseOnWillResignActive")
    public native boolean isPauseOnWillResignActive();

    @Property(selector = "setPauseOnWillResignActive:")
    public native void setPauseOnWillResignActive(boolean v);

    @Property(selector = "resumeOnDidBecomeActive")
    public native boolean isResumeOnDidBecomeActive();

    @Property(selector = "setResumeOnDidBecomeActive:")
    public native void setResumeOnDidBecomeActive(boolean v);

    @Property(selector = "glView")
    public native MGLKView getGlView();

    /* </properties> */
    /* <members> *//* </members> */
    /* <methods> */
    @Method(selector = "mglkView:drawInRect:")
    public native void draw(MGLKView view, @ByVal CGRect rect);

    /* <ptr> */public static class MGLKViewControllerPtr extends Ptr<MGLKViewController, MGLKViewControllerPtr> {
    }
    /* </methods> */
}
