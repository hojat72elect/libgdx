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
import com.badlogic.gdx.math.Matrix4;

public class btConvexSeparatingDistanceUtil extends BulletBase {
    private long swigCPtr;

    protected btConvexSeparatingDistanceUtil(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btConvexSeparatingDistanceUtil, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btConvexSeparatingDistanceUtil(long cPtr, boolean cMemoryOwn) {
        this("btConvexSeparatingDistanceUtil", cPtr, cMemoryOwn);
        construct();
    }

    public btConvexSeparatingDistanceUtil(float boundingRadiusA, float boundingRadiusB) {
        this(LinearMathJNI.new_btConvexSeparatingDistanceUtil(boundingRadiusA, boundingRadiusB), true);
    }

    public static long getCPtr(btConvexSeparatingDistanceUtil obj) {
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
                LinearMathJNI.delete_btConvexSeparatingDistanceUtil(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public float getConservativeSeparatingDistance() {
        return LinearMathJNI.btConvexSeparatingDistanceUtil_getConservativeSeparatingDistance(swigCPtr, this);
    }

    public void updateSeparatingDistance(Matrix4 transA, Matrix4 transB) {
        LinearMathJNI.btConvexSeparatingDistanceUtil_updateSeparatingDistance(swigCPtr, this, transA, transB);
    }

    public void initSeparatingDistance(Vector3 separatingVector, float separatingDistance, Matrix4 transA, Matrix4 transB) {
        LinearMathJNI.btConvexSeparatingDistanceUtil_initSeparatingDistance(swigCPtr, this, separatingVector, separatingDistance,
                transA, transB);
    }

}
