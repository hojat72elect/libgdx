package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.JointDef;

/**
 * Rope joint definition. This requires two body anchor points and a maximum lengths. Note: by default the connected objects will
 * not collide. see collideConnected in b2JointDef.
 */
public class RopeJointDef extends JointDef {
    /**
     * The local anchor point relative to bodyA's origin.
     **/
    public final Vector2 localAnchorA = new Vector2(-1, 0);
    /**
     * The local anchor point relative to bodyB's origin.
     **/
    public final Vector2 localAnchorB = new Vector2(1, 0);
    /**
     * The maximum length of the rope. Warning: this must be larger than b2_linearSlop or the joint will have no effect.
     */
    public float maxLength = 0;

    public RopeJointDef() {
        type = JointType.RopeJoint;
    }

    @Override
    public org.jbox2d.dynamics.joints.JointDef toJBox2d() {
        org.jbox2d.dynamics.joints.RopeJointDef fd = new org.jbox2d.dynamics.joints.RopeJointDef();
        fd.bodyA = bodyA.body;
        fd.bodyB = bodyB.body;
        fd.collideConnected = collideConnected;
        fd.maxLength = maxLength;
        fd.localAnchorA.set(localAnchorA.x, localAnchorA.y);
        fd.localAnchorB.set(localAnchorB.x, localAnchorB.y);
        fd.type = org.jbox2d.dynamics.joints.JointType.ROPE;
        return fd;
    }
}
