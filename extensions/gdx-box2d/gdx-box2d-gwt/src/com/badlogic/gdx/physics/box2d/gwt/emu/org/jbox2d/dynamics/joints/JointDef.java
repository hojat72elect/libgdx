package org.jbox2d.dynamics.joints;

import org.jbox2d.dynamics.Body;

/**
 * Joint definitions are used to construct joints.
 */
public class JointDef {

    /**
     * The joint type is set automatically for concrete joint types.
     */
    public JointType type;
    /**
     * Use this to attach application specific data to your joints.
     */
    public Object userData;
    /**
     * The first attached body.
     */
    public Body bodyA;
    /**
     * The second attached body.
     */
    public Body bodyB;
    /**
     * Set this flag to true if the attached bodies should collide.
     */
    public boolean collideConnected;

    public JointDef(JointType type) {
        this.type = type;
        userData = null;
        bodyA = null;
        bodyB = null;
        collideConnected = false;
    }
}
