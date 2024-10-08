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

public class btShortIntIndexData extends BulletBase {
    private long swigCPtr;

    protected btShortIntIndexData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btShortIntIndexData, normally you should not need this constructor it's intended for low-level usage.
     */
    public btShortIntIndexData(long cPtr, boolean cMemoryOwn) {
        this("btShortIntIndexData", cPtr, cMemoryOwn);
        construct();
    }

    public btShortIntIndexData() {
        this(CollisionJNI.new_btShortIntIndexData(), true);
    }

    public static long getCPtr(btShortIntIndexData obj) {
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
                CollisionJNI.delete_btShortIntIndexData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public short getValue() {
        return CollisionJNI.btShortIntIndexData_value_get(swigCPtr, this);
    }

    public void setValue(short value) {
        CollisionJNI.btShortIntIndexData_value_set(swigCPtr, this, value);
    }

    public String getPad() {
        return CollisionJNI.btShortIntIndexData_pad_get(swigCPtr, this);
    }

    public void setPad(String value) {
        CollisionJNI.btShortIntIndexData_pad_set(swigCPtr, this, value);
    }

}
