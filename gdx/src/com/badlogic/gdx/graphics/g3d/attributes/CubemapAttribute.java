

package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.g3d.Attribute;
import com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class CubemapAttribute extends Attribute {
	public final static String EnvironmentMapAlias = "environmentCubemap";
	public final static long EnvironmentMap = register(EnvironmentMapAlias);

	protected static long Mask = EnvironmentMap;

	public final static boolean is (final long mask) {
		return (mask & Mask) != 0;
	}

	public final TextureDescriptor<Cubemap> textureDescription;

	public CubemapAttribute (final long type) {
		super(type);
		if (!is(type)) throw new GdxRuntimeException("Invalid type specified");
		textureDescription = new TextureDescriptor<Cubemap>();
	}

	public <T extends Cubemap> CubemapAttribute (final long type, final TextureDescriptor<T> textureDescription) {
		this(type);
		this.textureDescription.set(textureDescription);
	}

	public CubemapAttribute (final long type, final Cubemap texture) {
		this(type);
		textureDescription.texture = texture;
	}

	public CubemapAttribute (final CubemapAttribute copyFrom) {
		this(copyFrom.type, copyFrom.textureDescription);
	}

	@Override
	public Attribute copy () {
		return new CubemapAttribute(this);
	}

	@Override
	public int hashCode () {
		int result = super.hashCode();
		result = 967 * result + textureDescription.hashCode();
		return result;
	}

	@Override
	public int compareTo (Attribute o) {
		if (type != o.type) return (int)(type - o.type);
		return textureDescription.compareTo(((CubemapAttribute)o).textureDescription);
	}
}
