/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btAngularLimit extends BulletBase {
    private long swigCPtr;

    protected btAngularLimit(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btAngularLimit, normally you should not need this constructor it's intended for low-level usage.
     */
    public btAngularLimit(long cPtr, boolean cMemoryOwn) {
        this("btAngularLimit", cPtr, cMemoryOwn);
        construct();
    }

    public btAngularLimit() {
        this(DynamicsJNI.new_btAngularLimit(), true);
    }

    public static long getCPtr(btAngularLimit obj) {
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
                DynamicsJNI.delete_btAngularLimit(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void set(float low, float high, float _softness, float _biasFactor, float _relaxationFactor) {
        DynamicsJNI.btAngularLimit_set__SWIG_0(swigCPtr, this, low, high, _softness, _biasFactor, _relaxationFactor);
    }

    public void set(float low, float high, float _softness, float _biasFactor) {
        DynamicsJNI.btAngularLimit_set__SWIG_1(swigCPtr, this, low, high, _softness, _biasFactor);
    }

    public void set(float low, float high, float _softness) {
        DynamicsJNI.btAngularLimit_set__SWIG_2(swigCPtr, this, low, high, _softness);
    }

    public void set(float low, float high) {
        DynamicsJNI.btAngularLimit_set__SWIG_3(swigCPtr, this, low, high);
    }

    public void test(float angle) {
        DynamicsJNI.btAngularLimit_test(swigCPtr, this, angle);
    }

    public float getSoftness() {
        return DynamicsJNI.btAngularLimit_getSoftness(swigCPtr, this);
    }

    public float getBiasFactor() {
        return DynamicsJNI.btAngularLimit_getBiasFactor(swigCPtr, this);
    }

    public float getRelaxationFactor() {
        return DynamicsJNI.btAngularLimit_getRelaxationFactor(swigCPtr, this);
    }

    public float getCorrection() {
        return DynamicsJNI.btAngularLimit_getCorrection(swigCPtr, this);
    }

    public float getSign() {
        return DynamicsJNI.btAngularLimit_getSign(swigCPtr, this);
    }

    public float getHalfRange() {
        return DynamicsJNI.btAngularLimit_getHalfRange(swigCPtr, this);
    }

    public boolean isLimit() {
        return DynamicsJNI.btAngularLimit_isLimit(swigCPtr, this);
    }

    public void fit(SWIGTYPE_p_float angle) {
        DynamicsJNI.btAngularLimit_fit(swigCPtr, this, SWIGTYPE_p_float.getCPtr(angle));
    }

    public float getError() {
        return DynamicsJNI.btAngularLimit_getError(swigCPtr, this);
    }

    public float getLow() {
        return DynamicsJNI.btAngularLimit_getLow(swigCPtr, this);
    }

    public float getHigh() {
        return DynamicsJNI.btAngularLimit_getHigh(swigCPtr, this);
    }

}
