/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;

public class btFixedConstraint extends btGeneric6DofSpring2Constraint {
    private long swigCPtr;

    protected btFixedConstraint(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, DynamicsJNI.btFixedConstraint_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btFixedConstraint, normally you should not need this constructor it's intended for low-level usage.
     */
    public btFixedConstraint(long cPtr, boolean cMemoryOwn) {
        this("btFixedConstraint", cPtr, cMemoryOwn);
        construct();
    }

    public btFixedConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB) {
        this(DynamicsJNI.new_btFixedConstraint(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, frameInA, frameInB),
                true);
    }

    public static long getCPtr(btFixedConstraint obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(DynamicsJNI.btFixedConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                DynamicsJNI.delete_btFixedConstraint(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

}
