
/*
 * JBox2D - A Java Port of Erin Catto's Box2D
 *
 * JBox2D homepage: http://jbox2d.sourceforge.net/
 * Box2D homepage: http://www.box2d.org
 */

package org.jbox2d.dynamics.joints;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

/**
 * Revolute joint definition. This requires defining an anchor point where the bodies are joined. The definition uses local
 * anchor points so that the initial configuration can violate the constraint slightly. You also need to specify the initial
 * relative angle for joint limits. This helps when saving and loading a game. The local anchor points are measured from the
 * body's origin rather than the center of mass because:<br/>
 * <ul>
 * <li>you might not know where the center of mass will be.</li>
 * <li>if you add/remove shapes from a body and recompute the mass, the joints will be broken.</li>
 * </ul>
 */
public class RevoluteJointDef extends JointDef {

    /**
     * The local anchor point relative to body1's origin.
     */
    public Vec2 localAnchorA;

    /**
     * The local anchor point relative to body2's origin.
     */
    public Vec2 localAnchorB;

    /**
     * The body2 angle minus body1 angle in the reference state (radians).
     */
    public float referenceAngle;

    /**
     * A flag to enable joint limits.
     */
    public boolean enableLimit;

    /**
     * The lower angle for the joint limit (radians).
     */
    public float lowerAngle;

    /**
     * The upper angle for the joint limit (radians).
     */
    public float upperAngle;

    /**
     * A flag to enable the joint motor.
     */
    public boolean enableMotor;

    /**
     * The desired motor speed. Usually in radians per second.
     */
    public float motorSpeed;

    /**
     * The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
     */
    public float maxMotorTorque;

    public RevoluteJointDef() {
        super(JointType.REVOLUTE);
        localAnchorA = new Vec2(0.0f, 0.0f);
        localAnchorB = new Vec2(0.0f, 0.0f);
        referenceAngle = 0.0f;
        lowerAngle = 0.0f;
        upperAngle = 0.0f;
        maxMotorTorque = 0.0f;
        motorSpeed = 0.0f;
        enableLimit = false;
        enableMotor = false;
    }

    /**
     * Initialize the bodies, anchors, and reference angle using the world anchor.
     *
     * @param b1
     * @param b2
     * @param anchor
     */
    public void initialize(final Body b1, final Body b2, final Vec2 anchor) {
        bodyA = b1;
        bodyB = b2;
        bodyA.getLocalPointToOut(anchor, localAnchorA);
        bodyB.getLocalPointToOut(anchor, localAnchorB);
        referenceAngle = bodyB.getAngle() - bodyA.getAngle();
    }
}
