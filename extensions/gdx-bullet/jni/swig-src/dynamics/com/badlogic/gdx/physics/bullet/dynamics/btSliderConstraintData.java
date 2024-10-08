/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;

public class btSliderConstraintData extends BulletBase {
    private long swigCPtr;

    protected btSliderConstraintData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btSliderConstraintData, normally you should not need this constructor it's intended for low-level usage.
     */
    public btSliderConstraintData(long cPtr, boolean cMemoryOwn) {
        this("btSliderConstraintData", cPtr, cMemoryOwn);
        construct();
    }

    public btSliderConstraintData() {
        this(DynamicsJNI.new_btSliderConstraintData(), true);
    }

    public static long getCPtr(btSliderConstraintData obj) {
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
                DynamicsJNI.delete_btSliderConstraintData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btTypedConstraintData getTypeConstraintData() {
        long cPtr = DynamicsJNI.btSliderConstraintData_typeConstraintData_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
    }

    public void setTypeConstraintData(btTypedConstraintData value) {
        DynamicsJNI.btSliderConstraintData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
    }

    public btTransformFloatData getRbAFrame() {
        long cPtr = DynamicsJNI.btSliderConstraintData_rbAFrame_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
    }

    public void setRbAFrame(btTransformFloatData value) {
        DynamicsJNI.btSliderConstraintData_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
    }

    public btTransformFloatData getRbBFrame() {
        long cPtr = DynamicsJNI.btSliderConstraintData_rbBFrame_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
    }

    public void setRbBFrame(btTransformFloatData value) {
        DynamicsJNI.btSliderConstraintData_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
    }

    public float getLinearUpperLimit() {
        return DynamicsJNI.btSliderConstraintData_linearUpperLimit_get(swigCPtr, this);
    }

    public void setLinearUpperLimit(float value) {
        DynamicsJNI.btSliderConstraintData_linearUpperLimit_set(swigCPtr, this, value);
    }

    public float getLinearLowerLimit() {
        return DynamicsJNI.btSliderConstraintData_linearLowerLimit_get(swigCPtr, this);
    }

    public void setLinearLowerLimit(float value) {
        DynamicsJNI.btSliderConstraintData_linearLowerLimit_set(swigCPtr, this, value);
    }

    public float getAngularUpperLimit() {
        return DynamicsJNI.btSliderConstraintData_angularUpperLimit_get(swigCPtr, this);
    }

    public void setAngularUpperLimit(float value) {
        DynamicsJNI.btSliderConstraintData_angularUpperLimit_set(swigCPtr, this, value);
    }

    public float getAngularLowerLimit() {
        return DynamicsJNI.btSliderConstraintData_angularLowerLimit_get(swigCPtr, this);
    }

    public void setAngularLowerLimit(float value) {
        DynamicsJNI.btSliderConstraintData_angularLowerLimit_set(swigCPtr, this, value);
    }

    public int getUseLinearReferenceFrameA() {
        return DynamicsJNI.btSliderConstraintData_useLinearReferenceFrameA_get(swigCPtr, this);
    }

    public void setUseLinearReferenceFrameA(int value) {
        DynamicsJNI.btSliderConstraintData_useLinearReferenceFrameA_set(swigCPtr, this, value);
    }

    public int getUseOffsetForConstraintFrame() {
        return DynamicsJNI.btSliderConstraintData_useOffsetForConstraintFrame_get(swigCPtr, this);
    }

    public void setUseOffsetForConstraintFrame(int value) {
        DynamicsJNI.btSliderConstraintData_useOffsetForConstraintFrame_set(swigCPtr, this, value);
    }

}
