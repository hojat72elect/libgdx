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
import org.robovm.objc.annotation.NotImplemented;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/* </visibility> */ class /* <name> */ UIAccelerometerDelegateAdapter/* </name> */
        extends /* <extends> */NSObject/* </extends> */
        /* <implements> */ implements UIAccelerometerDelegate/* </implements> */ {

    /* <ptr> */
    /* </ptr> */
    /* <bind> */
    /* </bind> */
    /* <constants> *//* </constants> */
    /* <constructors> *//* </constructors> */
    /* <properties> */

    /* </properties> */
    /* <members> *//* </members> */
    /* <methods> */

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @NotImplemented("accelerometer:didAccelerate:")
    public void didAccelerate(UIAccelerometer accelerometer, UIAcceleration acceleration) {
        throw new UnsupportedOperationException();
    }
    /* </methods> */
}
