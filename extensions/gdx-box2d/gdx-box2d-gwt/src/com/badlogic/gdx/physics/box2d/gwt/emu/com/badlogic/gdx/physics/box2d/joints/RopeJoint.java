package com.badlogic.gdx.physics.box2d.joints;

import org.jbox2d.common.Vec2;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;

/**
 * A rope joint enforces a maximum distance between two points on two bodies. It has no other effect. Warning: if you attempt to
 * change the maximum length during the simulation you will get some non-physical behavior. A model that would allow you to
 * dynamically modify the length would have some sponginess, so I chose not to implement it that way. See b2DistanceJoint if you
 * want to dynamically control length.
 */
public class RopeJoint extends Joint {
    org.jbox2d.dynamics.joints.RopeJoint joint;

    Vector2 localAnchorA = new Vector2();
    Vector2 localAnchorB = new Vector2();

    public RopeJoint(World world, org.jbox2d.dynamics.joints.RopeJoint joint) {
        super(world, joint);
        this.joint = joint;
    }

    public Vector2 getLocalAnchorA() {
        Vec2 localAnchor = joint.getLocalAnchorA();
        localAnchorA.set(localAnchor.x, localAnchor.y);
        return localAnchorA;
    }

    public Vector2 getLocalAnchorB() {
        Vec2 localAnchor = joint.getLocalAnchorB();
        localAnchorB.set(localAnchor.x, localAnchor.y);
        return localAnchorB;
    }

    /**
     * Get the maximum length of the rope.
     */
    public float getMaxLength() {
        return joint.getMaxLength();
    }

    public void setMaxLength(float maxLength) {
        joint.setMaxLength(maxLength);
    }

}
