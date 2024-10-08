/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;

public class btMultiBodyJointFeedback extends BulletBase {
    private long swigCPtr;

    protected btMultiBodyJointFeedback(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btMultiBodyJointFeedback, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btMultiBodyJointFeedback(long cPtr, boolean cMemoryOwn) {
        this("btMultiBodyJointFeedback", cPtr, cMemoryOwn);
        construct();
    }

    public btMultiBodyJointFeedback() {
        this(DynamicsJNI.new_btMultiBodyJointFeedback(), true);
    }

    public static long getCPtr(btMultiBodyJointFeedback obj) {
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
                DynamicsJNI.delete_btMultiBodyJointFeedback(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btSpatialForceVector getReactionForces() {
        long cPtr = DynamicsJNI.btMultiBodyJointFeedback_reactionForces_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btSpatialForceVector(cPtr, false);
    }

    public void setReactionForces(btSpatialForceVector value) {
        DynamicsJNI.btMultiBodyJointFeedback_reactionForces_set(swigCPtr, this, btSpatialForceVector.getCPtr(value), value);
    }

}
