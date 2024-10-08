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
import com.badlogic.gdx.math.Vector3;

public class btBroadphaseProxy extends BulletBase {
    /**
     * Temporary instance, use by native methods that return a btBroadphaseProxy instance
     */
    protected final static btBroadphaseProxy temp = new btBroadphaseProxy(0, false);
    /**
     * Pool of btBroadphaseProxy instances, used by director interface to provide the arguments.
     */
    protected static final com.badlogic.gdx.utils.Pool<btBroadphaseProxy> pool = new com.badlogic.gdx.utils.Pool<btBroadphaseProxy>() {
        @Override
        protected btBroadphaseProxy newObject() {
            return new btBroadphaseProxy(0, false);
        }
    };
    private long swigCPtr;

    protected btBroadphaseProxy(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btBroadphaseProxy, normally you should not need this constructor it's intended for low-level usage.
     */
    public btBroadphaseProxy(long cPtr, boolean cMemoryOwn) {
        this("btBroadphaseProxy", cPtr, cMemoryOwn);
        construct();
    }

    public btBroadphaseProxy() {
        this(CollisionJNI.new_btBroadphaseProxy__SWIG_0(), true);
    }

    public btBroadphaseProxy(Vector3 aabbMin, Vector3 aabbMax, long userPtr, int collisionFilterGroup, int collisionFilterMask) {
        this(CollisionJNI.new_btBroadphaseProxy__SWIG_1(aabbMin, aabbMax, userPtr, collisionFilterGroup, collisionFilterMask),
                true);
    }

    public static long getCPtr(btBroadphaseProxy obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    public static btBroadphaseProxy internalTemp(long cPtr, boolean own) {
        temp.reset(cPtr, own);
        return temp;
    }

    /**
     * Reuses a previous freed instance or creates a new instance and set it to reflect the specified native object
     */
    public static btBroadphaseProxy obtain(long cPtr, boolean own) {
        final btBroadphaseProxy result = pool.obtain();
        result.reset(cPtr, own);
        return result;
    }

    /**
     * delete the native object if required and allow the instance to be reused by the obtain method
     */
    public static void free(final btBroadphaseProxy inst) {
        inst.dispose();
        pool.free(inst);
    }

    public static boolean isPolyhedral(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isPolyhedral(proxyType);
    }

    public static boolean isConvex(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isConvex(proxyType);
    }

    public static boolean isNonMoving(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isNonMoving(proxyType);
    }

    public static boolean isConcave(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isConcave(proxyType);
    }

    public static boolean isCompound(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isCompound(proxyType);
    }

    public static boolean isSoftBody(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isSoftBody(proxyType);
    }

    public static boolean isInfinite(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isInfinite(proxyType);
    }

    public static boolean isConvex2d(int proxyType) {
        return CollisionJNI.btBroadphaseProxy_isConvex2d(proxyType);
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
                CollisionJNI.delete_btBroadphaseProxy(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long operatorNew(long sizeInBytes) {
        return CollisionJNI.btBroadphaseProxy_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDelete(long ptr) {
        CollisionJNI.btBroadphaseProxy_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNew(long arg0, long ptr) {
        return CollisionJNI.btBroadphaseProxy_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDelete(long arg0, long arg1) {
        CollisionJNI.btBroadphaseProxy_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long operatorNewArray(long sizeInBytes) {
        return CollisionJNI.btBroadphaseProxy_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDeleteArray(long ptr) {
        CollisionJNI.btBroadphaseProxy_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNewArray(long arg0, long ptr) {
        return CollisionJNI.btBroadphaseProxy_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDeleteArray(long arg0, long arg1) {
        CollisionJNI.btBroadphaseProxy_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long getClientObject() {
        return CollisionJNI.btBroadphaseProxy_clientObject_get(swigCPtr, this);
    }

    public void setClientObject(long value) {
        CollisionJNI.btBroadphaseProxy_clientObject_set(swigCPtr, this, value);
    }

    public int getCollisionFilterGroup() {
        return CollisionJNI.btBroadphaseProxy_collisionFilterGroup_get(swigCPtr, this);
    }

    public void setCollisionFilterGroup(int value) {
        CollisionJNI.btBroadphaseProxy_collisionFilterGroup_set(swigCPtr, this, value);
    }

    public int getCollisionFilterMask() {
        return CollisionJNI.btBroadphaseProxy_collisionFilterMask_get(swigCPtr, this);
    }

    public void setCollisionFilterMask(int value) {
        CollisionJNI.btBroadphaseProxy_collisionFilterMask_set(swigCPtr, this, value);
    }

    public int getUniqueId() {
        return CollisionJNI.btBroadphaseProxy_uniqueId_get(swigCPtr, this);
    }

    public void setUniqueId(int value) {
        CollisionJNI.btBroadphaseProxy_uniqueId_set(swigCPtr, this, value);
    }

    public btVector3 getAabbMin() {
        long cPtr = CollisionJNI.btBroadphaseProxy_aabbMin_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setAabbMin(btVector3 value) {
        CollisionJNI.btBroadphaseProxy_aabbMin_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public btVector3 getAabbMax() {
        long cPtr = CollisionJNI.btBroadphaseProxy_aabbMax_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setAabbMax(btVector3 value) {
        CollisionJNI.btBroadphaseProxy_aabbMax_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public int getUid() {
        return CollisionJNI.btBroadphaseProxy_getUid(swigCPtr, this);
    }

    public final static class CollisionFilterGroups {
        public final static int DefaultFilter = 1;
        public final static int StaticFilter = 2;
        public final static int KinematicFilter = 4;
        public final static int DebrisFilter = 8;
        public final static int SensorTrigger = 16;
        public final static int CharacterFilter = 32;
        public final static int AllFilter = -1;
    }

}
