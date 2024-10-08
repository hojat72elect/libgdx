/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btScalarArray;
import com.badlogic.gdx.physics.bullet.linearmath.btSerializer;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3Array;

public class btMultiBody extends BulletBase {
    private long swigCPtr;

    protected btMultiBody(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btMultiBody, normally you should not need this constructor it's intended for low-level usage.
     */
    public btMultiBody(long cPtr, boolean cMemoryOwn) {
        this("btMultiBody", cPtr, cMemoryOwn);
        construct();
    }

    public btMultiBody(int n_links, float mass, Vector3 inertia, boolean fixedBase, boolean canSleep,
                       boolean deprecatedMultiDof) {
        this(DynamicsJNI.new_btMultiBody__SWIG_0(n_links, mass, inertia, fixedBase, canSleep, deprecatedMultiDof), true);
    }

    public btMultiBody(int n_links, float mass, Vector3 inertia, boolean fixedBase, boolean canSleep) {
        this(DynamicsJNI.new_btMultiBody__SWIG_1(n_links, mass, inertia, fixedBase, canSleep), true);
    }

    public static long getCPtr(btMultiBody obj) {
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
                DynamicsJNI.delete_btMultiBody(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public long operatorNew(long sizeInBytes) {
        return DynamicsJNI.btMultiBody_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDelete(long ptr) {
        DynamicsJNI.btMultiBody_operatorDelete__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNew(long arg0, long ptr) {
        return DynamicsJNI.btMultiBody_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDelete(long arg0, long arg1) {
        DynamicsJNI.btMultiBody_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public long operatorNewArray(long sizeInBytes) {
        return DynamicsJNI.btMultiBody_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
    }

    public void operatorDeleteArray(long ptr) {
        DynamicsJNI.btMultiBody_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
    }

    public long operatorNewArray(long arg0, long ptr) {
        return DynamicsJNI.btMultiBody_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
    }

    public void operatorDeleteArray(long arg0, long arg1) {
        DynamicsJNI.btMultiBody_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
    }

    public void setupFixed(int linkIndex, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis,
                           Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset, boolean deprecatedDisableParentCollision) {
        DynamicsJNI.btMultiBody_setupFixed__SWIG_0(swigCPtr, this, linkIndex, mass, inertia, parent, rotParentToThis,
                parentComToThisPivotOffset, thisPivotToThisComOffset, deprecatedDisableParentCollision);
    }

    public void setupFixed(int linkIndex, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis,
                           Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset) {
        DynamicsJNI.btMultiBody_setupFixed__SWIG_1(swigCPtr, this, linkIndex, mass, inertia, parent, rotParentToThis,
                parentComToThisPivotOffset, thisPivotToThisComOffset);
    }

    public void setupPrismatic(int i, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis, Vector3 jointAxis,
                               Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset, boolean disableParentCollision) {
        DynamicsJNI.btMultiBody_setupPrismatic(swigCPtr, this, i, mass, inertia, parent, rotParentToThis, jointAxis,
                parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision);
    }

    public void setupRevolute(int linkIndex, float mass, Vector3 inertia, int parentIndex, Quaternion rotParentToThis,
                              Vector3 jointAxis, Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset, boolean disableParentCollision) {
        DynamicsJNI.btMultiBody_setupRevolute__SWIG_0(swigCPtr, this, linkIndex, mass, inertia, parentIndex, rotParentToThis,
                jointAxis, parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision);
    }

    public void setupRevolute(int linkIndex, float mass, Vector3 inertia, int parentIndex, Quaternion rotParentToThis,
                              Vector3 jointAxis, Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset) {
        DynamicsJNI.btMultiBody_setupRevolute__SWIG_1(swigCPtr, this, linkIndex, mass, inertia, parentIndex, rotParentToThis,
                jointAxis, parentComToThisPivotOffset, thisPivotToThisComOffset);
    }

    public void setupSpherical(int linkIndex, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis,
                               Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset, boolean disableParentCollision) {
        DynamicsJNI.btMultiBody_setupSpherical__SWIG_0(swigCPtr, this, linkIndex, mass, inertia, parent, rotParentToThis,
                parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision);
    }

    public void setupSpherical(int linkIndex, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis,
                               Vector3 parentComToThisPivotOffset, Vector3 thisPivotToThisComOffset) {
        DynamicsJNI.btMultiBody_setupSpherical__SWIG_1(swigCPtr, this, linkIndex, mass, inertia, parent, rotParentToThis,
                parentComToThisPivotOffset, thisPivotToThisComOffset);
    }

    public void setupPlanar(int i, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis, Vector3 rotationAxis,
                            Vector3 parentComToThisComOffset, boolean disableParentCollision) {
        DynamicsJNI.btMultiBody_setupPlanar__SWIG_0(swigCPtr, this, i, mass, inertia, parent, rotParentToThis, rotationAxis,
                parentComToThisComOffset, disableParentCollision);
    }

    public void setupPlanar(int i, float mass, Vector3 inertia, int parent, Quaternion rotParentToThis, Vector3 rotationAxis,
                            Vector3 parentComToThisComOffset) {
        DynamicsJNI.btMultiBody_setupPlanar__SWIG_1(swigCPtr, this, i, mass, inertia, parent, rotParentToThis, rotationAxis,
                parentComToThisComOffset);
    }

    public btMultibodyLink getLinkConst(int index) {
        return new btMultibodyLink(DynamicsJNI.btMultiBody_getLinkConst(swigCPtr, this, index), false);
    }

    public btMultibodyLink getLink(int index) {
        return new btMultibodyLink(DynamicsJNI.btMultiBody_getLink(swigCPtr, this, index), false);
    }

    public btMultiBodyLinkCollider getBaseColliderConst() {
        long cPtr = DynamicsJNI.btMultiBody_getBaseColliderConst(swigCPtr, this);
        return (cPtr == 0) ? null : new btMultiBodyLinkCollider(cPtr, false);
    }

    public btMultiBodyLinkCollider getBaseCollider() {
        long cPtr = DynamicsJNI.btMultiBody_getBaseCollider(swigCPtr, this);
        return (cPtr == 0) ? null : new btMultiBodyLinkCollider(cPtr, false);
    }

    public void setBaseCollider(btMultiBodyLinkCollider collider) {
        DynamicsJNI.btMultiBody_setBaseCollider(swigCPtr, this, btMultiBodyLinkCollider.getCPtr(collider), collider);
    }

    public btMultiBodyLinkCollider getLinkCollider(int index) {
        long cPtr = DynamicsJNI.btMultiBody_getLinkCollider(swigCPtr, this, index);
        return (cPtr == 0) ? null : new btMultiBodyLinkCollider(cPtr, false);
    }

    public int getParent(int link_num) {
        return DynamicsJNI.btMultiBody_getParent(swigCPtr, this, link_num);
    }

    public int getNumLinks() {
        return DynamicsJNI.btMultiBody_getNumLinks(swigCPtr, this);
    }

    public void setNumLinks(int numLinks) {
        DynamicsJNI.btMultiBody_setNumLinks(swigCPtr, this, numLinks);
    }

    public int getNumDofs() {
        return DynamicsJNI.btMultiBody_getNumDofs(swigCPtr, this);
    }

    public int getNumPosVars() {
        return DynamicsJNI.btMultiBody_getNumPosVars(swigCPtr, this);
    }

    public float getBaseMass() {
        return DynamicsJNI.btMultiBody_getBaseMass(swigCPtr, this);
    }

    public void setBaseMass(float mass) {
        DynamicsJNI.btMultiBody_setBaseMass(swigCPtr, this, mass);
    }

    public Vector3 getBaseInertia() {
        return DynamicsJNI.btMultiBody_getBaseInertia(swigCPtr, this);
    }

    public void setBaseInertia(Vector3 inertia) {
        DynamicsJNI.btMultiBody_setBaseInertia(swigCPtr, this, inertia);
    }

    public float getLinkMass(int i) {
        return DynamicsJNI.btMultiBody_getLinkMass(swigCPtr, this, i);
    }

    public Vector3 getLinkInertia(int i) {
        return DynamicsJNI.btMultiBody_getLinkInertia(swigCPtr, this, i);
    }

    public Vector3 getBasePos() {
        return DynamicsJNI.btMultiBody_getBasePos(swigCPtr, this);
    }

    public void setBasePos(Vector3 pos) {
        DynamicsJNI.btMultiBody_setBasePos(swigCPtr, this, pos);
    }

    public Vector3 getBaseVel() {
        return DynamicsJNI.btMultiBody_getBaseVel(swigCPtr, this);
    }

    public void setBaseVel(Vector3 vel) {
        DynamicsJNI.btMultiBody_setBaseVel(swigCPtr, this, vel);
    }

    public Quaternion getWorldToBaseRot() {
        return DynamicsJNI.btMultiBody_getWorldToBaseRot(swigCPtr, this);
    }

    public void setWorldToBaseRot(Quaternion rot) {
        DynamicsJNI.btMultiBody_setWorldToBaseRot(swigCPtr, this, rot);
    }

    public Vector3 getBaseOmega() {
        return DynamicsJNI.btMultiBody_getBaseOmega(swigCPtr, this);
    }

    public void setBaseOmega(Vector3 omega) {
        DynamicsJNI.btMultiBody_setBaseOmega(swigCPtr, this, omega);
    }

    public Matrix4 getBaseWorldTransform() {
        return DynamicsJNI.btMultiBody_getBaseWorldTransform(swigCPtr, this);
    }

    public void setBaseWorldTransform(Matrix4 tr) {
        DynamicsJNI.btMultiBody_setBaseWorldTransform(swigCPtr, this, tr);
    }

    public float getJointPos(int i) {
        return DynamicsJNI.btMultiBody_getJointPos(swigCPtr, this, i);
    }

    public float getJointVel(int i) {
        return DynamicsJNI.btMultiBody_getJointVel(swigCPtr, this, i);
    }

    public java.nio.FloatBuffer getJointVelMultiDof(int i) {
        return DynamicsJNI.btMultiBody_getJointVelMultiDof(swigCPtr, this, i);
    }

    public java.nio.FloatBuffer getJointPosMultiDof(int i) {
        return DynamicsJNI.btMultiBody_getJointPosMultiDof(swigCPtr, this, i);
    }

    public java.nio.FloatBuffer getJointVelMultiDofConst(int i) {
        return DynamicsJNI.btMultiBody_getJointVelMultiDofConst(swigCPtr, this, i);
    }

    public java.nio.FloatBuffer getJointPosMultiDofConst(int i) {
        return DynamicsJNI.btMultiBody_getJointPosMultiDofConst(swigCPtr, this, i);
    }

    public void setJointPos(int i, float q) {
        DynamicsJNI.btMultiBody_setJointPos(swigCPtr, this, i, q);
    }

    public void setJointVel(int i, float qdot) {
        DynamicsJNI.btMultiBody_setJointVel(swigCPtr, this, i, qdot);
    }

    public void setJointPosMultiDof(int i, java.nio.FloatBuffer q) {
        assert q.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_setJointPosMultiDof(swigCPtr, this, i, q);
        }
    }

    public void setJointVelMultiDof(int i, java.nio.FloatBuffer qdot) {
        assert qdot.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_setJointVelMultiDof(swigCPtr, this, i, qdot);
        }
    }

    public java.nio.FloatBuffer getVelocityVector() {
        return DynamicsJNI.btMultiBody_getVelocityVector(swigCPtr, this);
    }

    public Vector3 getRVector(int i) {
        return DynamicsJNI.btMultiBody_getRVector(swigCPtr, this, i);
    }

    public Quaternion getParentToLocalRot(int i) {
        return DynamicsJNI.btMultiBody_getParentToLocalRot(swigCPtr, this, i);
    }

    public Vector3 localPosToWorld(int i, Vector3 vec) {
        return DynamicsJNI.btMultiBody_localPosToWorld(swigCPtr, this, i, vec);
    }

    public Vector3 localDirToWorld(int i, Vector3 vec) {
        return DynamicsJNI.btMultiBody_localDirToWorld(swigCPtr, this, i, vec);
    }

    public Vector3 worldPosToLocal(int i, Vector3 vec) {
        return DynamicsJNI.btMultiBody_worldPosToLocal(swigCPtr, this, i, vec);
    }

    public Vector3 worldDirToLocal(int i, Vector3 vec) {
        return DynamicsJNI.btMultiBody_worldDirToLocal(swigCPtr, this, i, vec);
    }

    public Matrix3 localFrameToWorld(int i, Matrix3 mat) {
        return DynamicsJNI.btMultiBody_localFrameToWorld(swigCPtr, this, i, mat);
    }

    public float getKineticEnergy() {
        return DynamicsJNI.btMultiBody_getKineticEnergy(swigCPtr, this);
    }

    public Vector3 getAngularMomentum() {
        return DynamicsJNI.btMultiBody_getAngularMomentum(swigCPtr, this);
    }

    public void clearForcesAndTorques() {
        DynamicsJNI.btMultiBody_clearForcesAndTorques(swigCPtr, this);
    }

    public void clearConstraintForces() {
        DynamicsJNI.btMultiBody_clearConstraintForces(swigCPtr, this);
    }

    public void clearVelocities() {
        DynamicsJNI.btMultiBody_clearVelocities(swigCPtr, this);
    }

    public void addBaseForce(Vector3 f) {
        DynamicsJNI.btMultiBody_addBaseForce(swigCPtr, this, f);
    }

    public void addBaseTorque(Vector3 t) {
        DynamicsJNI.btMultiBody_addBaseTorque(swigCPtr, this, t);
    }

    public void addLinkForce(int i, Vector3 f) {
        DynamicsJNI.btMultiBody_addLinkForce(swigCPtr, this, i, f);
    }

    public void addLinkTorque(int i, Vector3 t) {
        DynamicsJNI.btMultiBody_addLinkTorque(swigCPtr, this, i, t);
    }

    public void addBaseConstraintForce(Vector3 f) {
        DynamicsJNI.btMultiBody_addBaseConstraintForce(swigCPtr, this, f);
    }

    public void addBaseConstraintTorque(Vector3 t) {
        DynamicsJNI.btMultiBody_addBaseConstraintTorque(swigCPtr, this, t);
    }

    public void addLinkConstraintForce(int i, Vector3 f) {
        DynamicsJNI.btMultiBody_addLinkConstraintForce(swigCPtr, this, i, f);
    }

    public void addLinkConstraintTorque(int i, Vector3 t) {
        DynamicsJNI.btMultiBody_addLinkConstraintTorque(swigCPtr, this, i, t);
    }

    public void addJointTorque(int i, float Q) {
        DynamicsJNI.btMultiBody_addJointTorque(swigCPtr, this, i, Q);
    }

    public void addJointTorqueMultiDof(int i, int dof, float Q) {
        DynamicsJNI.btMultiBody_addJointTorqueMultiDof__SWIG_0(swigCPtr, this, i, dof, Q);
    }

    public void addJointTorqueMultiDof(int i, java.nio.FloatBuffer Q) {
        assert Q.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_addJointTorqueMultiDof__SWIG_1(swigCPtr, this, i, Q);
        }
    }

    public Vector3 getBaseForce() {
        return DynamicsJNI.btMultiBody_getBaseForce(swigCPtr, this);
    }

    public Vector3 getBaseTorque() {
        return DynamicsJNI.btMultiBody_getBaseTorque(swigCPtr, this);
    }

    public Vector3 getLinkForce(int i) {
        return DynamicsJNI.btMultiBody_getLinkForce(swigCPtr, this, i);
    }

    public Vector3 getLinkTorque(int i) {
        return DynamicsJNI.btMultiBody_getLinkTorque(swigCPtr, this, i);
    }

    public float getJointTorque(int i) {
        return DynamicsJNI.btMultiBody_getJointTorque(swigCPtr, this, i);
    }

    public java.nio.FloatBuffer getJointTorqueMultiDof(int i) {
        return DynamicsJNI.btMultiBody_getJointTorqueMultiDof(swigCPtr, this, i);
    }

    public void computeAccelerationsArticulatedBodyAlgorithmMultiDof(float dt, btScalarArray scratch_r, btVector3Array scratch_v,
                                                                     SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m, boolean isConstraintPass) {
        DynamicsJNI.btMultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof__SWIG_0(swigCPtr, this, dt,
                btScalarArray.getCPtr(scratch_r), scratch_r, btVector3Array.getCPtr(scratch_v), scratch_v,
                SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m), isConstraintPass);
    }

    public void computeAccelerationsArticulatedBodyAlgorithmMultiDof(float dt, btScalarArray scratch_r, btVector3Array scratch_v,
                                                                     SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m) {
        DynamicsJNI.btMultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof__SWIG_1(swigCPtr, this, dt,
                btScalarArray.getCPtr(scratch_r), scratch_r, btVector3Array.getCPtr(scratch_v), scratch_v,
                SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m));
    }

    public void stepVelocitiesMultiDof(float dt, btScalarArray scratch_r, btVector3Array scratch_v,
                                       SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m, boolean isConstraintPass) {
        DynamicsJNI.btMultiBody_stepVelocitiesMultiDof__SWIG_0(swigCPtr, this, dt, btScalarArray.getCPtr(scratch_r), scratch_r,
                btVector3Array.getCPtr(scratch_v), scratch_v, SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m),
                isConstraintPass);
    }

    public void stepVelocitiesMultiDof(float dt, btScalarArray scratch_r, btVector3Array scratch_v,
                                       SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m) {
        DynamicsJNI.btMultiBody_stepVelocitiesMultiDof__SWIG_1(swigCPtr, this, dt, btScalarArray.getCPtr(scratch_r), scratch_r,
                btVector3Array.getCPtr(scratch_v), scratch_v, SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m));
    }

