package org.jbox2d.collision;

import org.jbox2d.common.Vec2;

/**
 * Output for Distance.
 */
public class DistanceOutput {
    /**
     * Closest point on shapeA
     */
    public final Vec2 pointA = new Vec2();

    /**
     * Closest point on shapeB
     */
    public final Vec2 pointB = new Vec2();

    public float distance;

    /**
     * number of gjk iterations used
     */
    public int iterations;
}
