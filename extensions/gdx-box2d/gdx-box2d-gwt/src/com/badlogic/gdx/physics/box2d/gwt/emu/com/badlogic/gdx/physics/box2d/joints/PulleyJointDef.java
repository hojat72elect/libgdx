package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.JointDef;

/**
 * Pulley joint definition. This requires two ground anchors, two dynamic body anchor points, max lengths for each side, and a
 * pulley ratio.
 */
public class PulleyJointDef extends JointDef {
    private final static float minPulleyLength = 2.0f;
    /**
     * The first ground anchor in world coordinates. This point never moves.
     */
    public final Vector2 groundAnchorA = new Vector2(-1, 1);
    /**
     * The second ground anchor in world coordinates. This point never moves.
     */
    public final Vector2 groundAnchorB = new Vector2(1, 1);
    /**
     * The local anchor point relative to bodyA's origin.
     */
    public final Vector2 localAnchorA = new Vector2(-1, 0);
    /**
     * The local anchor point relative to bodyB's origin.
     */
    public final Vector2 localAnchorB = new Vector2(1, 0);
    /**
     * The a reference length for the segment attached to bodyA.
     */
    public float lengthA = 0;
    /**
     * The a reference length for the segment attached to bodyB.
     */
    public float lengthB = 0;
    /**
     * The pulley ratio, used to simulate a block-and-tackle.
     */
    public float ratio = 1;

    public PulleyJointDef() {
        type = JointType.PulleyJoint;
        collideConnected = true;
    }

    /**
     * Initialize the bodies, anchors, lengths, max lengths, and ratio using the world anchors.
     */
    public void initialize(Body bodyA, Body bodyB, Vector2 groundAnchorA, Vector2 groundAnchorB, Vector2 anchorA, Vector2 anchorB,
                           float ratio) {
        this.bodyA = bodyA;
        this.bodyB = bodyB;
        this.groundAnchorA.set(groundAnchorA);
        this.groundAnchorB.set(groundAnchorB);
        this.localAnchorA.set(bodyA.getLocalPoint(anchorA));
        this.localAnchorB.set(bodyB.getLocalPoint(anchorB));
        lengthA = anchorA.dst(groundAnchorA);
        lengthB = anchorB.dst(groundAnchorB);
        this.ratio = ratio;
        float C = lengthA + ratio * lengthB;
    }

    @Override
    public org.jbox2d.dynamics.joints.JointDef toJBox2d() {
        org.jbox2d.dynamics.joints.PulleyJointDef jd = new org.jbox2d.dynamics.joints.PulleyJointDef();
        jd.bodyA = bodyA.body;
        jd.bodyB = bodyB.body;
        jd.collideConnected = collideConnected;
        jd.groundAnchorA.set(groundAnchorA.x, groundAnchorB.y);
        jd.groundAnchorB.set(groundAnchorB.x, groundAnchorB.y);
        jd.lengthA = lengthA;
        jd.lengthB = lengthB;
        jd.localAnchorA.set(localAnchorA.x, localAnchorA.y);
        jd.localAnchorB.set(localAnchorB.x, localAnchorB.y);
        jd.ratio = ratio;
        jd.type = org.jbox2d.dynamics.joints.JointType.PULLEY;
        return jd;
    }
}
