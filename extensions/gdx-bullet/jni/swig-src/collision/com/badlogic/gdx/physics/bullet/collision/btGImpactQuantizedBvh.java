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
import com.badlogic.gdx.math.Matrix4;

public class btGImpactQuantizedBvh extends BulletBase {
    private long swigCPtr;

    protected btGImpactQuantizedBvh(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btGImpactQuantizedBvh, normally you should not need this constructor it's intended for low-level usage.
     */
    public btGImpactQuantizedBvh(long cPtr, boolean cMemoryOwn) {
        this("btGImpactQuantizedBvh", cPtr, cMemoryOwn);
        construct();
    }

    public btGImpactQuantizedBvh() {
        this(CollisionJNI.new_btGImpactQuantizedBvh__SWIG_0(), true);
    }

    public btGImpactQuantizedBvh(btPrimitiveManagerBase primitive_manager) {
        this(CollisionJNI.new_btGImpactQuantizedBvh__SWIG_1(btPrimitiveManagerBase.getCPtr(primitive_manager), primitive_manager),
                true);
    }

    public static long getCPtr(btGImpactQuantizedBvh obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    public static void find_collision(btGImpactQuantizedBvh boxset1, Matrix4 trans1, btGImpactQuantizedBvh boxset2,
                                      Matrix4 trans2, btPairSet collision_pairs) {
        CollisionJNI.btGImpactQuantizedBvh_find_collision(btGImpactQuantizedBvh.getCPtr(boxset1), boxset1, trans1,
                btGImpactQuantizedBvh.getCPtr(boxset2), boxset2, trans2, btPairSet.getCPtr(collision_pairs), collision_pairs);
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
                CollisionJNI.delete_btGImpactQuantizedBvh(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btAABB getGlobalBox() {
        return new btAABB(CollisionJNI.btGImpactQuantizedBvh_getGlobalBox(swigCPtr, this), true);
    }

    public btPrimitiveManagerBase getPrimitiveManager() {
        long cPtr = CollisionJNI.btGImpactQuantizedBvh_getPrimitiveManager(swigCPtr, this);
        return (cPtr == 0) ? null : new btPrimitiveManagerBase(cPtr, false);
    }

    public void setPrimitiveManager(btPrimitiveManagerBase primitive_manager) {
        CollisionJNI.btGImpactQuantizedBvh_setPrimitiveManager(swigCPtr, this, btPrimitiveManagerBase.getCPtr(primitive_manager),
                primitive_manager);
    }

    public void update() {
        CollisionJNI.btGImpactQuantizedBvh_update(swigCPtr, this);
    }

    public void buildSet() {
        CollisionJNI.btGImpactQuantizedBvh_buildSet(swigCPtr, this);
    }

    public boolean boxQuery(btAABB box, SWIGTYPE_p_btAlignedObjectArrayT_int_t collided_results) {
        return CollisionJNI.btGImpactQuantizedBvh_boxQuery(swigCPtr, this, btAABB.getCPtr(box), box,
                SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(collided_results));
    }

    public boolean boxQueryTrans(btAABB box, Matrix4 transform, SWIGTYPE_p_btAlignedObjectArrayT_int_t collided_results) {
        return CollisionJNI.btGImpactQuantizedBvh_boxQueryTrans(swigCPtr, this, btAABB.getCPtr(box), box, transform,
                SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(collided_results));
    }

    public boolean rayQuery(Vector3 ray_dir, Vector3 ray_origin, SWIGTYPE_p_btAlignedObjectArrayT_int_t collided_results) {
        return CollisionJNI.btGImpactQuantizedBvh_rayQuery(swigCPtr, this, ray_dir, ray_origin,
                SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(collided_results));
    }

    public boolean hasHierarchy() {
        return CollisionJNI.btGImpactQuantizedBvh_hasHierarchy(swigCPtr, this);
    }

    public boolean isTrimesh() {
        return CollisionJNI.btGImpactQuantizedBvh_isTrimesh(swigCPtr, this);
    }

    public int getNodeCount() {
        return CollisionJNI.btGImpactQuantizedBvh_getNodeCount(swigCPtr, this);
    }

    public boolean isLeafNode(int nodeindex) {
        return CollisionJNI.btGImpactQuantizedBvh_isLeafNode(swigCPtr, this, nodeindex);
    }

    public int getNodeData(int nodeindex) {
        return CollisionJNI.btGImpactQuantizedBvh_getNodeData(swigCPtr, this, nodeindex);
    }

    public void getNodeBound(int nodeindex, btAABB bound) {
        CollisionJNI.btGImpactQuantizedBvh_getNodeBound(swigCPtr, this, nodeindex, btAABB.getCPtr(bound), bound);
    }

    public void setNodeBound(int nodeindex, btAABB bound) {
        CollisionJNI.btGImpactQuantizedBvh_setNodeBound(swigCPtr, this, nodeindex, btAABB.getCPtr(bound), bound);
    }

    public int getLeftNode(int nodeindex) {
        return CollisionJNI.btGImpactQuantizedBvh_getLeftNode(swigCPtr, this, nodeindex);
    }

    public int getRightNode(int nodeindex) {
        return CollisionJNI.btGImpactQuantizedBvh_getRightNode(swigCPtr, this, nodeindex);
    }

    public int getEscapeNodeIndex(int nodeindex) {
        return CollisionJNI.btGImpactQuantizedBvh_getEscapeNodeIndex(swigCPtr, this, nodeindex);
    }

    public void getNodeTriangle(int nodeindex, btPrimitiveTriangle triangle) {
        CollisionJNI.btGImpactQuantizedBvh_getNodeTriangle(swigCPtr, this, nodeindex, btPrimitiveTriangle.getCPtr(triangle),
                triangle);
    }

    public BT_QUANTIZED_BVH_NODE get_node_pointer(int index) {
        long cPtr = CollisionJNI.btGImpactQuantizedBvh_get_node_pointer__SWIG_0(swigCPtr, this, index);
        return (cPtr == 0) ? null : new BT_QUANTIZED_BVH_NODE(cPtr, false);
    }

    public BT_QUANTIZED_BVH_NODE get_node_pointer() {
        long cPtr = CollisionJNI.btGImpactQuantizedBvh_get_node_pointer__SWIG_1(swigCPtr, this);
        return (cPtr == 0) ? null : new BT_QUANTIZED_BVH_NODE(cPtr, false);
    }

}
