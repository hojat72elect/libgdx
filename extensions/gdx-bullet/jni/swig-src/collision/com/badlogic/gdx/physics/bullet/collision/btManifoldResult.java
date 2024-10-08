/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btManifoldResult extends btDiscreteCollisionDetectorInterface.Result {
    private long swigCPtr;

    protected btManifoldResult(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.btManifoldResult_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btManifoldResult, normally you should not need this constructor it's intended for low-level usage.
     */
    public btManifoldResult(long cPtr, boolean cMemoryOwn) {
        this("btManifoldResult", cPtr, cMemoryOwn);
        construct();
    }

    public btManifoldResult() {
        this(CollisionJNI.new_btManifoldResult__SWIG_0(), true);
    }

    public btManifoldResult(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
        this(CollisionJNI.new_btManifoldResult__SWIG_1(btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap,
                btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap), true);
    }

    public static long getCPtr(btManifoldResult obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    public static float calculateCombinedRestitution(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedRestitution(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public static float calculateCombinedFriction(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedFriction(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public static float calculateCombinedRollingFriction(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedRollingFriction(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public static float calculateCombinedSpinningFriction(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedSpinningFriction(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public static float calculateCombinedContactDamping(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedContactDamping(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public static float calculateCombinedContactStiffness(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btManifoldResult_calculateCombinedContactStiffness(btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.btManifoldResult_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_btManifoldResult(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btPersistentManifold getPersistentManifoldConst() {
        long cPtr = CollisionJNI.btManifoldResult_getPersistentManifoldConst(swigCPtr, this);
        return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
    }

    public btPersistentManifold getPersistentManifold() {
        long cPtr = CollisionJNI.btManifoldResult_getPersistentManifold(swigCPtr, this);
        return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
    }

    public void setPersistentManifold(btPersistentManifold manifoldPtr) {
        CollisionJNI.btManifoldResult_setPersistentManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifoldPtr), manifoldPtr);
    }

    public void refreshContactPoints() {
        CollisionJNI.btManifoldResult_refreshContactPoints(swigCPtr, this);
    }

    public btCollisionObjectWrapper getBody0Wrap() {
        return btCollisionObjectWrapper.internalTemp(CollisionJNI.btManifoldResult_getBody0Wrap(swigCPtr, this), false);
    }

    public void setBody0Wrap(btCollisionObjectWrapper obj0Wrap) {
        CollisionJNI.btManifoldResult_setBody0Wrap(swigCPtr, this, btCollisionObjectWrapper.getCPtr(obj0Wrap), obj0Wrap);
    }

    public btCollisionObjectWrapper getBody1Wrap() {
        return btCollisionObjectWrapper.internalTemp(CollisionJNI.btManifoldResult_getBody1Wrap(swigCPtr, this), false);
    }

    public void setBody1Wrap(btCollisionObjectWrapper obj1Wrap) {
        CollisionJNI.btManifoldResult_setBody1Wrap(swigCPtr, this, btCollisionObjectWrapper.getCPtr(obj1Wrap), obj1Wrap);
    }

    public btCollisionObject getBody0Internal() {
        return btCollisionObject.getInstance(CollisionJNI.btManifoldResult_getBody0Internal(swigCPtr, this), false);
    }

    public btCollisionObject getBody1Internal() {
        return btCollisionObject.getInstance(CollisionJNI.btManifoldResult_getBody1Internal(swigCPtr, this), false);
    }

    public float getClosestPointDistanceThreshold() {
        return CollisionJNI.btManifoldResult_closestPointDistanceThreshold_get(swigCPtr, this);
    }

    public void setClosestPointDistanceThreshold(float value) {
        CollisionJNI.btManifoldResult_closestPointDistanceThreshold_set(swigCPtr, this, value);
    }

}
