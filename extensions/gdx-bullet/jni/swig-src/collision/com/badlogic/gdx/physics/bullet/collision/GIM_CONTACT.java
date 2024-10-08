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

public class GIM_CONTACT extends BulletBase {
    private long swigCPtr;

    protected GIM_CONTACT(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new GIM_CONTACT, normally you should not need this constructor it's intended for low-level usage.
     */
    public GIM_CONTACT(long cPtr, boolean cMemoryOwn) {
        this("GIM_CONTACT", cPtr, cMemoryOwn);
        construct();
    }

    public GIM_CONTACT() {
        this(CollisionJNI.new_GIM_CONTACT__SWIG_0(), true);
    }

    public GIM_CONTACT(GIM_CONTACT contact) {
        this(CollisionJNI.new_GIM_CONTACT__SWIG_1(GIM_CONTACT.getCPtr(contact), contact), true);
    }

    public GIM_CONTACT(Vector3 point, Vector3 normal, float depth, int feature1, int feature2) {
        this(CollisionJNI.new_GIM_CONTACT__SWIG_2(point, normal, depth, feature1, feature2), true);
    }

    public static long getCPtr(GIM_CONTACT obj) {
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
                CollisionJNI.delete_GIM_CONTACT(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btVector3 getPoint() {
        long cPtr = CollisionJNI.GIM_CONTACT_point_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setPoint(btVector3 value) {
        CollisionJNI.GIM_CONTACT_point_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public btVector3 getNormal() {
        long cPtr = CollisionJNI.GIM_CONTACT_normal_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }

    public void setNormal(btVector3 value) {
        CollisionJNI.GIM_CONTACT_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }

    public float getDepth() {
        return CollisionJNI.GIM_CONTACT_depth_get(swigCPtr, this);
    }

    public void setDepth(float value) {
        CollisionJNI.GIM_CONTACT_depth_set(swigCPtr, this, value);
    }

    public float getDistance() {
        return CollisionJNI.GIM_CONTACT_distance_get(swigCPtr, this);
    }

    public void setDistance(float value) {
        CollisionJNI.GIM_CONTACT_distance_set(swigCPtr, this, value);
    }

    public int getFeature1() {
        return CollisionJNI.GIM_CONTACT_feature1_get(swigCPtr, this);
    }

    public void setFeature1(int value) {
        CollisionJNI.GIM_CONTACT_feature1_set(swigCPtr, this, value);
    }

    public int getFeature2() {
        return CollisionJNI.GIM_CONTACT_feature2_get(swigCPtr, this);
    }

    public void setFeature2(int value) {
        CollisionJNI.GIM_CONTACT_feature2_set(swigCPtr, this, value);
    }

    public long calc_key_contact() {
        return CollisionJNI.GIM_CONTACT_calc_key_contact(swigCPtr, this);
    }

    public void interpolate_normals(btVector3 normals, int normal_count) {
        CollisionJNI.GIM_CONTACT_interpolate_normals(swigCPtr, this, btVector3.getCPtr(normals), normals, normal_count);
    }

}
