

package com.badlogic.gdx.physics.box2d;

/** Contact impulses for reporting. Impulses are used instead of forces because sub-step forces may approach infinity for rigid
 * body collisions. These match up one-to-one with the contact points in b2Manifold.
 *  */
public class ContactImpulse {
	org.jbox2d.callbacks.ContactImpulse impulse;
	float[] tmp = new float[2];
	final float[] normalImpulses = new float[2];
	final float[] tangentImpulses = new float[2];

	ContactImpulse () {
	}

	public float[] getNormalImpulses () {
		for (int i = 0; i < impulse.count; i++) {
			normalImpulses[i] = impulse.normalImpulses[i];
		}
		return normalImpulses;
	}

	public float[] getTangentImpulses () {
		for (int i = 0; i < impulse.count; i++) {
			tangentImpulses[i] = impulse.tangentImpulses[i];
		}
		return tangentImpulses;
	}

	public int getCount () {
		return impulse.count;
	}
}
