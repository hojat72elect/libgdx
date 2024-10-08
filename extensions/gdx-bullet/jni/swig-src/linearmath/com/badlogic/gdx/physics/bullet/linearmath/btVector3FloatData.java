/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btVector3FloatData extends BulletBase {
    private long swigCPtr;

    protected btVector3FloatData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btVector3FloatData, normally you should not need this constructor it's intended for low-level usage.
     */
    public btVector3FloatData(long cPtr, boolean cMemoryOwn) {
        this("btVector3FloatData", cPtr, cMemoryOwn);
        construct();
    }

    public btVector3FloatData() {
        this(LinearMathJNI.new_btVector3FloatData(), true);
    }

    public static long getCPtr(btVector3FloatData obj) {
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
                LinearMathJNI.delete_btVector3FloatData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public float[] getFloats() {
        return LinearMathJNI.btVector3FloatData_floats_get(swigCPtr, this);
    }

    public void setFloats(float[] value) {
        LinearMathJNI.btVector3FloatData_floats_set(swigCPtr, this, value);
    }

}
