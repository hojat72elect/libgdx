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

public class btContactSolverInfoData extends BulletBase {
    private long swigCPtr;

    protected btContactSolverInfoData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btContactSolverInfoData, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btContactSolverInfoData(long cPtr, boolean cMemoryOwn) {
        this("btContactSolverInfoData", cPtr, cMemoryOwn);
        construct();
    }

    public btContactSolverInfoData() {
        this(DynamicsJNI.new_btContactSolverInfoData(), true);
    }

    public static long getCPtr(btContactSolverInfoData obj) {
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
                DynamicsJNI.delete_btContactSolverInfoData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public float getTau() {
        return DynamicsJNI.btContactSolverInfoData_tau_get(swigCPtr, this);
    }

    public void setTau(float value) {
        DynamicsJNI.btContactSolverInfoData_tau_set(swigCPtr, this, value);
    }

    public float getDamping() {
        return DynamicsJNI.btContactSolverInfoData_damping_get(swigCPtr, this);
    }

    public void setDamping(float value) {
        DynamicsJNI.btContactSolverInfoData_damping_set(swigCPtr, this, value);
    }

    public float getFriction() {
        return DynamicsJNI.btContactSolverInfoData_friction_get(swigCPtr, this);
    }

    public void setFriction(float value) {
        DynamicsJNI.btContactSolverInfoData_friction_set(swigCPtr, this, value);
    }

    public float getTimeStep() {
        return DynamicsJNI.btContactSolverInfoData_timeStep_get(swigCPtr, this);
    }

    public void setTimeStep(float value) {
        DynamicsJNI.btContactSolverInfoData_timeStep_set(swigCPtr, this, value);
    }

    public float getRestitution() {
        return DynamicsJNI.btContactSolverInfoData_restitution_get(swigCPtr, this);
    }

    public void setRestitution(float value) {
        DynamicsJNI.btContactSolverInfoData_restitution_set(swigCPtr, this, value);
    }

    public int getNumIterations() {
        return DynamicsJNI.btContactSolverInfoData_numIterations_get(swigCPtr, this);
    }

    public void setNumIterations(int value) {
        DynamicsJNI.btContactSolverInfoData_numIterations_set(swigCPtr, this, value);
    }

    public float getMaxErrorReduction() {
        return DynamicsJNI.btContactSolverInfoData_maxErrorReduction_get(swigCPtr, this);
    }

    public void setMaxErrorReduction(float value) {
        DynamicsJNI.btContactSolverInfoData_maxErrorReduction_set(swigCPtr, this, value);
    }

    public float getSor() {
        return DynamicsJNI.btContactSolverInfoData_sor_get(swigCPtr, this);
    }

    public void setSor(float value) {
        DynamicsJNI.btContactSolverInfoData_sor_set(swigCPtr, this, value);
    }

    public float getErp() {
        return DynamicsJNI.btContactSolverInfoData_erp_get(swigCPtr, this);
    }

    public void setErp(float value) {
        DynamicsJNI.btContactSolverInfoData_erp_set(swigCPtr, this, value);
    }

    public float getErp2() {
        return DynamicsJNI.btContactSolverInfoData_erp2_get(swigCPtr, this);
    }

    public void setErp2(float value) {
        DynamicsJNI.btContactSolverInfoData_erp2_set(swigCPtr, this, value);
    }

    public float getGlobalCfm() {
        return DynamicsJNI.btContactSolverInfoData_globalCfm_get(swigCPtr, this);
    }

    public void setGlobalCfm(float value) {
        DynamicsJNI.btContactSolverInfoData_globalCfm_set(swigCPtr, this, value);
    }

    public float getFrictionERP() {
        return DynamicsJNI.btContactSolverInfoData_frictionERP_get(swigCPtr, this);
    }

    public void setFrictionERP(float value) {
        DynamicsJNI.btContactSolverInfoData_frictionERP_set(swigCPtr, this, value);
    }

    public float getFrictionCFM() {
        return DynamicsJNI.btContactSolverInfoData_frictionCFM_get(swigCPtr, this);
    }

    public void setFrictionCFM(float value) {
        DynamicsJNI.btContactSolverInfoData_frictionCFM_set(swigCPtr, this, value);
    }

    public int getSplitImpulse() {
        return DynamicsJNI.btContactSolverInfoData_splitImpulse_get(swigCPtr, this);
    }

    public void setSplitImpulse(int value) {
        DynamicsJNI.btContactSolverInfoData_splitImpulse_set(swigCPtr, this, value);
    }

    public float getSplitImpulsePenetrationThreshold() {
        return DynamicsJNI.btContactSolverInfoData_splitImpulsePenetrationThreshold_get(swigCPtr, this);
    }

    public void setSplitImpulsePenetrationThreshold(float value) {
        DynamicsJNI.btContactSolverInfoData_splitImpulsePenetrationThreshold_set(swigCPtr, this, value);
    }

    public float getSplitImpulseTurnErp() {
        return DynamicsJNI.btContactSolverInfoData_splitImpulseTurnErp_get(swigCPtr, this);
    }

    public void setSplitImpulseTurnErp(float value) {
        DynamicsJNI.btContactSolverInfoData_splitImpulseTurnErp_set(swigCPtr, this, value);
    }

    public float getLinearSlop() {
        return DynamicsJNI.btContactSolverInfoData_linearSlop_get(swigCPtr, this);
    }

    public void setLinearSlop(float value) {
        DynamicsJNI.btContactSolverInfoData_linearSlop_set(swigCPtr, this, value);
    }

    public float getWarmstartingFactor() {
        return DynamicsJNI.btContactSolverInfoData_warmstartingFactor_get(swigCPtr, this);
    }

    public void setWarmstartingFactor(float value) {
        DynamicsJNI.btContactSolverInfoData_warmstartingFactor_set(swigCPtr, this, value);
    }

    public int getSolverMode() {
        return DynamicsJNI.btContactSolverInfoData_solverMode_get(swigCPtr, this);
    }

    public void setSolverMode(int value) {
        DynamicsJNI.btContactSolverInfoData_solverMode_set(swigCPtr, this, value);
    }

    public int getRestingContactRestitutionThreshold() {
        return DynamicsJNI.btContactSolverInfoData_restingContactRestitutionThreshold_get(swigCPtr, this);
    }

    public void setRestingContactRestitutionThreshold(int value) {
        DynamicsJNI.btContactSolverInfoData_restingContactRestitutionThreshold_set(swigCPtr, this, value);
    }

    public int getMinimumSolverBatchSize() {
        return DynamicsJNI.btContactSolverInfoData_minimumSolverBatchSize_get(swigCPtr, this);
    }

    public void setMinimumSolverBatchSize(int value) {
        DynamicsJNI.btContactSolverInfoData_minimumSolverBatchSize_set(swigCPtr, this, value);
    }

    public float getMaxGyroscopicForce() {
        return DynamicsJNI.btContactSolverInfoData_maxGyroscopicForce_get(swigCPtr, this);
    }

    public void setMaxGyroscopicForce(float value) {
        DynamicsJNI.btContactSolverInfoData_maxGyroscopicForce_set(swigCPtr, this, value);
    }

    public float getSingleAxisRollingFrictionThreshold() {
        return DynamicsJNI.btContactSolverInfoData_singleAxisRollingFrictionThreshold_get(swigCPtr, this);
    }

    public void setSingleAxisRollingFrictionThreshold(float value) {
        DynamicsJNI.btContactSolverInfoData_singleAxisRollingFrictionThreshold_set(swigCPtr, this, value);
    }

    public float getLeastSquaresResidualThreshold() {
        return DynamicsJNI.btContactSolverInfoData_leastSquaresResidualThreshold_get(swigCPtr, this);
    }

    public void setLeastSquaresResidualThreshold(float value) {
        DynamicsJNI.btContactSolverInfoData_leastSquaresResidualThreshold_set(swigCPtr, this, value);
    }

    public float getRestitutionVelocityThreshold() {
        return DynamicsJNI.btContactSolverInfoData_restitutionVelocityThreshold_get(swigCPtr, this);
    }

    public void setRestitutionVelocityThreshold(float value) {
        DynamicsJNI.btContactSolverInfoData_restitutionVelocityThreshold_set(swigCPtr, this, value);
    }

}
