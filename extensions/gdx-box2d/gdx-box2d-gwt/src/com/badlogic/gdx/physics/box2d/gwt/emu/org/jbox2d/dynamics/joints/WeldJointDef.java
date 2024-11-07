package org.jbox2d.dynamics.joints;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

public class WeldJointDef extends JointDef {
    /**
     * The local anchor point relative to body1's origin.
     */
    public final Vec2 localAnchorA;

    /**
     * The local anchor point relative to body2's origin.
     */
    public final Vec2 localAnchorB;

    /**
     * The body2 angle minus body1 angle in the reference state (radians).
     */
    public float referenceAngle;

    /**
     * The mass-spring-damper frequency in Hertz. Rotation only. Disable softness with a value of 0.
     */
    public float frequencyHz;

    /**
     * The damping ratio. 0 = no damping, 1 = critical damping.
     */
    public float dampingRatio;

    public WeldJointDef() {
        super(JointType.WELD);
        localAnchorA = new Vec2();
        localAnchorB = new Vec2();
        referenceAngle = 0.0f;
    }

    /**
     * Initialize the bodies, anchors, and reference angle using a world anchor point.
     *
     * @param bA
     * @param bB
     * @param anchor
     */
    public void initialize(Body bA, Body bB, Vec2 anchor) {
        bodyA = bA;
        bodyB = bB;
        bodyA.getLocalPointToOut(anchor, localAnchorA);
        bodyB.getLocalPointToOut(anchor, localAnchorB);
        referenceAngle = bodyB.getAngle() - bodyA.getAngle();
    }
}
