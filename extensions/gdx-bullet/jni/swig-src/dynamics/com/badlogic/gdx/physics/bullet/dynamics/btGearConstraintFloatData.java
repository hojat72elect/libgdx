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

public class btGearConstraintFloatData extends BulletBase {
    private long swigCPtr;

    protected btGearConstraintFloatData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btGearConstraintFloatData, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btGearConstraintFloatData(long cPtr, boolean cMemoryOwn) {
        this("btGearConstraintFloatData", cPtr, cMemoryOwn);
        construct();
    }

    public btGearConstraintFloatData() {
        this(DynamicsJNI.new_btGearConstraintFloatData(), true);
    }

    public static long getCPtr(btGearConstraintFloatData obj) {
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
                DynamicsJNI.delete_btGearConstraintFloatData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btTypedConstraintFloatData getTypeConstraintData() {
        long cPtr = DynamicsJNI.btGearConstraintFloatData_typeConstraintData_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btTypedConstraintFloatData(cPtr, false);
    }

    public void setTypeConstraintData(btTypedConstraintFloatData value) {
        DynamicsJNI.btGearConstraintFloatData_typeConstraintData_set(swigCPtr, this, btTypedConstraintFloatData.getCPtr(value),
                value);
    }

    public btVector3FloatData getAxisInA() {
        long cPtr = DynamicsJNI.btGearConstraintFloatData_axisInA_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setAxisInA(btVector3FloatData value) {
        DynamicsJNI.btGearConstraintFloatData_axisInA_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public btVector3FloatData getAxisInB() {
        long cPtr = DynamicsJNI.btGearConstraintFloatData_axisInB_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setAxisInB(btVector3FloatData value) {
        DynamicsJNI.btGearConstraintFloatData_axisInB_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public float getRatio() {
        return DynamicsJNI.btGearConstraintFloatData_ratio_get(swigCPtr, this);
    }

    public void setRatio(float value) {
        DynamicsJNI.btGearConstraintFloatData_ratio_set(swigCPtr, this, value);
    }

    public String getPadding() {
        return DynamicsJNI.btGearConstraintFloatData_padding_get(swigCPtr, this);
    }

    public void setPadding(String value) {
        DynamicsJNI.btGearConstraintFloatData_padding_set(swigCPtr, this, value);
    }

}
