

package com.badlogic.gdx.physics.box2d.joints;

import org.jbox2d.common.Vec2;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;

/** A motor joint is used to control the relative motion between two bodies. A typical usage is to control the movement of a
 * dynamic body with respect to the ground. */
public class MotorJoint extends Joint {
	org.jbox2d.dynamics.joints.MotorJoint joint;

	private final Vector2 linearOffset = new Vector2();
	private final Vec2 tmp = new Vec2();

	public MotorJoint (World world, org.jbox2d.dynamics.joints.MotorJoint joint) {
		super(world, joint);
		this.joint = joint;
	}

	public Vector2 getLinearOffset () {
		joint.getLinearOffset(tmp);
		return linearOffset.set(tmp.x, tmp.y);
	}

	public void setLinearOffset (Vector2 linearOffset) {
		joint.setLinearOffset(tmp.set(linearOffset.x, linearOffset.y));
	}

	public float getAngularOffset () {
		return joint.getAngularOffset();
	}

	public void setAngularOffset (float angularOffset) {
		joint.setAngularOffset(angularOffset);
	}

	public float getMaxForce () {
		return joint.getMaxForce();
	}

	public void setMaxForce (float maxForce) {
		joint.setMaxForce(maxForce);
	}

	public float getMaxTorque () {
		return joint.getMaxTorque();
	}

	public void setMaxTorque (float maxTorque) {
		joint.setMaxTorque(maxTorque);
	}

	public float getCorrectionFactor () {
		return joint.getCorrectionFactor();
	}

	public void setCorrectionFactor (float correctionFactor) {
		joint.setCorrectionFactor(correctionFactor);
	}

}
