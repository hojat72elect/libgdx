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

public class btTriangleCallback extends BulletBase {
    private long swigCPtr;

    protected btTriangleCallback(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btTriangleCallback, normally you should not need this constructor it's intended for low-level usage.
     */
    public btTriangleCallback(long cPtr, boolean cMemoryOwn) {
        this("btTriangleCallback", cPtr, cMemoryOwn);
        construct();
    }

    public btTriangleCallback() {
        this(CollisionJNI.new_btTriangleCallback(), true);
        CollisionJNI.btTriangleCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
    }

    public static long getCPtr(btTriangleCallback obj) {
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
                CollisionJNI.delete_btTriangleCallback(swigCPtr);
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
        CollisionJNI.btTriangleCallback_change_ownership(this, swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigCMemOwn = true;
        CollisionJNI.btTriangleCallback_change_ownership(this, swigCPtr, true);
    }

    public void processTriangle(btVector3 triangle, int partId, int triangleIndex) {
        CollisionJNI.btTriangleCallback_processTriangle(swigCPtr, this, btVector3.getCPtr(triangle), triangle, partId,
                triangleIndex);
    }

}
