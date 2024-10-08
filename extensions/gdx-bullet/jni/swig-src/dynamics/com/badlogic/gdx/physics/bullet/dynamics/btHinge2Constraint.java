/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Vector3;

public class btHinge2Constraint extends btGeneric6DofSpring2Constraint {
    private long swigCPtr;

    protected btHinge2Constraint(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, DynamicsJNI.btHinge2Constraint_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btHinge2Constraint, normally you should not need this constructor it's intended for low-level usage.
     */
    public btHinge2Constraint(long cPtr, boolean cMemoryOwn) {
        this("btHinge2Constraint", cPtr, cMemoryOwn);
        construct();
    }

    public btHinge2Constraint(btRigidBody rbA, btRigidBody rbB, Vector3 anchor, Vector3 axis1, Vector3 axis2) {
        this(DynamicsJNI.new_btHinge2Constraint(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, anchor, axis1, axis2),
                true);
    }

    public static long getCPtr(btHinge2Constraint obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(DynamicsJNI.btHinge2Constraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                DynamicsJNI.delete_btHinge2Constraint(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long operatorNew(long sizeInBytes) {
        return DynamicsJNI.btHinge2Constraint_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDelete(long ptr) {
        DynamicsJNI.btHinge2Constraint_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNew(long arg0, long ptr) {
        return DynamicsJNI.btHinge2Constraint_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDelete(long arg0, long arg1) {
        DynamicsJNI.btHinge2Constraint_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long operatorNewArray(long sizeInBytes) {
        return DynamicsJNI.btHinge2Constraint_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDeleteArray(long ptr) {
        DynamicsJNI.btHinge2Constraint_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNewArray(long arg0, long ptr) {
        return DynamicsJNI.btHinge2Constraint_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDeleteArray(long arg0, long arg1) {
        DynamicsJNI.btHinge2Constraint_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public Vector3 getAnchor() {
        return DynamicsJNI.btHinge2Constraint_getAnchor(swigCPtr, this);
    }

    public Vector3 getAnchor2() {
        return DynamicsJNI.btHinge2Constraint_getAnchor2(swigCPtr, this);
    }

    public Vector3 getAxis1() {
        return DynamicsJNI.btHinge2Constraint_getAxis1(swigCPtr, this);
    }

    public Vector3 getAxis2() {
        return DynamicsJNI.btHinge2Constraint_getAxis2(swigCPtr, this);
    }

    public float getAngle1() {
        return DynamicsJNI.btHinge2Constraint_getAngle1(swigCPtr, this);
    }

    public float getAngle2() {
        return DynamicsJNI.btHinge2Constraint_getAngle2(swigCPtr, this);
    }

    public void setUpperLimit(float ang1max) {
        DynamicsJNI.btHinge2Constraint_setUpperLimit(swigCPtr, this, ang1max);
    }

    public void setLowerLimit(float ang1min) {
        DynamicsJNI.btHinge2Constraint_setLowerLimit(swigCPtr, this, ang1min);
    }

}
