/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btGImpactMeshShape extends btGImpactShapeInterface {
    private long swigCPtr;

    protected btGImpactMeshShape(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.btGImpactMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btGImpactMeshShape, normally you should not need this constructor it's intended for low-level usage.
     */
    public btGImpactMeshShape(long cPtr, boolean cMemoryOwn) {
        this("btGImpactMeshShape", cPtr, cMemoryOwn);
        construct();
    }

    public btGImpactMeshShape(btStridingMeshInterface meshInterface) {
        this(CollisionJNI.new_btGImpactMeshShape(btStridingMeshInterface.getCPtr(meshInterface), meshInterface), true);
    }

    public static long getCPtr(btGImpactMeshShape obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.btGImpactMeshShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_btGImpactMeshShape(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btStridingMeshInterface getMeshInterface() {
        long cPtr = CollisionJNI.btGImpactMeshShape_getMeshInterface(swigCPtr, this);
        return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
    }

    public btStridingMeshInterface getMeshInterfaceConst() {
        long cPtr = CollisionJNI.btGImpactMeshShape_getMeshInterfaceConst(swigCPtr, this);
        return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
    }

    public int getMeshPartCount() {
        return CollisionJNI.btGImpactMeshShape_getMeshPartCount(swigCPtr, this);
    }

    public btGImpactMeshShapePart getMeshPart(int index) {
        long cPtr = CollisionJNI.btGImpactMeshShape_getMeshPart(swigCPtr, this, index);
        return (cPtr == 0) ? null : new btGImpactMeshShapePart(cPtr, false);
    }

    public btGImpactMeshShapePart getMeshPartConst(int index) {
        long cPtr = CollisionJNI.btGImpactMeshShape_getMeshPartConst(swigCPtr, this, index);
        return (cPtr == 0) ? null : new btGImpactMeshShapePart(cPtr, false);
    }

}
