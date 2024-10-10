package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
import org.jbox2d.common.Vec2;

/**
 * Friction joint. This is used for top-down friction. It provides 2D translational friction and angular friction.
 */
public class FrictionJoint extends Joint {
    org.jbox2d.dynamics.joints.FrictionJoint joint;

    Vector2 localAnchorA = new Vector2();
    Vector2 localAnchorB = new Vector2();

    public FrictionJoint(World world, org.jbox2d.dynamics.joints.FrictionJoint joint) {
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
     * Get the maximum friction force in N.
     */
    public float getMaxForce() {
        return joint.getMaxForce();
    }

    /**
     * Set the maximum friction force in N.
     */
    public void setMaxForce(float force) {
        joint.setMaxForce(force);
    }

    /**
     * Get the maximum friction torque in N*m.
     */
    public float getMaxTorque() {
        return joint.getMaxTorque();
    }

    /**
     * Set the maximum friction torque in N*m.
     */
    public void setMaxTorque(float torque) {
        joint.setMaxTorque(torque);
    }
}
