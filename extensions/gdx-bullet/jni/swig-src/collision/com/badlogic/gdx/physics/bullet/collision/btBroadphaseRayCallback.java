/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btBroadphaseRayCallback extends btBroadphaseAabbCallback {
    private long swigCPtr;

    protected btBroadphaseRayCallback(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.btBroadphaseRayCallback_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btBroadphaseRayCallback, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btBroadphaseRayCallback(long cPtr, boolean cMemoryOwn) {
        this("btBroadphaseRayCallback", cPtr, cMemoryOwn);
        construct();
    }

    protected btBroadphaseRayCallback() {
        this(CollisionJNI.new_btBroadphaseRayCallback(), true);
        CollisionJNI.btBroadphaseRayCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
    }

    public static long getCPtr(btBroadphaseRayCallback obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.btBroadphaseRayCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_btBroadphaseRayCallback(swigCPtr);
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
        CollisionJNI.btBroadphaseRayCallback_change_ownership(this, swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigCMemOwn = true;
        CollisionJNI.btBroadphaseRayCallback_change_ownership(this, swigCPtr, true);
    }

    public btVector3 getRayDirectionInverse() {
        long cPtr = CollisionJNI.btBroadphaseRayCallback_rayDirectionInverse_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setRayDirectionInverse(btVector3 value) {
        CollisionJNI.btBroadphaseRayCallback_rayDirectionInverse_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public long[] getSigns() {
        return CollisionJNI.btBroadphaseRayCallback_signs_get(swigCPtr, this);
    }

    public void setSigns(long[] value) {
        CollisionJNI.btBroadphaseRayCallback_signs_set(swigCPtr, this, value);
    }

    public float getLambda_max() {
        return CollisionJNI.btBroadphaseRayCallback_lambda_max_get(swigCPtr, this);
    }

    public void setLambda_max(float value) {
        CollisionJNI.btBroadphaseRayCallback_lambda_max_set(swigCPtr, this, value);
    }

}
