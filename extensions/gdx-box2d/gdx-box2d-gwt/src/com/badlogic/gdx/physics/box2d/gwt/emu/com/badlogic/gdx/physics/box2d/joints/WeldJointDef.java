package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.JointDef;

public class WeldJointDef extends JointDef {
    /**
     * The local anchor point relative to body1's origin.
     */
    public final Vector2 localAnchorA = new Vector2();
    /**
     * The local anchor point relative to body2's origin.
     */
    public final Vector2 localAnchorB = new Vector2();
    /**
     * The body2 angle minus body1 angle in the reference state (radians).
     */
    public float referenceAngle = 0;
    /**
     * The mass-spring-damper frequency in Hertz. Rotation only. Disable softness with a value of 0.
     */
    public float frequencyHz = 0;
    /**
     * The damping ratio. 0 = no damping, 1 = critical damping.
     */
    public float dampingRatio = 0;

    public WeldJointDef() {
        type = JointType.WeldJoint;
    }

    // / Initialize the bodies, anchors, and reference angle using a world
    // / anchor point.
    public void initialize(Body body1, Body body2, Vector2 anchor) {
        this.bodyA = body1;
        this.bodyB = body2;
        this.localAnchorA.set(body1.getLocalPoint(anchor));
        this.localAnchorB.set(body2.getLocalPoint(anchor));
        referenceAngle = body2.getAngle() - body1.getAngle();
    }

    @Override
    public org.jbox2d.dynamics.joints.JointDef toJBox2d() {
        org.jbox2d.dynamics.joints.WeldJointDef jd = new org.jbox2d.dynamics.joints.WeldJointDef();
        jd.bodyA = bodyA.body;
        jd.bodyB = bodyB.body;
        jd.collideConnected = collideConnected;
        jd.dampingRatio = dampingRatio;
        jd.frequencyHz = frequencyHz;
        jd.localAnchorA.set(localAnchorA.x, localAnchorA.y);
        jd.localAnchorB.set(localAnchorB.x, localAnchorB.y);
        jd.referenceAngle = referenceAngle;
        jd.type = org.jbox2d.dynamics.joints.JointType.WELD;
        return jd;
    }
}
