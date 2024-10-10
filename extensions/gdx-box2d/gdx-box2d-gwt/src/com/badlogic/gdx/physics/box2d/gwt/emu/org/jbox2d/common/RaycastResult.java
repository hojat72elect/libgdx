

package org.jbox2d.common;

// updated to rev 100

public class RaycastResult {
	public float lambda = 0.0f;
	public final Vec2 normal = new Vec2();

	public RaycastResult set (RaycastResult argOther) {
		lambda = argOther.lambda;
		normal.set(argOther.normal);
		return this;
	}
}
