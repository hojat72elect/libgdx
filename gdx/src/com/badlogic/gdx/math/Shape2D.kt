package com.badlogic.gdx.math

/**
 * Any kind of 2D class that you might wanna draw
 * on the screen should be implementing this interface.
 */
interface Shape2D {

    /**
     * Returns whether the given point is contained within the shape.
     */
    fun contains(point: Vector2): Boolean

    /**
     * Returns whether a point with the given coordinates
     * is contained within the shape.
     */
    fun contains(x: Float, y: Float): Boolean
}