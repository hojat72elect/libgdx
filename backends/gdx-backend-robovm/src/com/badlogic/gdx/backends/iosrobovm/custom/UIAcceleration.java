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
/* <visibility> */ public/* </visibility> */ class /* <name> */ UIAcceleration/* </name> */
        extends /* <extends> */NSObject/* </extends> */
        /* <implements> *//* </implements> */ {

    /* </ptr> */
    /* <bind> */static {
        ObjCRuntime.bind(UIAcceleration.class);
    }/* </bind> */

    public UIAcceleration() {
    }
    /* <constants> *//* </constants> */
    /* <constructors> */

    protected UIAcceleration(SkipInit skipInit) {
        super(skipInit);
    }

    /* </constructors> */
    /* <properties> */
    @Property(selector = "timestamp")
    public native double getTimestamp();

    @Property(selector = "x")
    public native double getX();

    @Property(selector = "y")
    public native double getY();

    @Property(selector = "z")
    public native double getZ();

    /* <ptr> */public static class UIAccelerationPtr extends Ptr<UIAcceleration, UIAccelerationPtr> {
    }
    /* </properties> */
    /* <members> *//* </members> */
    /* <methods> */

    /* </methods> */
}
