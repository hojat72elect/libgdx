

package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.utils.SharedLibraryLoader;

/** This class's only purpose is to initialize Box2D by calling its {@link #init()} method.
 * @author Daniel Holderbaum */
public final class Box2D {

	private Box2D () {
	}

	/** Loads the Box2D native library and initializes the gdx-box2d extension. Must be called before any of the box2d
	 * classes/methods can be used. Currently with the exception of the {@link World} class, which will also cause the Box2D
	 * natives to be loaded. */
	public static void init () {
		new SharedLibraryLoader().load("gdx-box2d");
	}

}
