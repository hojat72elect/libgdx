/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.badlogic.gdx.backends.iosrobovm.custom;

/*<imports>*/

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/**
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 5.0.
 */
@Deprecated
/* </javadoc> */
/* <annotations> */
@Library("UIKit")
@NativeClass
/* </annotations> */
/* <visibility> */ public/* </visibility> */ class /* <name> */ UIAccelerometer/* </name> */
        extends /* <extends> */NSObject/* </extends> */
        /* <implements> *//* </implements> */ {

    /* </ptr> */
    /* <bind> */static {
        ObjCRuntime.bind(UIAccelerometer.class);
    }/* </bind> */

    public UIAccelerometer() {
    }
    /* <constants> *//* </constants> */
    /* <constructors> */

    protected UIAccelerometer(SkipInit skipInit) {
        super(skipInit);
    }

    /* </properties> */
    /* <members> *//* </members> */
    /* <methods> */
    @Method(selector = "sharedAccelerometer")
    public static native UIAccelerometer getSharedAccelerometer();

    /* </constructors> */
    /* <properties> */
    @Property(selector = "updateInterval")
    public native double getUpdateInterval();

    @Property(selector = "setUpdateInterval:")
    public native void setUpdateInterval(double v);

    @Property(selector = "delegate")
    public native UIAccelerometerDelegate getDelegate();

    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIAccelerometerDelegate v);

    /* <ptr> */public static class UIAccelerometerPtr extends Ptr<UIAccelerometer, UIAccelerometerPtr> {
    }
    /* </methods> */
}
