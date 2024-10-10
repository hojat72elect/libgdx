

package com.badlogic.gdx.graphics.g3d.model;

/** A NodeKeyframe specifies the a value (e.g. the translation, rotation or scale) of a frame within a {@link NodeAnimation}.
 * @author badlogic, Xoppa */
public class NodeKeyframe<T> {
	/** the timestamp of this keyframe **/
	public float keytime;
	/** the value of this keyframe at the specified timestamp **/
	public final T value;

	public NodeKeyframe (final float t, final T v) {
		keytime = t;
		value = v;
	}
}
