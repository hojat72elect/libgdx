/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btPointerUid extends BulletBase {
    private long swigCPtr;

    protected btPointerUid(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btPointerUid, normally you should not need this constructor it's intended for low-level usage.
     */
    public btPointerUid(long cPtr, boolean cMemoryOwn) {
        this("btPointerUid", cPtr, cMemoryOwn);
        construct();
    }

    public btPointerUid() {
        this(LinearMathJNI.new_btPointerUid(), true);
    }

    public static long getCPtr(btPointerUid obj) {
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
                LinearMathJNI.delete_btPointerUid(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long getPtr() {
        return LinearMathJNI.btPointerUid_ptr_get(swigCPtr, this);
    }

    public void setPtr(long value) {
        LinearMathJNI.btPointerUid_ptr_set(swigCPtr, this, value);
    }

    public int[] getUniqueIds() {
        return LinearMathJNI.btPointerUid_uniqueIds_get(swigCPtr, this);
    }

    public void setUniqueIds(int[] value) {
        LinearMathJNI.btPointerUid_uniqueIds_set(swigCPtr, this, value);
    }

}
