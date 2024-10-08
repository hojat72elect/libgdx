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

public class btContactSolverInfoDoubleData extends BulletBase {
    private long swigCPtr;

    protected btContactSolverInfoDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btContactSolverInfoDoubleData, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btContactSolverInfoDoubleData(long cPtr, boolean cMemoryOwn) {
        this("btContactSolverInfoDoubleData", cPtr, cMemoryOwn);
        construct();
    }

    public btContactSolverInfoDoubleData() {
        this(DynamicsJNI.new_btContactSolverInfoDoubleData(), true);
    }

    public static long getCPtr(btContactSolverInfoDoubleData obj) {
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
                DynamicsJNI.delete_btContactSolverInfoDoubleData(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public double getTau() {
        return DynamicsJNI.btContactSolverInfoDoubleData_tau_get(swigCPtr, this);
    }

    public void setTau(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_tau_set(swigCPtr, this, value);
    }

    public double getDamping() {
        return DynamicsJNI.btContactSolverInfoDoubleData_damping_get(swigCPtr, this);
    }

    public void setDamping(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_damping_set(swigCPtr, this, value);
    }

    public double getFriction() {
        return DynamicsJNI.btContactSolverInfoDoubleData_friction_get(swigCPtr, this);
    }

    public void setFriction(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_friction_set(swigCPtr, this, value);
    }

    public double getTimeStep() {
        return DynamicsJNI.btContactSolverInfoDoubleData_timeStep_get(swigCPtr, this);
    }

    public void setTimeStep(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_timeStep_set(swigCPtr, this, value);
    }

    public double getRestitution() {
        return DynamicsJNI.btContactSolverInfoDoubleData_restitution_get(swigCPtr, this);
    }

    public void setRestitution(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_restitution_set(swigCPtr, this, value);
    }

    public double getMaxErrorReduction() {
        return DynamicsJNI.btContactSolverInfoDoubleData_maxErrorReduction_get(swigCPtr, this);
    }

    public void setMaxErrorReduction(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_maxErrorReduction_set(swigCPtr, this, value);
    }

    public double getSor() {
        return DynamicsJNI.btContactSolverInfoDoubleData_sor_get(swigCPtr, this);
    }

    public void setSor(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_sor_set(swigCPtr, this, value);
    }

    public double getErp() {
        return DynamicsJNI.btContactSolverInfoDoubleData_erp_get(swigCPtr, this);
    }

    public void setErp(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_erp_set(swigCPtr, this, value);
    }

    public double getErp2() {
        return DynamicsJNI.btContactSolverInfoDoubleData_erp2_get(swigCPtr, this);
    }

    public void setErp2(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_erp2_set(swigCPtr, this, value);
    }

    public double getGlobalCfm() {
        return DynamicsJNI.btContactSolverInfoDoubleData_globalCfm_get(swigCPtr, this);
    }

    public void setGlobalCfm(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_globalCfm_set(swigCPtr, this, value);
    }

    public double getSplitImpulsePenetrationThreshold() {
        return DynamicsJNI.btContactSolverInfoDoubleData_splitImpulsePenetrationThreshold_get(swigCPtr, this);
    }

    public void setSplitImpulsePenetrationThreshold(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_splitImpulsePenetrationThreshold_set(swigCPtr, this, value);
    }

    public double getSplitImpulseTurnErp() {
        return DynamicsJNI.btContactSolverInfoDoubleData_splitImpulseTurnErp_get(swigCPtr, this);
    }

    public void setSplitImpulseTurnErp(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_splitImpulseTurnErp_set(swigCPtr, this, value);
    }

    public double getLinearSlop() {
        return DynamicsJNI.btContactSolverInfoDoubleData_linearSlop_get(swigCPtr, this);
    }

    public void setLinearSlop(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_linearSlop_set(swigCPtr, this, value);
    }

    public double getWarmstartingFactor() {
        return DynamicsJNI.btContactSolverInfoDoubleData_warmstartingFactor_get(swigCPtr, this);
    }

    public void setWarmstartingFactor(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_warmstartingFactor_set(swigCPtr, this, value);
    }

    public double getMaxGyroscopicForce() {
        return DynamicsJNI.btContactSolverInfoDoubleData_maxGyroscopicForce_get(swigCPtr, this);
    }

    public void setMaxGyroscopicForce(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_maxGyroscopicForce_set(swigCPtr, this, value);
    }

    public double getSingleAxisRollingFrictionThreshold() {
        return DynamicsJNI.btContactSolverInfoDoubleData_singleAxisRollingFrictionThreshold_get(swigCPtr, this);
    }

    public void setSingleAxisRollingFrictionThreshold(double value) {
        DynamicsJNI.btContactSolverInfoDoubleData_singleAxisRollingFrictionThreshold_set(swigCPtr, this, value);
    }

    public int getNumIterations() {
        return DynamicsJNI.btContactSolverInfoDoubleData_numIterations_get(swigCPtr, this);
    }

    public void setNumIterations(int value) {
        DynamicsJNI.btContactSolverInfoDoubleData_numIterations_set(swigCPtr, this, value);
    }

    public int getSolverMode() {
        return DynamicsJNI.btContactSolverInfoDoubleData_solverMode_get(swigCPtr, this);
    }

    public void setSolverMode(int value) {
        DynamicsJNI.btContactSolverInfoDoubleData_solverMode_set(swigCPtr, this, value);
    }

    public int getRestingContactRestitutionThreshold() {
        return DynamicsJNI.btContactSolverInfoDoubleData_restingContactRestitutionThreshold_get(swigCPtr, this);
    }

    public void setRestingContactRestitutionThreshold(int value) {
        DynamicsJNI.btContactSolverInfoDoubleData_restingContactRestitutionThreshold_set(swigCPtr, this, value);
    }

    public int getMinimumSolverBatchSize() {
        return DynamicsJNI.btContactSolverInfoDoubleData_minimumSolverBatchSize_get(swigCPtr, this);
    }

    public void setMinimumSolverBatchSize(int value) {
        DynamicsJNI.btContactSolverInfoDoubleData_minimumSolverBatchSize_set(swigCPtr, this, value);
    }

    public int getSplitImpulse() {
        return DynamicsJNI.btContactSolverInfoDoubleData_splitImpulse_get(swigCPtr, this);
    }

    public void setSplitImpulse(int value) {
        DynamicsJNI.btContactSolverInfoDoubleData_splitImpulse_set(swigCPtr, this, value);
    }

    public String getPadding() {
        return DynamicsJNI.btContactSolverInfoDoubleData_padding_get(swigCPtr, this);
    }

    public void setPadding(String value) {
        DynamicsJNI.btContactSolverInfoDoubleData_padding_set(swigCPtr, this, value);
    }

}
