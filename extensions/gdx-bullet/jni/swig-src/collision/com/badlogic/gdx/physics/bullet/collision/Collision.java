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
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Collision implements CollisionConstants {

    /**
     * Temporary Vector3 instance, used by native methods that return a Vector3 instance
     */
    public final static Vector3 staticVector3 = new Vector3();
    /**
     * Pool of Vector3, used by native (callback) method for the arguments
     */
    public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
        @Override
        protected Vector3 newObject() {
            return new Vector3();
        }
    };

    /**
     * Temporary Quaternion instance, used by native methods that return a Quaternion instance
     */
    public final static Quaternion staticQuaternion = new Quaternion();
    /**
     * Pool of Quaternion, used by native (callback) method for the arguments
     */
    public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
        @Override
        protected Quaternion newObject() {
            return new Quaternion();
        }
    };

    /**
     * Temporary Matrix3 instance, used by native methods that return a Matrix3 instance
     */
    public final static Matrix3 staticMatrix3 = new Matrix3();
    /**
     * Pool of Matrix3, used by native (callback) method for the arguments
     */
    public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
        @Override
        protected Matrix3 newObject() {
            return new Matrix3();
        }
    };

    /**
     * Temporary Matrix4 instance, used by native methods that return a Matrix4 instance
     */
    public final static Matrix4 staticMatrix4 = new Matrix4();
    /**
     * Pool of Matrix4, used by native (callback) method for the arguments
     */
    public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
        @Override
        protected Matrix4 newObject() {
            return new Matrix4();
        }
    };

    public static boolean operatorEqualTo(btBroadphasePair a, btBroadphasePair b) {
        return CollisionJNI.operatorEqualTo__SWIG_3(a, b);
    }

    public static int getGOverlappingPairs() {
        return CollisionJNI.gOverlappingPairs_get();
    }

    public static void setGOverlappingPairs(int value) {
        CollisionJNI.gOverlappingPairs_set(value);
    }

    public static int getGRemovePairs() {
        return CollisionJNI.gRemovePairs_get();
    }

    public static void setGRemovePairs(int value) {
        CollisionJNI.gRemovePairs_set(value);
    }

    public static int getGAddedPairs() {
        return CollisionJNI.gAddedPairs_get();
    }

    public static void setGAddedPairs(int value) {
        CollisionJNI.gAddedPairs_set(value);
    }

    public static int getGFindPairs() {
        return CollisionJNI.gFindPairs_get();
    }

    public static void setGFindPairs(int value) {
        CollisionJNI.gFindPairs_set(value);
    }

    public static int getBT_NULL_PAIR() {
        return CollisionJNI.BT_NULL_PAIR_get();
    }

    public static boolean gdxCheckFilter(int filter, int flag) {
        return CollisionJNI.gdxCheckFilter__SWIG_0(filter, flag);
    }

    public static boolean gdxCheckFilter(btCollisionObject colObj0, btCollisionObject colObj1) {
        return CollisionJNI.gdxCheckFilter__SWIG_1(btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1),
                colObj1);
    }

    public static boolean Intersect(btDbvtAabbMm a, btDbvtAabbMm b) {
        return CollisionJNI.Intersect__SWIG_0(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
    }

    public static boolean Intersect(btDbvtAabbMm a, Vector3 b) {
        return CollisionJNI.Intersect__SWIG_1(btDbvtAabbMm.getCPtr(a), a, b);
    }

    public static float Proximity(btDbvtAabbMm a, btDbvtAabbMm b) {
        return CollisionJNI.Proximity(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
    }

    public static int Select(btDbvtAabbMm o, btDbvtAabbMm a, btDbvtAabbMm b) {
        return CollisionJNI.Select(btDbvtAabbMm.getCPtr(o), o, btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
    }

    public static void Merge(btDbvtAabbMm a, btDbvtAabbMm b, btDbvtAabbMm r) {
        CollisionJNI.Merge(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b, btDbvtAabbMm.getCPtr(r), r);
    }

    public static boolean NotEqual(btDbvtAabbMm a, btDbvtAabbMm b) {
        return CollisionJNI.NotEqual(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
    }

    public static boolean operatorEqualTo(btCompoundShapeChild c1, btCompoundShapeChild c2) {
        return CollisionJNI.operatorEqualTo__SWIG_4(btCompoundShapeChild.getCPtr(c1), c1, btCompoundShapeChild.getCPtr(c2), c2);
    }

    public static SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool getGCompoundChildShapePairCallback() {
        long cPtr = CollisionJNI.gCompoundChildShapePairCallback_get();
        return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool(cPtr, false);
    }

    public static void setGCompoundChildShapePairCallback(
            SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool value) {
        CollisionJNI.gCompoundChildShapePairCallback_set(
                SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool.getCPtr(value));
    }

    public static SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool getGContactAddedCallback() {
        long cPtr = CollisionJNI.gContactAddedCallback_get();
        return (cPtr == 0) ? null
                : new SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool(
                cPtr, false);
    }

    public static void setGContactAddedCallback(
            SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool value) {
        CollisionJNI.gContactAddedCallback_set(
                SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool
                        .getCPtr(value));
    }

    public static int getBT_SIMPLE_NULL_PAIR() {
        return CollisionJNI.BT_SIMPLE_NULL_PAIR_get();
    }

    public static int getGOverlappingSimplePairs() {
        return CollisionJNI.gOverlappingSimplePairs_get();
    }

    public static void setGOverlappingSimplePairs(int value) {
        CollisionJNI.gOverlappingSimplePairs_set(value);
    }

    public static int getGRemoveSimplePairs() {
        return CollisionJNI.gRemoveSimplePairs_get();
    }

    public static void setGRemoveSimplePairs(int value) {
        CollisionJNI.gRemoveSimplePairs_set(value);
    }

    public static int getGAddedSimplePairs() {
        return CollisionJNI.gAddedSimplePairs_get();
    }

    public static void setGAddedSimplePairs(int value) {
        CollisionJNI.gAddedSimplePairs_set(value);
    }

    public static int getGFindSimplePairs() {
        return CollisionJNI.gFindSimplePairs_get();
    }

    public static void setGFindSimplePairs(int value) {
        CollisionJNI.gFindSimplePairs_set(value);
    }

    public static void btGenerateInternalEdgeInfo(btBvhTriangleMeshShape trimeshShape, btTriangleInfoMap triangleInfoMap) {
        CollisionJNI.btGenerateInternalEdgeInfo(btBvhTriangleMeshShape.getCPtr(trimeshShape), trimeshShape,
                btTriangleInfoMap.getCPtr(triangleInfoMap), triangleInfoMap);
    }

    public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap,
                                                    btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0, int normalAdjustFlags) {
        CollisionJNI.btAdjustInternalEdgeContacts__SWIG_0(btManifoldPoint.getCPtr(cp), cp,
                btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap,
                btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0, normalAdjustFlags);
    }

    public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap,
                                                    btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0) {
        CollisionJNI.btAdjustInternalEdgeContacts__SWIG_1(btManifoldPoint.getCPtr(cp), cp,
                btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap,
                btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0);
    }

    public static float getGContactBreakingThreshold() {
        return CollisionJNI.gContactBreakingThreshold_get();
    }

    public static void setGContactBreakingThreshold(float value) {
        CollisionJNI.gContactBreakingThreshold_set(value);
    }

    public static void bt_calc_quantization_parameters(Vector3 outMinBound, Vector3 outMaxBound, Vector3 bvhQuantization,
                                                       Vector3 srcMinBound, Vector3 srcMaxBound, float quantizationMargin) {
        CollisionJNI.bt_calc_quantization_parameters(outMinBound, outMaxBound, bvhQuantization, srcMinBound, srcMaxBound,
                quantizationMargin);
    }

    public static void bt_quantize_clamp(java.nio.IntBuffer out, Vector3 point, Vector3 min_bound, Vector3 max_bound,
                                         Vector3 bvhQuantization) {
        assert out.isDirect() : "Buffer must be allocated direct.";
        {
            CollisionJNI.bt_quantize_clamp(out, point, min_bound, max_bound, bvhQuantization);
        }
    }

    public static Vector3 bt_unquantize(java.nio.IntBuffer vecIn, Vector3 offset, Vector3 bvhQuantization) {
        assert vecIn.isDirect() : "Buffer must be allocated direct.";
        {
            return CollisionJNI.bt_unquantize(vecIn, offset, bvhQuantization);
        }
    }

    public static float bt_mat3_dot_col(Matrix3 mat, Vector3 vec3, int colindex) {
        return CollisionJNI.bt_mat3_dot_col(mat, vec3, colindex);
    }

    public static boolean btCompareTransformsEqual(Matrix4 t1, Matrix4 t2) {
        return CollisionJNI.btCompareTransformsEqual(t1, t2);
    }

    public static float bt_distance_point_plane(btVector4 plane, Vector3 point) {
        return CollisionJNI.bt_distance_point_plane(btVector4.getCPtr(plane), plane, point);
    }

    public static void bt_vec_blend(Vector3 vr, Vector3 va, Vector3 vb, float blend_factor) {
        CollisionJNI.bt_vec_blend(vr, va, vb, blend_factor);
    }

    public static void bt_plane_clip_polygon_collect(Vector3 point0, Vector3 point1, float dist0, float dist1, btVector3 clipped,
                                                     SWIGTYPE_p_int clipped_count) {
        CollisionJNI.bt_plane_clip_polygon_collect(point0, point1, dist0, dist1, btVector3.getCPtr(clipped), clipped,
                SWIGTYPE_p_int.getCPtr(clipped_count));
    }

    public static int bt_plane_clip_polygon(btVector4 plane, btVector3 polygon_points, int polygon_point_count,
                                            btVector3 clipped) {
        return CollisionJNI.bt_plane_clip_polygon(btVector4.getCPtr(plane), plane, btVector3.getCPtr(polygon_points),
                polygon_points, polygon_point_count, btVector3.getCPtr(clipped), clipped);
    }

    public static int bt_plane_clip_triangle(btVector4 plane, Vector3 point0, Vector3 point1, Vector3 point2, btVector3 clipped) {
        return CollisionJNI.bt_plane_clip_triangle(btVector4.getCPtr(plane), plane, point0, point1, point2,
                btVector3.getCPtr(clipped), clipped);
    }

    public static void bt_edge_plane(Vector3 e1, Vector3 e2, Vector3 normal, btVector4 plane) {
        CollisionJNI.bt_edge_plane(e1, e2, normal, btVector4.getCPtr(plane), plane);
    }

    public static void bt_closest_point_on_segment(Vector3 cp, Vector3 v, Vector3 e1, Vector3 e2) {
        CollisionJNI.bt_closest_point_on_segment(cp, v, e1, e2);
    }

    public static int bt_line_plane_collision(btVector4 plane, Vector3 vDir, Vector3 vPoint, Vector3 pout,
                                              SWIGTYPE_p_float tparam, float tmin, float tmax) {
        return CollisionJNI.bt_line_plane_collision(btVector4.getCPtr(plane), plane, vDir, vPoint, pout,
                SWIGTYPE_p_float.getCPtr(tparam), tmin, tmax);
    }

    public static void bt_segment_collision(Vector3 vA1, Vector3 vA2, Vector3 vB1, Vector3 vB2, Vector3 vPointA,
                                            Vector3 vPointB) {
        CollisionJNI.bt_segment_collision(vA1, vA2, vB1, vB2, vPointA, vPointB);
    }

    public static btCompoundShape btCreateCompoundFromGimpactShape(btGImpactMeshShape gimpactMesh, float depth) {
        long cPtr = CollisionJNI.btCreateCompoundFromGimpactShape(btGImpactMeshShape.getCPtr(gimpactMesh), gimpactMesh, depth);
        return (cPtr == 0) ? null : new btCompoundShape(cPtr, false);
    }

    public static long btPoolAlloc(long size) {
        return CollisionJNI.btPoolAlloc(size);
    }

    public static long btPoolRealloc(long ptr, long oldsize, long newsize) {
        return CollisionJNI.btPoolRealloc(ptr, oldsize, newsize);
    }

    public static void btPoolFree(long ptr) {
        CollisionJNI.btPoolFree(ptr);
    }

    public static Vector3 gim_inertia_add_transformed(Vector3 source_inertia, Vector3 added_inertia, Matrix4 transform) {
        return CollisionJNI.gim_inertia_add_transformed(source_inertia, added_inertia, transform);
    }

    public static Vector3 gim_get_point_inertia(Vector3 point, float mass) {
        return CollisionJNI.gim_get_point_inertia(point, mass);
    }

    public static void gim_set_alloc_handler(SWIGTYPE_p_f_size_t__p_void fn) {
        CollisionJNI.gim_set_alloc_handler(SWIGTYPE_p_f_size_t__p_void.getCPtr(fn));
    }

    public static void gim_set_alloca_handler(SWIGTYPE_p_f_size_t__p_void fn) {
        CollisionJNI.gim_set_alloca_handler(SWIGTYPE_p_f_size_t__p_void.getCPtr(fn));
    }

    public static void gim_set_realloc_handler(SWIGTYPE_p_f_p_void_size_t_size_t__p_void fn) {
        CollisionJNI.gim_set_realloc_handler(SWIGTYPE_p_f_p_void_size_t_size_t__p_void.getCPtr(fn));
    }

    public static void gim_set_free_handler(SWIGTYPE_p_f_p_void__void fn) {
        CollisionJNI.gim_set_free_handler(SWIGTYPE_p_f_p_void__void.getCPtr(fn));
    }

    public static SWIGTYPE_p_f_size_t__p_void gim_get_alloc_handler() {
        long cPtr = CollisionJNI.gim_get_alloc_handler();
        return (cPtr == 0) ? null : new SWIGTYPE_p_f_size_t__p_void(cPtr, false);
    }

    public static SWIGTYPE_p_f_size_t__p_void gim_get_alloca_handler() {
        long cPtr = CollisionJNI.gim_get_alloca_handler();
        return (cPtr == 0) ? null : new SWIGTYPE_p_f_size_t__p_void(cPtr, false);
    }

    public static SWIGTYPE_p_f_p_void_size_t_size_t__p_void gim_get_realloc_handler() {
        long cPtr = CollisionJNI.gim_get_realloc_handler();
        return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_size_t_size_t__p_void(cPtr, false);
    }

    public static SWIGTYPE_p_f_p_void__void gim_get_free_handler() {
        long cPtr = CollisionJNI.gim_get_free_handler();
        return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__void(cPtr, false);
    }

    public static long gim_alloc(long size) {
        return CollisionJNI.gim_alloc(size);
    }

    public static long gim_alloca(long size) {
        return CollisionJNI.gim_alloca(size);
    }

    public static long gim_realloc(long ptr, long oldsize, long newsize) {
        return CollisionJNI.gim_realloc(ptr, oldsize, newsize);
    }

    public static void gim_free(long ptr) {
        CollisionJNI.gim_free(ptr);
    }

    public static void gim_simd_memcpy(long dst, long src, long copysize) {
        CollisionJNI.gim_simd_memcpy(dst, src, copysize);
    }

    public static SWIGTYPE_p_GUINT getGim_prime_list() {
        long cPtr = CollisionJNI.gim_prime_list_get();
        return (cPtr == 0) ? null : new SWIGTYPE_p_GUINT(cPtr, false);
    }

    public static SWIGTYPE_p_GUINT gim_next_prime(SWIGTYPE_p_GUINT number) {
        return new SWIGTYPE_p_GUINT(CollisionJNI.gim_next_prime(SWIGTYPE_p_GUINT.getCPtr(number)), true);
    }

    public static float gim_inv_sqrt(float f) {
        return CollisionJNI.gim_inv_sqrt(f);
    }

    public static float gim_sqrt(float f) {
        return CollisionJNI.gim_sqrt(f);
    }

    public static void gim_radix_sort_rtokens(GIM_RSORT_TOKEN array, GIM_RSORT_TOKEN sorted, long element_count) {
        CollisionJNI.gim_radix_sort_rtokens(GIM_RSORT_TOKEN.getCPtr(array), array, GIM_RSORT_TOKEN.getCPtr(sorted), sorted,
                element_count);
    }

    public static _btMprSupport_t btMprSimplexPointW(_btMprSimplex_t s, int idx) {
        long cPtr = CollisionJNI.btMprSimplexPointW(_btMprSimplex_t.getCPtr(s), s, idx);
        return (cPtr == 0) ? null : new _btMprSupport_t(cPtr, false);
    }

    public static void btMprSimplexSetSize(_btMprSimplex_t s, int size) {
        CollisionJNI.btMprSimplexSetSize(_btMprSimplex_t.getCPtr(s), s, size);
    }

    public static int btMprSimplexSize(_btMprSimplex_t s) {
        return CollisionJNI.btMprSimplexSize(_btMprSimplex_t.getCPtr(s), s);
    }

    public static _btMprSupport_t btMprSimplexPoint(_btMprSimplex_t s, int idx) {
        long cPtr = CollisionJNI.btMprSimplexPoint(_btMprSimplex_t.getCPtr(s), s, idx);
        return (cPtr == 0) ? null : new _btMprSupport_t(cPtr, false);
    }

    public static void btMprSupportCopy(_btMprSupport_t d, _btMprSupport_t s) {
        CollisionJNI.btMprSupportCopy(_btMprSupport_t.getCPtr(d), d, _btMprSupport_t.getCPtr(s), s);
    }

    public static void btMprSimplexSet(_btMprSimplex_t s, long pos, _btMprSupport_t a) {
        CollisionJNI.btMprSimplexSet(_btMprSimplex_t.getCPtr(s), s, pos, _btMprSupport_t.getCPtr(a), a);
    }

    public static void btMprSimplexSwap(_btMprSimplex_t s, long pos1, long pos2) {
        CollisionJNI.btMprSimplexSwap(_btMprSimplex_t.getCPtr(s), s, pos1, pos2);
    }

    public static int btMprIsZero(float val) {
        return CollisionJNI.btMprIsZero(val);
    }

    public static int btMprEq(float _a, float _b) {
        return CollisionJNI.btMprEq(_a, _b);
    }

    public static int btMprVec3Eq(btVector3 a, btVector3 b) {
        return CollisionJNI.btMprVec3Eq(btVector3.getCPtr(a), a, btVector3.getCPtr(b), b);
    }

    public static void btMprVec3Set(btVector3 v, float x, float y, float z) {
        CollisionJNI.btMprVec3Set(btVector3.getCPtr(v), v, x, y, z);
    }

    public static void btMprVec3Add(btVector3 v, btVector3 w) {
        CollisionJNI.btMprVec3Add(btVector3.getCPtr(v), v, btVector3.getCPtr(w), w);
    }

    public static void btMprVec3Copy(btVector3 v, btVector3 w) {
        CollisionJNI.btMprVec3Copy(btVector3.getCPtr(v), v, btVector3.getCPtr(w), w);
    }

    public static void btMprVec3Scale(btVector3 d, float k) {
        CollisionJNI.btMprVec3Scale(btVector3.getCPtr(d), d, k);
    }

    public static float btMprVec3Dot(btVector3 a, btVector3 b) {
        return CollisionJNI.btMprVec3Dot(btVector3.getCPtr(a), a, btVector3.getCPtr(b), b);
    }

    public static float btMprVec3Len2(btVector3 v) {
        return CollisionJNI.btMprVec3Len2(btVector3.getCPtr(v), v);
    }

    public static void btMprVec3Normalize(btVector3 d) {
        CollisionJNI.btMprVec3Normalize(btVector3.getCPtr(d), d);
    }

    public static void btMprVec3Cross(btVector3 d, btVector3 a, btVector3 b) {
        CollisionJNI.btMprVec3Cross(btVector3.getCPtr(d), d, btVector3.getCPtr(a), a, btVector3.getCPtr(b), b);
    }

    public static void btMprVec3Sub2(btVector3 d, btVector3 v, btVector3 w) {
        CollisionJNI.btMprVec3Sub2(btVector3.getCPtr(d), d, btVector3.getCPtr(v), v, btVector3.getCPtr(w), w);
    }

    public static void btPortalDir(_btMprSimplex_t portal, btVector3 dir) {
        CollisionJNI.btPortalDir(_btMprSimplex_t.getCPtr(portal), portal, btVector3.getCPtr(dir), dir);
    }

    public static int portalEncapsulesOrigin(_btMprSimplex_t portal, btVector3 dir) {
        return CollisionJNI.portalEncapsulesOrigin(_btMprSimplex_t.getCPtr(portal), portal, btVector3.getCPtr(dir), dir);
    }

    public static int portalReachTolerance(_btMprSimplex_t portal, _btMprSupport_t v4, btVector3 dir) {
        return CollisionJNI.portalReachTolerance(_btMprSimplex_t.getCPtr(portal), portal, _btMprSupport_t.getCPtr(v4), v4,
                btVector3.getCPtr(dir), dir);
    }

    public static int portalCanEncapsuleOrigin(_btMprSimplex_t portal, _btMprSupport_t v4, btVector3 dir) {
        return CollisionJNI.portalCanEncapsuleOrigin(_btMprSimplex_t.getCPtr(portal), portal, _btMprSupport_t.getCPtr(v4), v4,
                btVector3.getCPtr(dir), dir);
    }

    public static void btExpandPortal(_btMprSimplex_t portal, _btMprSupport_t v4) {
        CollisionJNI.btExpandPortal(_btMprSimplex_t.getCPtr(portal), portal, _btMprSupport_t.getCPtr(v4), v4);
    }

    public static void btFindPos(_btMprSimplex_t portal, btVector3 pos) {
        CollisionJNI.btFindPos(_btMprSimplex_t.getCPtr(portal), portal, btVector3.getCPtr(pos), pos);
    }

    public static float btMprVec3Dist2(btVector3 a, btVector3 b) {
        return CollisionJNI.btMprVec3Dist2(btVector3.getCPtr(a), a, btVector3.getCPtr(b), b);
    }

    public static float _btMprVec3PointSegmentDist2(btVector3 P, btVector3 x0, btVector3 b, btVector3 witness) {
        return CollisionJNI._btMprVec3PointSegmentDist2(btVector3.getCPtr(P), P, btVector3.getCPtr(x0), x0, btVector3.getCPtr(b), b,
                btVector3.getCPtr(witness), witness);
    }

    public static float btMprVec3PointTriDist2(btVector3 P, btVector3 x0, btVector3 B, btVector3 C, btVector3 witness) {
        return CollisionJNI.btMprVec3PointTriDist2(btVector3.getCPtr(P), P, btVector3.getCPtr(x0), x0, btVector3.getCPtr(B), B,
                btVector3.getCPtr(C), C, btVector3.getCPtr(witness), witness);
    }

    public static void btFindPenetrTouch(_btMprSimplex_t portal, java.nio.FloatBuffer depth, btVector3 dir, btVector3 pos) {
        assert depth.isDirect() : "Buffer must be allocated direct.";
        {
            CollisionJNI.btFindPenetrTouch(_btMprSimplex_t.getCPtr(portal), portal, depth, btVector3.getCPtr(dir), dir,
                    btVector3.getCPtr(pos), pos);
        }
    }

    public static void btFindPenetrSegment(_btMprSimplex_t portal, java.nio.FloatBuffer depth, btVector3 dir, btVector3 pos) {
        assert depth.isDirect() : "Buffer must be allocated direct.";
        {
            CollisionJNI.btFindPenetrSegment(_btMprSimplex_t.getCPtr(portal), portal, depth, btVector3.getCPtr(dir), dir,
                    btVector3.getCPtr(pos), pos);
        }
    }

}
