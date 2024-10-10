package com.badlogic.gdx.physics.box2d.joints;

import org.jbox2d.common.Vec2;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;

/**
 * A mouse joint is used to make a point on a body track a specified world point. This a soft constraint with a maximum force.
 * This allows the constraint to stretch and without applying huge forces. NOTE: this joint is not documented in the manual
 * because it was developed to be used in the testbed. If you want to learn how to use the mouse joint, look at the testbed.
 */
public class MouseJoint extends Joint {
    final Vec2 tmp = new Vec2();
    /**
     * Use this to update the target point.
     */
    private final Vector2 target = new Vector2();
    org.jbox2d.dynamics.joints.MouseJoint joint;

    public MouseJoint(World world, org.jbox2d.dynamics.joints.MouseJoint joint) {
        super(world, joint);
        this.joint = joint;
    }

    public Vector2 getTarget() {
        Vec2 t = joint.getTarget();
        return target.set(t.x, t.y);
    }

    /**
     * Use this to update the target point.
     */
    public void setTarget(Vector2 target) {
        tmp.set(target.x, target.y);
        joint.setTarget(tmp);
    }

    /**
     * Set/get the maximum force in Newtons.
     */
    public float getMaxForce() {
        return joint.getMaxForce();
    }

    /**
     * Set/get the maximum force in Newtons.
     */
    public void setMaxForce(float force) {
        joint.setMaxForce(force);
    }

    /**
     * Set/get the frequency in Hertz.
     */
    public float getFrequency() {
        return joint.getFrequency();
    }

    /**
     * Set/get the frequency in Hertz.
     */
    public void setFrequency(float hz) {
        joint.setFrequency(hz);
    }

    /**
     * Set/get the damping ratio (dimensionless).
     */
    public float getDampingRatio() {
        return joint.getDampingRatio();
    }

    /**
     * Set/get the damping ratio (dimensionless).
     */
    public void setDampingRatio(float ratio) {
        joint.setDampingRatio(ratio);
    }
}
