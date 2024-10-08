/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btSphereShape extends btConvexInternalShape {
    private long swigCPtr;

    protected btSphereShape(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.btSphereShape_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btSphereShape, normally you should not need this constructor it's intended for low-level usage.
     */
    public btSphereShape(long cPtr, boolean cMemoryOwn) {
        this("btSphereShape", cPtr, cMemoryOwn);
        construct();
    }

    public btSphereShape(float radius) {
        this(CollisionJNI.new_btSphereShape(radius), true);
    }

    public static long getCPtr(btSphereShape obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.btSphereShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_btSphereShape(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long operatorNew(long sizeInBytes) {
        return CollisionJNI.btSphereShape_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDelete(long ptr) {
        CollisionJNI.btSphereShape_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNew(long arg0, long ptr) {
        return CollisionJNI.btSphereShape_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDelete(long arg0, long arg1) {
        CollisionJNI.btSphereShape_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long operatorNewArray(long sizeInBytes) {
        return CollisionJNI.btSphereShape_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDeleteArray(long ptr) {
        CollisionJNI.btSphereShape_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNewArray(long arg0, long ptr) {
        return CollisionJNI.btSphereShape_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDeleteArray(long arg0, long arg1) {
        CollisionJNI.btSphereShape_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public float getRadius() {
        return CollisionJNI.btSphereShape_getRadius(swigCPtr, this);
    }

    public void setUnscaledRadius(float radius) {
        CollisionJNI.btSphereShape_setUnscaledRadius(swigCPtr, this, radius);
    }

}