    public void calcAccelerationDeltasMultiDof(java.nio.FloatBuffer force, java.nio.FloatBuffer output, btScalarArray scratch_r,
                                               btVector3Array scratch_v) {
        assert force.isDirect() : "Buffer must be allocated direct.";
        assert output.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_calcAccelerationDeltasMultiDof(swigCPtr, this, force, output, btScalarArray.getCPtr(scratch_r),
                    scratch_r, btVector3Array.getCPtr(scratch_v), scratch_v);
        }
    }

    public void applyDeltaVeeMultiDof2(java.nio.FloatBuffer delta_vee, float multiplier) {
        assert delta_vee.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_applyDeltaVeeMultiDof2(swigCPtr, this, delta_vee, multiplier);
        }
    }

    public void processDeltaVeeMultiDof2() {
        DynamicsJNI.btMultiBody_processDeltaVeeMultiDof2(swigCPtr, this);
    }

    public void applyDeltaVeeMultiDof(java.nio.FloatBuffer delta_vee, float multiplier) {
        assert delta_vee.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_applyDeltaVeeMultiDof(swigCPtr, this, delta_vee, multiplier);
        }
    }

    public void stepPositionsMultiDof(float dt, java.nio.FloatBuffer pq, java.nio.FloatBuffer pqd) {
        assert pq.isDirect() : "Buffer must be allocated direct.";
        assert pqd.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_stepPositionsMultiDof__SWIG_0(swigCPtr, this, dt, pq, pqd);
        }
    }

    public void stepPositionsMultiDof(float dt, java.nio.FloatBuffer pq) {
        assert pq.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_stepPositionsMultiDof__SWIG_1(swigCPtr, this, dt, pq);
        }
    }

    public void stepPositionsMultiDof(float dt) {
        DynamicsJNI.btMultiBody_stepPositionsMultiDof__SWIG_2(swigCPtr, this, dt);
    }

    public void fillContactJacobianMultiDof(int link, Vector3 contact_point, Vector3 normal, java.nio.FloatBuffer jac,
                                            btScalarArray scratch_r, btVector3Array scratch_v, SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m) {
        assert jac.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_fillContactJacobianMultiDof(swigCPtr, this, link, contact_point, normal, jac,
                    btScalarArray.getCPtr(scratch_r), scratch_r, btVector3Array.getCPtr(scratch_v), scratch_v,
                    SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m));
        }
    }

    public void fillConstraintJacobianMultiDof(int link, Vector3 contact_point, Vector3 normal_ang, Vector3 normal_lin,
                                               java.nio.FloatBuffer jac, btScalarArray scratch_r, btVector3Array scratch_v,
                                               SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t scratch_m) {
        assert jac.isDirect() : "Buffer must be allocated direct.";
        {
            DynamicsJNI.btMultiBody_fillConstraintJacobianMultiDof(swigCPtr, this, link, contact_point, normal_ang, normal_lin, jac,
                    btScalarArray.getCPtr(scratch_r), scratch_r, btVector3Array.getCPtr(scratch_v), scratch_v,
                    SWIGTYPE_p_btAlignedObjectArrayT_btMatrix3x3_t.getCPtr(scratch_m));
        }
    }

    public boolean getCanSleep() {
        return DynamicsJNI.btMultiBody_getCanSleep(swigCPtr, this);
    }

    public void setCanSleep(boolean canSleep) {
        DynamicsJNI.btMultiBody_setCanSleep(swigCPtr, this, canSleep);
    }

    public boolean isAwake() {
        return DynamicsJNI.btMultiBody_isAwake(swigCPtr, this);
    }

    public void wakeUp() {
        DynamicsJNI.btMultiBody_wakeUp(swigCPtr, this);
    }

    public void goToSleep() {
        DynamicsJNI.btMultiBody_goToSleep(swigCPtr, this);
    }

    public void checkMotionAndSleepIfRequired(float timestep) {
        DynamicsJNI.btMultiBody_checkMotionAndSleepIfRequired(swigCPtr, this, timestep);
    }

    public boolean hasFixedBase() {
        return DynamicsJNI.btMultiBody_hasFixedBase(swigCPtr, this);
    }

    public int getCompanionId() {
        return DynamicsJNI.btMultiBody_getCompanionId(swigCPtr, this);
    }

    public void setCompanionId(int id) {
        DynamicsJNI.btMultiBody_setCompanionId(swigCPtr, this, id);
    }

    public float getLinearDamping() {
        return DynamicsJNI.btMultiBody_getLinearDamping(swigCPtr, this);
    }

    public void setLinearDamping(float damp) {
        DynamicsJNI.btMultiBody_setLinearDamping(swigCPtr, this, damp);
    }

    public float getAngularDamping() {
        return DynamicsJNI.btMultiBody_getAngularDamping(swigCPtr, this);
    }

    public void setAngularDamping(float damp) {
        DynamicsJNI.btMultiBody_setAngularDamping(swigCPtr, this, damp);
    }

    public boolean getUseGyroTerm() {
        return DynamicsJNI.btMultiBody_getUseGyroTerm(swigCPtr, this);
    }

    public void setUseGyroTerm(boolean useGyro) {
        DynamicsJNI.btMultiBody_setUseGyroTerm(swigCPtr, this, useGyro);
    }

    public float getMaxCoordinateVelocity() {
        return DynamicsJNI.btMultiBody_getMaxCoordinateVelocity(swigCPtr, this);
    }

    public void setMaxCoordinateVelocity(float maxVel) {
        DynamicsJNI.btMultiBody_setMaxCoordinateVelocity(swigCPtr, this, maxVel);
    }

    public float getMaxAppliedImpulse() {
        return DynamicsJNI.btMultiBody_getMaxAppliedImpulse(swigCPtr, this);
    }

    public void setMaxAppliedImpulse(float maxImp) {
        DynamicsJNI.btMultiBody_setMaxAppliedImpulse(swigCPtr, this, maxImp);
    }

    public void setHasSelfCollision(boolean hasSelfCollision) {
        DynamicsJNI.btMultiBody_setHasSelfCollision(swigCPtr, this, hasSelfCollision);
    }

    public boolean hasSelfCollision() {
        return DynamicsJNI.btMultiBody_hasSelfCollision(swigCPtr, this);
    }

    public void finalizeMultiDof() {
        DynamicsJNI.btMultiBody_finalizeMultiDof(swigCPtr, this);
    }

    public void useRK4Integration(boolean use) {
        DynamicsJNI.btMultiBody_useRK4Integration(swigCPtr, this, use);
    }

    public boolean isUsingRK4Integration() {
        return DynamicsJNI.btMultiBody_isUsingRK4Integration(swigCPtr, this);
    }

    public void useGlobalVelocities(boolean use) {
        DynamicsJNI.btMultiBody_useGlobalVelocities(swigCPtr, this, use);
    }

    public boolean isUsingGlobalVelocities() {
        return DynamicsJNI.btMultiBody_isUsingGlobalVelocities(swigCPtr, this);
    }

    public boolean isPosUpdated() {
        return DynamicsJNI.btMultiBody_isPosUpdated(swigCPtr, this);
    }

    public void setPosUpdated(boolean updated) {
        DynamicsJNI.btMultiBody_setPosUpdated(swigCPtr, this, updated);
    }

    public boolean internalNeedsJointFeedback() {
        return DynamicsJNI.btMultiBody_internalNeedsJointFeedback(swigCPtr, this);
    }

    public void forwardKinematics(SWIGTYPE_p_btAlignedObjectArrayT_btQuaternion_t scratch_q, btVector3Array scratch_m) {
        DynamicsJNI.btMultiBody_forwardKinematics(swigCPtr, this,
                SWIGTYPE_p_btAlignedObjectArrayT_btQuaternion_t.getCPtr(scratch_q), btVector3Array.getCPtr(scratch_m), scratch_m);
    }

    public void compTreeLinkVelocities(btVector3 omega, btVector3 vel) {
        DynamicsJNI.btMultiBody_compTreeLinkVelocities(swigCPtr, this, btVector3.getCPtr(omega), omega, btVector3.getCPtr(vel),
                vel);
    }

    public void updateCollisionObjectWorldTransforms(SWIGTYPE_p_btAlignedObjectArrayT_btQuaternion_t scratch_q,
                                                     btVector3Array scratch_m) {
        DynamicsJNI.btMultiBody_updateCollisionObjectWorldTransforms(swigCPtr, this,
                SWIGTYPE_p_btAlignedObjectArrayT_btQuaternion_t.getCPtr(scratch_q), btVector3Array.getCPtr(scratch_m), scratch_m);
    }

    public int calculateSerializeBufferSize() {
        return DynamicsJNI.btMultiBody_calculateSerializeBufferSize(swigCPtr, this);
    }

    public String serialize(long dataBuffer, btSerializer serializer) {
        return DynamicsJNI.btMultiBody_serialize(swigCPtr, this, dataBuffer, btSerializer.getCPtr(serializer), serializer);
    }

    public String getBaseName() {
        return DynamicsJNI.btMultiBody_getBaseName(swigCPtr, this);
    }

    public void setBaseName(String name) {
        DynamicsJNI.btMultiBody_setBaseName(swigCPtr, this, name);
    }

    public long getUserPointer() {
        return DynamicsJNI.btMultiBody_getUserPointer(swigCPtr, this);
    }

    public void setUserPointer(long userPointer) {
        DynamicsJNI.btMultiBody_setUserPointer(swigCPtr, this, userPointer);
    }

    public int getUserIndex() {
        return DynamicsJNI.btMultiBody_getUserIndex(swigCPtr, this);
    }

    public void setUserIndex(int index) {
        DynamicsJNI.btMultiBody_setUserIndex(swigCPtr, this, index);
    }

    public int getUserIndex2() {
        return DynamicsJNI.btMultiBody_getUserIndex2(swigCPtr, this);
    }

    public void setUserIndex2(int index) {
        DynamicsJNI.btMultiBody_setUserIndex2(swigCPtr, this, index);
    }

}
