package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.JointDef.JointType;
import org.jbox2d.common.Vec2;

public abstract class Joint {
    /**
     * Get the anchor point on bodyA in world coordinates.
     */
    final Vec2 tmp = new Vec2();
    private final Vector2 anchorA = new Vector2();
    /**
     * Get the anchor point on bodyB in world coordinates.
     */
    private final Vector2 anchorB = new Vector2();
    /**
     * Get the reaction force on body2 at the joint anchor in Newtons.
     */
    private final Vector2 reactionForce = new Vector2();
    World world;
    org.jbox2d.dynamics.joints.Joint joint;
    Object userData;
    JointEdge jointEdgeA;
    JointEdge jointEdgeB;

    /**
     * Constructs a new joint
     *
     * @param addr the address of the joint
     */
    protected Joint(World world, org.jbox2d.dynamics.joints.Joint joint) {
        this.world = world;
        this.joint = joint;
    }

    /**
     * Get the type of the concrete joint.
     */
    public JointType getType() {
        org.jbox2d.dynamics.joints.JointType type2 = joint.getType();
        if (type2 == org.jbox2d.dynamics.joints.JointType.DISTANCE) return JointType.DistanceJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.FRICTION) return JointType.FrictionJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.GEAR) return JointType.GearJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.MOUSE) return JointType.MouseJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.PRISMATIC) return JointType.PrismaticJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.PULLEY) return JointType.PulleyJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.REVOLUTE) return JointType.RevoluteJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.ROPE) return JointType.RopeJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.UNKNOWN) return JointType.Unknown;
        if (type2 == org.jbox2d.dynamics.joints.JointType.WELD) return JointType.WeldJoint;
        if (type2 == org.jbox2d.dynamics.joints.JointType.WHEEL) return JointType.WheelJoint;
        return JointType.Unknown;
    }

    /**
     * Get the first body attached to this joint.
     */
    public Body getBodyA() {
        return world.bodies.get(joint.getBodyA());
    }

    /**
     * Get the second body attached to this joint.
     */
    public Body getBodyB() {
        return world.bodies.get(joint.getBodyB());
    }

    public Vector2 getAnchorA() {
        joint.getAnchorA(tmp);
        return anchorA.set(tmp.x, tmp.y);
    }

    public Vector2 getAnchorB() {
        joint.getAnchorB(tmp);
        return anchorB.set(tmp.x, tmp.y);
    }

    public boolean getCollideConnected() {
        return joint.getCollideConnected();
    }

    public Vector2 getReactionForce(float inv_dt) {
        joint.getReactionForce(inv_dt, tmp);
        return reactionForce.set(tmp.x, tmp.y);
    }

    /**
     * Get the reaction torque on body2 in N*m.
     */
    public float getReactionTorque(float inv_dt) {
        return joint.getReactionTorque(inv_dt);
    }

    /**
     * Get the user data
     */
    public Object getUserData() {
        return userData;
    }

    /**
     * Set the user data
     */
    public void setUserData(Object userData) {
        this.userData = userData;
    }

    /**
     * Short-cut function to determine if either body is inactive.
     */
    public boolean isActive() {
        return joint.isActive();
    }

    public org.jbox2d.dynamics.joints.Joint getJBox2DJoint() {
        return joint;
    }

}
