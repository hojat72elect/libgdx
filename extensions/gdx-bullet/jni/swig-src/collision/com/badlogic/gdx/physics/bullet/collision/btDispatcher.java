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

public class btDispatcher extends BulletBase {
    private long swigCPtr;

    protected btDispatcher(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btDispatcher, normally you should not need this constructor it's intended for low-level usage.
     */
    public btDispatcher(long cPtr, boolean cMemoryOwn) {
        this("btDispatcher", cPtr, cMemoryOwn);
        construct();
    }

    public static long getCPtr(btDispatcher obj) {
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
                CollisionJNI.delete_btDispatcher(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btCollisionAlgorithm findAlgorithm(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap,
                                              btPersistentManifold sharedManifold, int queryType) {
        long cPtr = CollisionJNI.btDispatcher_findAlgorithm(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap,
                btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btPersistentManifold.getCPtr(sharedManifold), sharedManifold,
                queryType);
        return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
    }

    public btPersistentManifold getNewManifold(btCollisionObject b0, btCollisionObject b1) {
        long cPtr = CollisionJNI.btDispatcher_getNewManifold(swigCPtr, this, btCollisionObject.getCPtr(b0), b0,
                btCollisionObject.getCPtr(b1), b1);
        return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
    }

    public void releaseManifold(btPersistentManifold manifold) {
        CollisionJNI.btDispatcher_releaseManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
    }

    public void clearManifold(btPersistentManifold manifold) {
        CollisionJNI.btDispatcher_clearManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
    }

    public boolean needsCollision(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btDispatcher_needsCollision(swigCPtr, this, btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public boolean needsResponse(btCollisionObject body0, btCollisionObject body1) {
        return CollisionJNI.btDispatcher_needsResponse(swigCPtr, this, btCollisionObject.getCPtr(body0), body0,
                btCollisionObject.getCPtr(body1), body1);
    }

    public void dispatchAllCollisionPairs(btOverlappingPairCache pairCache, btDispatcherInfo dispatchInfo,
                                          btDispatcher dispatcher) {
        CollisionJNI.btDispatcher_dispatchAllCollisionPairs(swigCPtr, this, btOverlappingPairCache.getCPtr(pairCache), pairCache,
                btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btDispatcher.getCPtr(dispatcher), dispatcher);
    }

    public int getNumManifolds() {
        return CollisionJNI.btDispatcher_getNumManifolds(swigCPtr, this);
    }

    public btPersistentManifold getManifoldByIndexInternal(int index) {
        long cPtr = CollisionJNI.btDispatcher_getManifoldByIndexInternal(swigCPtr, this, index);
        return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
    }

    public SWIGTYPE_p_p_btPersistentManifold getInternalManifoldPointer() {
        long cPtr = CollisionJNI.btDispatcher_getInternalManifoldPointer(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_p_btPersistentManifold(cPtr, false);
    }

    public btPoolAllocator getInternalManifoldPool() {
        long cPtr = CollisionJNI.btDispatcher_getInternalManifoldPool(swigCPtr, this);
        return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
    }

    public btPoolAllocator getInternalManifoldPoolConst() {
        long cPtr = CollisionJNI.btDispatcher_getInternalManifoldPoolConst(swigCPtr, this);
        return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
    }

    public long allocateCollisionAlgorithm(int size) {
        return CollisionJNI.btDispatcher_allocateCollisionAlgorithm(swigCPtr, this, size);
    }

    public void freeCollisionAlgorithm(long ptr) {
        CollisionJNI.btDispatcher_freeCollisionAlgorithm(swigCPtr, this, ptr);
    }

}
