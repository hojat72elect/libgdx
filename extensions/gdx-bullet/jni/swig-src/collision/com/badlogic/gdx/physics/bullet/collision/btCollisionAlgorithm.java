/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btCollisionAlgorithm extends BulletBase {
    private long swigCPtr;

    protected btCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btCollisionAlgorithm, normally you should not need this constructor it's intended for low-level usage.
     */
    public btCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
        this("btCollisionAlgorithm", cPtr, cMemoryOwn);
        construct();
    }

    public static long getCPtr(btCollisionAlgorithm obj) {
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
                CollisionJNI.delete_btCollisionAlgorithm(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void processCollision(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap,
                                 btDispatcherInfo dispatchInfo, btManifoldResult resultOut) {
        CollisionJNI.btCollisionAlgorithm_processCollision(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap,
                btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo,
                btManifoldResult.getCPtr(resultOut), resultOut);
    }

    public float calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, btDispatcherInfo dispatchInfo,
                                       btManifoldResult resultOut) {
        return CollisionJNI.btCollisionAlgorithm_calculateTimeOfImpact(swigCPtr, this, btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo,
                btManifoldResult.getCPtr(resultOut), resultOut);
    }

    public void getAllContactManifolds(btPersistentManifoldArray manifoldArray) {
        CollisionJNI.btCollisionAlgorithm_getAllContactManifolds(swigCPtr, this, btPersistentManifoldArray.getCPtr(manifoldArray),
                manifoldArray);
    }

}
