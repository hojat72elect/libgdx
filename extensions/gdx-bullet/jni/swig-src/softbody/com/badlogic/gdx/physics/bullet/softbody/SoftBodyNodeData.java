/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;

public class SoftBodyNodeData extends BulletBase {
    private long swigCPtr;

    protected SoftBodyNodeData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new SoftBodyNodeData, normally you should not need this constructor it's intended for low-level usage.
     */
    public SoftBodyNodeData(long cPtr, boolean cMemoryOwn) {
        this("SoftBodyNodeData", cPtr, cMemoryOwn);
        construct();
    }

    public SoftBodyNodeData() {
        this(SoftbodyJNI.new_SoftBodyNodeData(), true);
    }

    public static long getCPtr(SoftBodyNodeData obj) {
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
                SoftbodyJNI.delete_SoftBodyNodeData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public SoftBodyMaterialData getMaterial() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_material_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
    }

    public void setMaterial(SoftBodyMaterialData value) {
        SoftbodyJNI.SoftBodyNodeData_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
    }

    public btVector3FloatData getPosition() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_position_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setPosition(btVector3FloatData value) {
        SoftbodyJNI.SoftBodyNodeData_position_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public btVector3FloatData getPreviousPosition() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_previousPosition_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setPreviousPosition(btVector3FloatData value) {
        SoftbodyJNI.SoftBodyNodeData_previousPosition_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public btVector3FloatData getVelocity() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_velocity_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setVelocity(btVector3FloatData value) {
        SoftbodyJNI.SoftBodyNodeData_velocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public btVector3FloatData getAccumulatedForce() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_accumulatedForce_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setAccumulatedForce(btVector3FloatData value) {
        SoftbodyJNI.SoftBodyNodeData_accumulatedForce_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public btVector3FloatData getNormal() {
        long cPtr = SoftbodyJNI.SoftBodyNodeData_normal_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
    }

    public void setNormal(btVector3FloatData value) {
        SoftbodyJNI.SoftBodyNodeData_normal_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
    }

    public float getInverseMass() {
        return SoftbodyJNI.SoftBodyNodeData_inverseMass_get(swigCPtr, this);
    }

    public void setInverseMass(float value) {
        SoftbodyJNI.SoftBodyNodeData_inverseMass_set(swigCPtr, this, value);
    }

    public float getArea() {
        return SoftbodyJNI.SoftBodyNodeData_area_get(swigCPtr, this);
    }

    public void setArea(float value) {
        SoftbodyJNI.SoftBodyNodeData_area_set(swigCPtr, this, value);
    }

    public int getAttach() {
        return SoftbodyJNI.SoftBodyNodeData_attach_get(swigCPtr, this);
    }

    public void setAttach(int value) {
        SoftbodyJNI.SoftBodyNodeData_attach_set(swigCPtr, this, value);
    }

    public int getPad() {
        return SoftbodyJNI.SoftBodyNodeData_pad_get(swigCPtr, this);
    }

    public void setPad(int value) {
        SoftbodyJNI.SoftBodyNodeData_pad_set(swigCPtr, this, value);
    }

}
