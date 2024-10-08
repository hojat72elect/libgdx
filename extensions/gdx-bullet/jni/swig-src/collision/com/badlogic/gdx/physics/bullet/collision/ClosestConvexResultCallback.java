/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;

public class ClosestConvexResultCallback extends ConvexResultCallback {
    private long swigCPtr;

    protected ClosestConvexResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.ClosestConvexResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new ClosestConvexResultCallback, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public ClosestConvexResultCallback(long cPtr, boolean cMemoryOwn) {
        this("ClosestConvexResultCallback", cPtr, cMemoryOwn);
        construct();
    }

    public ClosestConvexResultCallback(Vector3 convexFromWorld, Vector3 convexToWorld) {
        this(CollisionJNI.new_ClosestConvexResultCallback(convexFromWorld, convexToWorld), true);
        CollisionJNI.ClosestConvexResultCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
    }

    public static long getCPtr(ClosestConvexResultCallback obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.ClosestConvexResultCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_ClosestConvexResultCallback(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    protected void swigDirectorDisconnect() {
        swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        swigCMemOwn = false;
        CollisionJNI.ClosestConvexResultCallback_change_ownership(this, swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigCMemOwn = true;
        CollisionJNI.ClosestConvexResultCallback_change_ownership(this, swigCPtr, true);
    }

    public btVector3 getConvexFromWorld() {
        long cPtr = CollisionJNI.ClosestConvexResultCallback_convexFromWorld_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setConvexFromWorld(btVector3 value) {
        CollisionJNI.ClosestConvexResultCallback_convexFromWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public btVector3 getConvexToWorld() {
        long cPtr = CollisionJNI.ClosestConvexResultCallback_convexToWorld_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setConvexToWorld(btVector3 value) {
        CollisionJNI.ClosestConvexResultCallback_convexToWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public void setConvexToWorld(Vector3 value) {
        CollisionJNI.ClosestConvexResultCallback_setConvexToWorld(swigCPtr, this, value);
    }

    public btCollisionObject getHitCollisionObject() {
        return btCollisionObject.getInstance(CollisionJNI.ClosestConvexResultCallback_hitCollisionObject_get(swigCPtr, this),
                false);
    }

    public void setHitCollisionObject(btCollisionObject value) {
        CollisionJNI.ClosestConvexResultCallback_hitCollisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
    }

    public float addSingleResult(LocalConvexResult convexResult, boolean normalInWorldSpace) {
        return (getClass() == ClosestConvexResultCallback.class)
                ? CollisionJNI.ClosestConvexResultCallback_addSingleResult(swigCPtr, this, LocalConvexResult.getCPtr(convexResult),
                convexResult, normalInWorldSpace)
                : CollisionJNI.ClosestConvexResultCallback_addSingleResultSwigExplicitClosestConvexResultCallback(swigCPtr, this,
                LocalConvexResult.getCPtr(convexResult), convexResult, normalInWorldSpace);
    }

    public void getConvexFromWorld(Vector3 out) {
        CollisionJNI.ClosestConvexResultCallback_getConvexFromWorld(swigCPtr, this, out);
    }

    public void setRayFromWorld(Vector3 value) {
        CollisionJNI.ClosestConvexResultCallback_setRayFromWorld(swigCPtr, this, value);
    }

    public void getConvexToWorld(Vector3 out) {
        CollisionJNI.ClosestConvexResultCallback_getConvexToWorld(swigCPtr, this, out);
    }

    public void getHitNormalWorld(Vector3 out) {
        CollisionJNI.ClosestConvexResultCallback_getHitNormalWorld(swigCPtr, this, out);
    }

    public void setHitNormalWorld(Vector3 value) {
        CollisionJNI.ClosestConvexResultCallback_setHitNormalWorld(swigCPtr, this, value);
    }

    public void getHitPointWorld(Vector3 out) {
        CollisionJNI.ClosestConvexResultCallback_getHitPointWorld(swigCPtr, this, out);
    }

    public void setHitPointWorld(Vector3 value) {
        CollisionJNI.ClosestConvexResultCallback_setHitPointWorld(swigCPtr, this, value);
    }

}
