/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btSpatialTransformationMatrix extends BulletBase {
    private long swigCPtr;

    protected btSpatialTransformationMatrix(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btSpatialTransformationMatrix, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btSpatialTransformationMatrix(long cPtr, boolean cMemoryOwn) {
        this("btSpatialTransformationMatrix", cPtr, cMemoryOwn);
        construct();
    }

    public btSpatialTransformationMatrix() {
        this(LinearMathJNI.new_btSpatialTransformationMatrix(), true);
    }

    public static long getCPtr(btSpatialTransformationMatrix obj) {
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
                LinearMathJNI.delete_btSpatialTransformationMatrix(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btMatrix3x3 getRotMat() {
        long cPtr = LinearMathJNI.btSpatialTransformationMatrix_rotMat_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btMatrix3x3(cPtr, false);
    }

    public void setRotMat(btMatrix3x3 value) {
        LinearMathJNI.btSpatialTransformationMatrix_rotMat_set(swigCPtr, this, btMatrix3x3.getCPtr(value), value);
    }

    public btVector3 getTrnVec() {
        long cPtr = LinearMathJNI.btSpatialTransformationMatrix_trnVec_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setTrnVec(btVector3 value) {
        LinearMathJNI.btSpatialTransformationMatrix_trnVec_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public void transformInverse(btSymmetricSpatialDyad inMat, btSymmetricSpatialDyad outMat, int outOp) {
        LinearMathJNI.btSpatialTransformationMatrix_transformInverse__SWIG_2(swigCPtr, this, btSymmetricSpatialDyad.getCPtr(inMat),
                inMat, btSymmetricSpatialDyad.getCPtr(outMat), outMat, outOp);
    }

    public void transformInverse(btSymmetricSpatialDyad inMat, btSymmetricSpatialDyad outMat) {
        LinearMathJNI.btSpatialTransformationMatrix_transformInverse__SWIG_3(swigCPtr, this, btSymmetricSpatialDyad.getCPtr(inMat),
                inMat, btSymmetricSpatialDyad.getCPtr(outMat), outMat);
    }

    public final static class eOutputOperation {
        public final static int None = 0;
        public final static int Add = 1;
        public final static int Subtract = 2;
    }

}
