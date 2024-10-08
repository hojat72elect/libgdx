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

public class gim_contact_array extends gim_contact_array_internal {
    private long swigCPtr;

    protected gim_contact_array(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.gim_contact_array_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new gim_contact_array, normally you should not need this constructor it's intended for low-level usage.
     */
    public gim_contact_array(long cPtr, boolean cMemoryOwn) {
        this("gim_contact_array", cPtr, cMemoryOwn);
        construct();
    }

    public gim_contact_array() {
        this(CollisionJNI.new_gim_contact_array(), true);
    }

    public static long getCPtr(gim_contact_array obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.gim_contact_array_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_gim_contact_array(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void push_contact(Vector3 point, Vector3 normal, SWIGTYPE_p_GREAL depth, SWIGTYPE_p_GUINT feature1,
                             SWIGTYPE_p_GUINT feature2) {
        CollisionJNI.gim_contact_array_push_contact(swigCPtr, this, point, normal, SWIGTYPE_p_GREAL.getCPtr(depth),
                SWIGTYPE_p_GUINT.getCPtr(feature1), SWIGTYPE_p_GUINT.getCPtr(feature2));
    }

    public void push_triangle_contacts(GIM_TRIANGLE_CONTACT_DATA tricontact, SWIGTYPE_p_GUINT feature1,
                                       SWIGTYPE_p_GUINT feature2) {
        CollisionJNI.gim_contact_array_push_triangle_contacts(swigCPtr, this, GIM_TRIANGLE_CONTACT_DATA.getCPtr(tricontact),
                tricontact, SWIGTYPE_p_GUINT.getCPtr(feature1), SWIGTYPE_p_GUINT.getCPtr(feature2));
    }

    public void merge_contacts(gim_contact_array contacts, boolean normal_contact_average) {
        CollisionJNI.gim_contact_array_merge_contacts__SWIG_0(swigCPtr, this, gim_contact_array.getCPtr(contacts), contacts,
                normal_contact_average);
    }

    public void merge_contacts(gim_contact_array contacts) {
        CollisionJNI.gim_contact_array_merge_contacts__SWIG_1(swigCPtr, this, gim_contact_array.getCPtr(contacts), contacts);
    }

    public void merge_contacts_unique(gim_contact_array contacts) {
        CollisionJNI.gim_contact_array_merge_contacts_unique(swigCPtr, this, gim_contact_array.getCPtr(contacts), contacts);
    }

}
