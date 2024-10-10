

package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/** A Camera with perspective projection.
 * 
 *  */
public class PerspectiveCamera extends Camera {
	/** the field of view of the height, in degrees **/
	public float fieldOfView = 67;

	public PerspectiveCamera () {
	}

	/** Constructs a new {@link PerspectiveCamera} with the given field of view and viewport size. The aspect ratio is derived from
	 * the viewport size.
	 * 
	 * @param fieldOfViewY the field of view of the height, in degrees, the field of view for the width will be calculated
	 *           according to the aspect ratio.
	 * @param viewportWidth the viewport width
	 * @param viewportHeight the viewport height */
	public PerspectiveCamera (float fieldOfViewY, float viewportWidth, float viewportHeight) {
		this.fieldOfView = fieldOfViewY;
		this.viewportWidth = viewportWidth;
		this.viewportHeight = viewportHeight;
		update();
	}

	final Vector3 tmp = new Vector3();

	@Override
	public void update () {
		update(true);
	}

	@Override
	public void update (boolean updateFrustum) {
		float aspect = viewportWidth / viewportHeight;
		projection.setToProjection(Math.abs(near), Math.abs(far), fieldOfView, aspect);
		view.setToLookAt(position, tmp.set(position).add(direction), up);
		combined.set(projection);
		Matrix4.mul(combined.val, view.val);

		if (updateFrustum) {
			invProjectionView.set(combined);
			Matrix4.inv(invProjectionView.val);
			frustum.update(invProjectionView);
		}
	}
}
