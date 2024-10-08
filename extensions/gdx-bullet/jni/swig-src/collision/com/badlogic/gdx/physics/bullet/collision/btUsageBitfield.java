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

public class btUsageBitfield extends BulletBase {
    private long swigCPtr;

    protected btUsageBitfield(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btUsageBitfield, normally you should not need this constructor it's intended for low-level usage.
     */
    public btUsageBitfield(long cPtr, boolean cMemoryOwn) {
        this("btUsageBitfield", cPtr, cMemoryOwn);
        construct();
    }

    public btUsageBitfield() {
        this(CollisionJNI.new_btUsageBitfield(), true);
    }

    public static long getCPtr(btUsageBitfield obj) {
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
                CollisionJNI.delete_btUsageBitfield(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void reset() {
        CollisionJNI.btUsageBitfield_reset(swigCPtr, this);
    }

    public int getUsedVertexA() {
        return CollisionJNI.btUsageBitfield_usedVertexA_get(swigCPtr, this);
    }

    public void setUsedVertexA(int value) {
        CollisionJNI.btUsageBitfield_usedVertexA_set(swigCPtr, this, value);
    }

    public int getUsedVertexB() {
        return CollisionJNI.btUsageBitfield_usedVertexB_get(swigCPtr, this);
    }

    public void setUsedVertexB(int value) {
        CollisionJNI.btUsageBitfield_usedVertexB_set(swigCPtr, this, value);
    }

    public int getUsedVertexC() {
        return CollisionJNI.btUsageBitfield_usedVertexC_get(swigCPtr, this);
    }

    public void setUsedVertexC(int value) {
        CollisionJNI.btUsageBitfield_usedVertexC_set(swigCPtr, this, value);
    }

    public int getUsedVertexD() {
        return CollisionJNI.btUsageBitfield_usedVertexD_get(swigCPtr, this);
    }

    public void setUsedVertexD(int value) {
        CollisionJNI.btUsageBitfield_usedVertexD_set(swigCPtr, this, value);
    }

    public int getUnused1() {
        return CollisionJNI.btUsageBitfield_unused1_get(swigCPtr, this);
    }

    public void setUnused1(int value) {
        CollisionJNI.btUsageBitfield_unused1_set(swigCPtr, this, value);
    }

    public int getUnused2() {
        return CollisionJNI.btUsageBitfield_unused2_get(swigCPtr, this);
    }

    public void setUnused2(int value) {
        CollisionJNI.btUsageBitfield_unused2_set(swigCPtr, this, value);
    }

    public int getUnused3() {
        return CollisionJNI.btUsageBitfield_unused3_get(swigCPtr, this);
    }

    public void setUnused3(int value) {
        CollisionJNI.btUsageBitfield_unused3_set(swigCPtr, this, value);
    }

    public int getUnused4() {
        return CollisionJNI.btUsageBitfield_unused4_get(swigCPtr, this);
    }

    public void setUnused4(int value) {
        CollisionJNI.btUsageBitfield_unused4_set(swigCPtr, this, value);
    }

}
