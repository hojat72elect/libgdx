/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Collision implements CollisionConstants {

	/** Temporary Vector3 instance, used by native methods that return a Vector3 instance */
	public final static Vector3 staticVector3 = new Vector3();
	/** Pool of Vector3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
		@Override
		protected Vector3 newObject() {
			return new Vector3();
		}
	};


	/** Temporary Quaternion instance, used by native methods that return a Quaternion instance */
	public final static Quaternion staticQuaternion = new Quaternion();
	/** Pool of Quaternion, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
		@Override
		protected Quaternion newObject() {
			return new Quaternion();
		}
	};


	/** Temporary Matrix3 instance, used by native methods that return a Matrix3 instance */
	public final static Matrix3 staticMatrix3 = new Matrix3();
	/** Pool of Matrix3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
		@Override
		protected Matrix3 newObject() {
			return new Matrix3();
		}
	};


	/** Temporary Matrix4 instance, used by native methods that return a Matrix4 instance */
	public final static Matrix4 staticMatrix4 = new Matrix4();
	/** Pool of Matrix4, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
		@Override
		protected Matrix4 newObject() {
			return new Matrix4();
		}
	};

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

  public static void setGOverlappingPairs(int value) {
    CollisionJNI.gOverlappingPairs_set(value);
  }

  public static int getGOverlappingPairs() {
    return CollisionJNI.gOverlappingPairs_get();
  }

  public static void setGRemovePairs(int value) {
    CollisionJNI.gRemovePairs_set(value);
  }

  public static int getGRemovePairs() {
    return CollisionJNI.gRemovePairs_get();
  }

  public static void setGAddedPairs(int value) {
    CollisionJNI.gAddedPairs_set(value);
  }

  public static int getGAddedPairs() {
    return CollisionJNI.gAddedPairs_get();
  }

  public static void setGFindPairs(int value) {
    CollisionJNI.gFindPairs_set(value);
  }

  public static int getGFindPairs() {
    return CollisionJNI.gFindPairs_get();
  }

  public static int getBT_NULL_PAIR() {
    return CollisionJNI.BT_NULL_PAIR_get();
  }

  public static boolean gdxCheckFilter(int filter, int flag) {
    return CollisionJNI.gdxCheckFilter__SWIG_0(filter, flag);
  }

  public static boolean gdxCheckFilter(btCollisionObject colObj0, btCollisionObject colObj1) {
    return CollisionJNI.gdxCheckFilter__SWIG_1(btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public static void setGCompoundCompoundChildShapePairCallback(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool value) {
    CollisionJNI.gCompoundCompoundChildShapePairCallback_set(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool getGCompoundCompoundChildShapePairCallback() {
    long cPtr = CollisionJNI.gCompoundCompoundChildShapePairCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool(cPtr, false);
  }

  public static void setGContactAddedCallback(SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool value) {
    CollisionJNI.gContactAddedCallback_set(SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool getGContactAddedCallback() {
    long cPtr = CollisionJNI.gContactAddedCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool(cPtr, false);
  }

  public static int getBT_SIMPLE_NULL_PAIR() {
    return CollisionJNI.BT_SIMPLE_NULL_PAIR_get();
  }

  public static void setGOverlappingSimplePairs(int value) {
    CollisionJNI.gOverlappingSimplePairs_set(value);
  }

  public static int getGOverlappingSimplePairs() {
    return CollisionJNI.gOverlappingSimplePairs_get();
  }

  public static void setGRemoveSimplePairs(int value) {
    CollisionJNI.gRemoveSimplePairs_set(value);
  }

  public static int getGRemoveSimplePairs() {
    return CollisionJNI.gRemoveSimplePairs_get();
  }

  public static void setGAddedSimplePairs(int value) {
    CollisionJNI.gAddedSimplePairs_set(value);
  }

  public static int getGAddedSimplePairs() {
    return CollisionJNI.gAddedSimplePairs_get();
  }

  public static void setGFindSimplePairs(int value) {
    CollisionJNI.gFindSimplePairs_set(value);
  }

  public static int getGFindSimplePairs() {
    return CollisionJNI.gFindSimplePairs_get();
  }

  public static void btGenerateInternalEdgeInfo(btBvhTriangleMeshShape trimeshShape, btTriangleInfoMap triangleInfoMap) {
    CollisionJNI.btGenerateInternalEdgeInfo(btBvhTriangleMeshShape.getCPtr(trimeshShape), trimeshShape, btTriangleInfoMap.getCPtr(triangleInfoMap), triangleInfoMap);
  }

  public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap, btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0, int normalAdjustFlags) {
    CollisionJNI.btAdjustInternalEdgeContacts__SWIG_0(btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap, btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0, normalAdjustFlags);
  }

  public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap, btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0) {
    CollisionJNI.btAdjustInternalEdgeContacts__SWIG_1(btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap, btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0);
  }

  public static void setGCompoundChildShapePairCallback(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool value) {
    CollisionJNI.gCompoundChildShapePairCallback_set(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool getGCompoundChildShapePairCallback() {
    long cPtr = CollisionJNI.gCompoundChildShapePairCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool(cPtr, false);
  }

  public static void setGContactBreakingThreshold(float value) {
    CollisionJNI.gContactBreakingThreshold_set(value);
  }

  public static float getGContactBreakingThreshold() {
    return CollisionJNI.gContactBreakingThreshold_get();
  }

  public static void bt_calc_quantization_parameters(Vector3 outMinBound, Vector3 outMaxBound, Vector3 bvhQuantization, Vector3 srcMinBound, Vector3 srcMaxBound, float quantizationMargin) {
    CollisionJNI.bt_calc_quantization_parameters(outMinBound, outMaxBound, bvhQuantization, srcMinBound, srcMaxBound, quantizationMargin);
  }

  public static void bt_quantize_clamp(java.nio.IntBuffer out, Vector3 point, Vector3 min_bound, Vector3 max_bound, Vector3 bvhQuantization) {
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

  public static void bt_plane_clip_polygon_collect(Vector3 point0, Vector3 point1, float dist0, float dist1, btVector3 clipped, SWIGTYPE_p_int clipped_count) {
    CollisionJNI.bt_plane_clip_polygon_collect(point0, point1, dist0, dist1, btVector3.getCPtr(clipped), clipped, SWIGTYPE_p_int.getCPtr(clipped_count));
  }

  public static int bt_plane_clip_polygon(btVector4 plane, btVector3 polygon_points, int polygon_point_count, btVector3 clipped) {
    return CollisionJNI.bt_plane_clip_polygon(btVector4.getCPtr(plane), plane, btVector3.getCPtr(polygon_points), polygon_points, polygon_point_count, btVector3.getCPtr(clipped), clipped);
  }

  public static int bt_plane_clip_triangle(btVector4 plane, Vector3 point0, Vector3 point1, Vector3 point2, btVector3 clipped) {
    return CollisionJNI.bt_plane_clip_triangle(btVector4.getCPtr(plane), plane, point0, point1, point2, btVector3.getCPtr(clipped), clipped);
  }

  public static void bt_edge_plane(Vector3 e1, Vector3 e2, Vector3 normal, btVector4 plane) {
    CollisionJNI.bt_edge_plane(e1, e2, normal, btVector4.getCPtr(plane), plane);
  }

  public static void bt_closest_point_on_segment(Vector3 cp, Vector3 v, Vector3 e1, Vector3 e2) {
    CollisionJNI.bt_closest_point_on_segment(cp, v, e1, e2);
  }

  public static int bt_line_plane_collision(btVector4 plane, Vector3 vDir, Vector3 vPoint, Vector3 pout, SWIGTYPE_p_float tparam, float tmin, float tmax) {
    return CollisionJNI.bt_line_plane_collision(btVector4.getCPtr(plane), plane, vDir, vPoint, pout, SWIGTYPE_p_float.getCPtr(tparam), tmin, tmax);
  }

  public static void bt_segment_collision(Vector3 vA1, Vector3 vA2, Vector3 vB1, Vector3 vB2, Vector3 vPointA, Vector3 vPointB) {
    CollisionJNI.bt_segment_collision(vA1, vA2, vB1, vB2, vPointA, vPointB);
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

}