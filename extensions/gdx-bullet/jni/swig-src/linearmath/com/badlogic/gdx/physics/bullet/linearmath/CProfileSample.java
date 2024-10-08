/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class CProfileSample extends BulletBase {
    private long swigCPtr;

    protected CProfileSample(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new CProfileSample, normally you should not need this constructor it's intended for low-level usage.
     */
    public CProfileSample(long cPtr, boolean cMemoryOwn) {
        this("CProfileSample", cPtr, cMemoryOwn);
        construct();
    }

    public CProfileSample(String name) {
        this(LinearMathJNI.new_CProfileSample(name), true);
    }

    public static long getCPtr(CProfileSample obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(swigCPtr = cPtr, cMemoryOwn);
    }

    @Override
    protected void finalize() throws Throwable {
        if (!destroyed) destroy();
        super.finalize();
    }

    @Override
    protected synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                LinearMathJNI.delete_CProfileSample(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

}
