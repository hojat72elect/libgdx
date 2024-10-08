/*
 * Copyright (C) 2013-2015 RoboVM AB
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

package com.badlogic.gdx.backends.iosrobovm.bindings.metalangle;

/*<imports>*/

import org.robovm.rt.bro.ValuedEnum;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /* <name> */khronos_boolean_enum_t/* </name> */ implements ValuedEnum {
    /* <values> */
    FALSE(0L), TRUE(1L), BOOLEAN_ENUM_FORCE_SIZE(2147483647L);
    /* </values> */

    /* <bind> */
    /* </bind> */
    /* <constants> *//* </constants> */
    /* <methods> *//* </methods> */

    private final long n;

    private /* <name> */ khronos_boolean_enum_t/* </name> */(long n) {
        this.n = n;
    }

    public static /* <name> */khronos_boolean_enum_t/* </name> */ valueOf(long n) {
        for (/* <name> */khronos_boolean_enum_t/* </name> */ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException(
                "No constant with value " + n + " found in " + /* <name> */khronos_boolean_enum_t/* </name> */.class.getName());
    }

    public long value() {
        return n;
    }
}
