/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

public class btDantzigSolver extends btMLCPSolverInterface {
    private long swigCPtr;

    protected btDantzigSolver(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, DynamicsJNI.btDantzigSolver_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btDantzigSolver, normally you should not need this constructor it's intended for low-level usage.
     */
    public btDantzigSolver(long cPtr, boolean cMemoryOwn) {
        this("btDantzigSolver", cPtr, cMemoryOwn);
        construct();
    }

    public btDantzigSolver() {
        this(DynamicsJNI.new_btDantzigSolver(), true);
    }

    public static long getCPtr(btDantzigSolver obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(DynamicsJNI.btDantzigSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                DynamicsJNI.delete_btDantzigSolver(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public boolean solveMLCP(SWIGTYPE_p_btMatrixXT_float_t A, SWIGTYPE_p_btVectorXT_float_t b, SWIGTYPE_p_btVectorXT_float_t x,
                             SWIGTYPE_p_btVectorXT_float_t lo, SWIGTYPE_p_btVectorXT_float_t hi, SWIGTYPE_p_btAlignedObjectArrayT_int_t limitDependency,
                             int numIterations, boolean useSparsity) {
        return DynamicsJNI.btDantzigSolver_solveMLCP__SWIG_0(swigCPtr, this, SWIGTYPE_p_btMatrixXT_float_t.getCPtr(A),
                SWIGTYPE_p_btVectorXT_float_t.getCPtr(b), SWIGTYPE_p_btVectorXT_float_t.getCPtr(x),
                SWIGTYPE_p_btVectorXT_float_t.getCPtr(lo), SWIGTYPE_p_btVectorXT_float_t.getCPtr(hi),
                SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(limitDependency), numIterations, useSparsity);
    }

    public boolean solveMLCP(SWIGTYPE_p_btMatrixXT_float_t A, SWIGTYPE_p_btVectorXT_float_t b, SWIGTYPE_p_btVectorXT_float_t x,
                             SWIGTYPE_p_btVectorXT_float_t lo, SWIGTYPE_p_btVectorXT_float_t hi, SWIGTYPE_p_btAlignedObjectArrayT_int_t limitDependency,
                             int numIterations) {
        return DynamicsJNI.btDantzigSolver_solveMLCP__SWIG_1(swigCPtr, this, SWIGTYPE_p_btMatrixXT_float_t.getCPtr(A),
                SWIGTYPE_p_btVectorXT_float_t.getCPtr(b), SWIGTYPE_p_btVectorXT_float_t.getCPtr(x),
                SWIGTYPE_p_btVectorXT_float_t.getCPtr(lo), SWIGTYPE_p_btVectorXT_float_t.getCPtr(hi),
                SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(limitDependency), numIterations);
    }

}
