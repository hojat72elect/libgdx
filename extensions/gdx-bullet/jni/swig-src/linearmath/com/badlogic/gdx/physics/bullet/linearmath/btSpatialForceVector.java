/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;

public class btSpatialForceVector extends BulletBase {
    private long swigCPtr;

    protected btSpatialForceVector(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btSpatialForceVector, normally you should not need this constructor it's intended for low-level usage.
     */
    public btSpatialForceVector(long cPtr, boolean cMemoryOwn) {
        this("btSpatialForceVector", cPtr, cMemoryOwn);
        construct();
    }

    public btSpatialForceVector() {
        this(LinearMathJNI.new_btSpatialForceVector__SWIG_0(), true);
    }

    public btSpatialForceVector(Vector3 angular, Vector3 linear) {
        this(LinearMathJNI.new_btSpatialForceVector__SWIG_1(angular, linear), true);
    }

    public btSpatialForceVector(float ax, float ay, float az, float lx, float ly, float lz) {
        this(LinearMathJNI.new_btSpatialForceVector__SWIG_2(ax, ay, az, lx, ly, lz), true);
    }

    public static long getCPtr(btSpatialForceVector obj) {
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
                LinearMathJNI.delete_btSpatialForceVector(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btVector3 getTopVec() {
        long cPtr = LinearMathJNI.btSpatialForceVector_topVec_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setTopVec(btVector3 value) {
        LinearMathJNI.btSpatialForceVector_topVec_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public btVector3 getBottomVec() {
        long cPtr = LinearMathJNI.btSpatialForceVector_bottomVec_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setBottomVec(btVector3 value) {
        LinearMathJNI.btSpatialForceVector_bottomVec_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public void setVector(Vector3 angular, Vector3 linear) {
        LinearMathJNI.btSpatialForceVector_setVector(swigCPtr, this, angular, linear);
    }

    public void setValue(float ax, float ay, float az, float lx, float ly, float lz) {
        LinearMathJNI.btSpatialForceVector_setValue(swigCPtr, this, ax, ay, az, lx, ly, lz);
    }

    public void addVector(Vector3 angular, Vector3 linear) {
        LinearMathJNI.btSpatialForceVector_addVector(swigCPtr, this, angular, linear);
    }

    public void addValue(float ax, float ay, float az, float lx, float ly, float lz) {
        LinearMathJNI.btSpatialForceVector_addValue(swigCPtr, this, ax, ay, az, lx, ly, lz);
    }

    public Vector3 getLinear() {
        return LinearMathJNI.btSpatialForceVector_getLinear(swigCPtr, this);
    }

    public void setLinear(Vector3 linear) {
        LinearMathJNI.btSpatialForceVector_setLinear(swigCPtr, this, linear);
    }

    public Vector3 getAngular() {
        return LinearMathJNI.btSpatialForceVector_getAngular(swigCPtr, this);
    }

    public void setAngular(Vector3 angular) {
        LinearMathJNI.btSpatialForceVector_setAngular(swigCPtr, this, angular);
    }

    public void addAngular(Vector3 angular) {
        LinearMathJNI.btSpatialForceVector_addAngular(swigCPtr, this, angular);
    }

    public void addLinear(Vector3 linear) {
        LinearMathJNI.btSpatialForceVector_addLinear(swigCPtr, this, linear);
    }

    public void setZero() {
        LinearMathJNI.btSpatialForceVector_setZero(swigCPtr, this);
    }

    public btSpatialForceVector operatorAdditionAssignment(btSpatialForceVector vec) {
        return new btSpatialForceVector(
                LinearMathJNI.btSpatialForceVector_operatorAdditionAssignment(swigCPtr, this, btSpatialForceVector.getCPtr(vec), vec),
                false);
    }

    public btSpatialForceVector operatorSubtractionAssignment(btSpatialForceVector vec) {
        return new btSpatialForceVector(
                LinearMathJNI.btSpatialForceVector_operatorSubtractionAssignment(swigCPtr, this, btSpatialForceVector.getCPtr(vec), vec),
                false);
    }

    public btSpatialForceVector operatorSubtraction(btSpatialForceVector vec) {
        return new btSpatialForceVector(
                LinearMathJNI.btSpatialForceVector_operatorSubtraction__SWIG_0(swigCPtr, this, btSpatialForceVector.getCPtr(vec), vec),
                true);
    }

    public btSpatialForceVector operatorAddition(btSpatialForceVector vec) {
        return new btSpatialForceVector(
                LinearMathJNI.btSpatialForceVector_operatorAddition(swigCPtr, this, btSpatialForceVector.getCPtr(vec), vec), true);
    }

    public btSpatialForceVector operatorSubtraction() {
        return new btSpatialForceVector(LinearMathJNI.btSpatialForceVector_operatorSubtraction__SWIG_1(swigCPtr, this), true);
    }

    public btSpatialForceVector operatorMultiplication(float s) {
        return new btSpatialForceVector(LinearMathJNI.btSpatialForceVector_operatorMultiplication(swigCPtr, this, s), true);
    }

}
