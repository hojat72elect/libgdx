/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;

public class btQuaternion extends btQuadWord {
    private long swigCPtr;

    protected btQuaternion(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, LinearMathJNI.btQuaternion_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btQuaternion, normally you should not need this constructor it's intended for low-level usage.
     */
    public btQuaternion(long cPtr, boolean cMemoryOwn) {
        this("btQuaternion", cPtr, cMemoryOwn);
        construct();
    }

    public btQuaternion() {
        this(LinearMathJNI.new_btQuaternion__SWIG_0(), true);
    }

    public btQuaternion(float _x, float _y, float _z, float _w) {
        this(LinearMathJNI.new_btQuaternion__SWIG_1(_x, _y, _z, _w), true);
    }

    public btQuaternion(Vector3 _axis, float _angle) {
        this(LinearMathJNI.new_btQuaternion__SWIG_2(_axis, _angle), true);
    }

    public btQuaternion(float yaw, float pitch, float roll) {
        this(LinearMathJNI.new_btQuaternion__SWIG_3(yaw, pitch, roll), true);
    }

    public static long getCPtr(btQuaternion obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    public static Quaternion getIdentity() {
        return LinearMathJNI.btQuaternion_getIdentity();
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(LinearMathJNI.btQuaternion_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                LinearMathJNI.delete_btQuaternion(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void setRotation(Vector3 axis, float _angle) {
        LinearMathJNI.btQuaternion_setRotation(swigCPtr, this, axis, _angle);
    }

    public void setEuler(float yaw, float pitch, float roll) {
        LinearMathJNI.btQuaternion_setEuler(swigCPtr, this, yaw, pitch, roll);
    }

    public void setEulerZYX(float yawZ, float pitchY, float rollX) {
        LinearMathJNI.btQuaternion_setEulerZYX(swigCPtr, this, yawZ, pitchY, rollX);
    }

    public void getEulerZYX(SWIGTYPE_p_float yawZ, SWIGTYPE_p_float pitchY, SWIGTYPE_p_float rollX) {
        LinearMathJNI.btQuaternion_getEulerZYX(swigCPtr, this, SWIGTYPE_p_float.getCPtr(yawZ), SWIGTYPE_p_float.getCPtr(pitchY),
                SWIGTYPE_p_float.getCPtr(rollX));
    }

    public Quaternion operatorAdditionAssignment(Quaternion q) {
        return LinearMathJNI.btQuaternion_operatorAdditionAssignment(swigCPtr, this, q);
    }

    public Quaternion operatorSubtractionAssignment(Quaternion q) {
        return LinearMathJNI.btQuaternion_operatorSubtractionAssignment(swigCPtr, this, q);
    }

    public Quaternion operatorMultiplicationAssignment(float s) {
        return LinearMathJNI.btQuaternion_operatorMultiplicationAssignment__SWIG_0(swigCPtr, this, s);
    }

    public Quaternion operatorMultiplicationAssignment(Quaternion q) {
        return LinearMathJNI.btQuaternion_operatorMultiplicationAssignment__SWIG_1(swigCPtr, this, q);
    }

    public float dot(Quaternion q) {
        return LinearMathJNI.btQuaternion_dot(swigCPtr, this, q);
    }

    public float length2() {
        return LinearMathJNI.btQuaternion_length2(swigCPtr, this);
    }

    public float length() {
        return LinearMathJNI.btQuaternion_length(swigCPtr, this);
    }

    public Quaternion safeNormalize() {
        return LinearMathJNI.btQuaternion_safeNormalize(swigCPtr, this);
    }

    public Quaternion normalize() {
        return LinearMathJNI.btQuaternion_normalize(swigCPtr, this);
    }

    public Quaternion operatorMultiplication(float s) {
        return LinearMathJNI.btQuaternion_operatorMultiplication(swigCPtr, this, s);
    }

    public Quaternion operatorDivision(float s) {
        return LinearMathJNI.btQuaternion_operatorDivision(swigCPtr, this, s);
    }

    public Quaternion operatorDivisionAssignment(float s) {
        return LinearMathJNI.btQuaternion_operatorDivisionAssignment(swigCPtr, this, s);
    }

    public Quaternion normalized() {
        return LinearMathJNI.btQuaternion_normalized(swigCPtr, this);
    }

    public float angle(Quaternion q) {
        return LinearMathJNI.btQuaternion_angle(swigCPtr, this, q);
    }

    public float angleShortestPath(Quaternion q) {
        return LinearMathJNI.btQuaternion_angleShortestPath(swigCPtr, this, q);
    }

    public float getAngle() {
        return LinearMathJNI.btQuaternion_getAngle(swigCPtr, this);
    }

    public float getAngleShortestPath() {
        return LinearMathJNI.btQuaternion_getAngleShortestPath(swigCPtr, this);
    }

    public Vector3 getAxis() {
        return LinearMathJNI.btQuaternion_getAxis(swigCPtr, this);
    }

    public Quaternion inverse() {
        return LinearMathJNI.btQuaternion_inverse(swigCPtr, this);
    }

    public Quaternion operatorAddition(Quaternion q2) {
        return LinearMathJNI.btQuaternion_operatorAddition(swigCPtr, this, q2);
    }

    public Quaternion operatorSubtraction(Quaternion q2) {
        return LinearMathJNI.btQuaternion_operatorSubtraction__SWIG_0(swigCPtr, this, q2);
    }

    public Quaternion operatorSubtraction() {
        return LinearMathJNI.btQuaternion_operatorSubtraction__SWIG_1(swigCPtr, this);
    }

    public Quaternion farthest(Quaternion qd) {
        return LinearMathJNI.btQuaternion_farthest(swigCPtr, this, qd);
    }

    public Quaternion nearest(Quaternion qd) {
        return LinearMathJNI.btQuaternion_nearest(swigCPtr, this, qd);
    }

    public Quaternion slerp(Quaternion q, float t) {
        return LinearMathJNI.btQuaternion_slerp(swigCPtr, this, q, t);
    }

    public float getW() {
        return LinearMathJNI.btQuaternion_getW(swigCPtr, this);
    }

    public void serialize(btQuaternionFloatData dataOut) {
        LinearMathJNI.btQuaternion_serialize(swigCPtr, this, btQuaternionFloatData.getCPtr(dataOut), dataOut);
    }

    public void deSerialize(btQuaternionFloatData dataIn) {
        LinearMathJNI.btQuaternion_deSerialize(swigCPtr, this, btQuaternionFloatData.getCPtr(dataIn), dataIn);
    }

    public void serializeFloat(btQuaternionFloatData dataOut) {
        LinearMathJNI.btQuaternion_serializeFloat(swigCPtr, this, btQuaternionFloatData.getCPtr(dataOut), dataOut);
    }

    public void deSerializeFloat(btQuaternionFloatData dataIn) {
        LinearMathJNI.btQuaternion_deSerializeFloat(swigCPtr, this, btQuaternionFloatData.getCPtr(dataIn), dataIn);
    }

    public void serializeDouble(btQuaternionDoubleData dataOut) {
        LinearMathJNI.btQuaternion_serializeDouble(swigCPtr, this, btQuaternionDoubleData.getCPtr(dataOut), dataOut);
    }

    public void deSerializeDouble(btQuaternionDoubleData dataIn) {
        LinearMathJNI.btQuaternion_deSerializeDouble(swigCPtr, this, btQuaternionDoubleData.getCPtr(dataIn), dataIn);
    }

}
