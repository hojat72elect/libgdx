
/*
 * JBox2D - A Java Port of Erin Catto's Box2D
 *
 * JBox2D homepage: http://jbox2d.sourceforge.net/
 * Box2D homepage: http://www.box2d.org
 */

package org.jbox2d.dynamics.joints;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;

//Updated to rev 56->130->142 of b2DistanceJoint.cpp/.h

/**
 * Distance joint definition. This requires defining an anchor point on both bodies and the non-zero length of the distance
 * joint. The definition uses local anchor points so that the initial configuration can violate the constraint slightly. This
 * helps when saving and loading a game.
 *
 * @warning Do not use a zero or short length.
 */
public class DistanceJointDef extends JointDef {
    /**
     * The local anchor point relative to body1's origin.
     */
    public final Vec2 localAnchorA;

    /**
     * The local anchor point relative to body2's origin.
     */
    public final Vec2 localAnchorB;

    /**
     * The equilibrium length between the anchor points.
     */
    public float length;

    /**
     * The mass-spring-damper frequency in Hertz.
     */
    public float frequencyHz;

    /**
     * The damping ratio. 0 = no damping, 1 = critical damping.
     */
    public float dampingRatio;

    public DistanceJointDef() {
        super(JointType.DISTANCE);
        localAnchorA = new Vec2(0.0f, 0.0f);
        localAnchorB = new Vec2(0.0f, 0.0f);
        length = 1.0f;
        frequencyHz = 0.0f;
        dampingRatio = 0.0f;
    }

    /**
     * Initialize the bodies, anchors, and length using the world anchors.
     *
     * @param b1      First body
     * @param b2      Second body
     * @param anchor1 World anchor on first body
     * @param anchor2 World anchor on second body
     */
    public void initialize(final Body b1, final Body b2, final Vec2 anchor1, final Vec2 anchor2) {
        bodyA = b1;
        bodyB = b2;
        localAnchorA.set(bodyA.getLocalPoint(anchor1));
        localAnchorB.set(bodyB.getLocalPoint(anchor2));
        Vec2 d = anchor2.sub(anchor1);
        length = d.length();
    }
}
