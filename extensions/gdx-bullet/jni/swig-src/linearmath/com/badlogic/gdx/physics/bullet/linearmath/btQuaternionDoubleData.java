/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btQuaternionDoubleData extends BulletBase {
    private long swigCPtr;

    protected btQuaternionDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btQuaternionDoubleData, normally you should not need this constructor it's intended for low-level usage.
     */
    public btQuaternionDoubleData(long cPtr, boolean cMemoryOwn) {
        this("btQuaternionDoubleData", cPtr, cMemoryOwn);
        construct();
    }

    public btQuaternionDoubleData() {
        this(LinearMathJNI.new_btQuaternionDoubleData(), true);
    }

    public static long getCPtr(btQuaternionDoubleData obj) {
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
                LinearMathJNI.delete_btQuaternionDoubleData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public double[] getFloats() {
        return LinearMathJNI.btQuaternionDoubleData_floats_get(swigCPtr, this);
    }

    public void setFloats(double[] value) {
        LinearMathJNI.btQuaternionDoubleData_floats_set(swigCPtr, this, value);
    }

}
