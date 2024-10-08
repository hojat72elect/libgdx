/*******************************************************************************
 * Copyright 2013 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.backends.iosrobovm.objectal;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.VoidPtr;

/**
 * @author Niklas Therning
 */
@Library(Library.INTERNAL)
@NativeClass
public class ALBuffer extends NSObject {
    static {
        ObjCRuntime.bind(ALBuffer.class);
    }

    @Method(selector = "bufferId")
    public native int bufferId();

    @Method(selector = "initWithName:data:size:format:frequency:")
    public native ALBuffer initWithNameDataSizeFormatFrequency(String name, VoidPtr data, int size, int format, int frequency);
}
