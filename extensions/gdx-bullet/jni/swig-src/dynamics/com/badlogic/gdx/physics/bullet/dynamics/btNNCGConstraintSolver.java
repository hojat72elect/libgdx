/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;

public class btNNCGConstraintSolver extends btSequentialImpulseConstraintSolver {
    private long swigCPtr;

    protected btNNCGConstraintSolver(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, DynamicsJNI.btNNCGConstraintSolver_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btNNCGConstraintSolver, normally you should not need this constructor it's intended for low-level usage.
     */
    public btNNCGConstraintSolver(long cPtr, boolean cMemoryOwn) {
        this("btNNCGConstraintSolver", cPtr, cMemoryOwn);
        construct();
    }

    public btNNCGConstraintSolver() {
        this(DynamicsJNI.new_btNNCGConstraintSolver(), true);
    }

    public static long getCPtr(btNNCGConstraintSolver obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(DynamicsJNI.btNNCGConstraintSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                DynamicsJNI.delete_btNNCGConstraintSolver(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long operatorNew(long sizeInBytes) {
        return DynamicsJNI.btNNCGConstraintSolver_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDelete(long ptr) {
        DynamicsJNI.btNNCGConstraintSolver_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNew(long arg0, long ptr) {
        return DynamicsJNI.btNNCGConstraintSolver_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDelete(long arg0, long arg1) {
        DynamicsJNI.btNNCGConstraintSolver_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long operatorNewArray(long sizeInBytes) {
        return DynamicsJNI.btNNCGConstraintSolver_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDeleteArray(long ptr) {
        DynamicsJNI.btNNCGConstraintSolver_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNewArray(long arg0, long ptr) {
        return DynamicsJNI.btNNCGConstraintSolver_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDeleteArray(long arg0, long arg1) {
        DynamicsJNI.btNNCGConstraintSolver_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public boolean getOnlyForNoneContact() {
        return DynamicsJNI.btNNCGConstraintSolver_onlyForNoneContact_get(swigCPtr, this);
    }

    public void setOnlyForNoneContact(boolean value) {
        DynamicsJNI.btNNCGConstraintSolver_onlyForNoneContact_set(swigCPtr, this, value);
    }

}
