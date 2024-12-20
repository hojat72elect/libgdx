
package com.badlogic.gdx.backends.iosrobovm.objectal;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.VoidPtr;

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
