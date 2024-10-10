package org.jbox2d.collision.shapes;

import org.jbox2d.common.Vec2;

// Updated to rev 100

/**
 * This holds the mass data computed for a shape.
 */
public class MassData {
    /**
     * The position of the shape's centroid relative to the shape's origin.
     */
    public final Vec2 center;
    /**
     * The mass of the shape, usually in kilograms.
     */
    public float mass;
    /**
     * The rotational inertia of the shape about the local origin.
     */
    public float I;

    /**
     * Blank mass data
     */
    public MassData() {
        mass = I = 0f;
        center = new Vec2();
    }

    /**
     * Copies from the given mass data
     *
     * @param md mass data to copy from
     */
    public MassData(MassData md) {
        mass = md.mass;
        I = md.I;
        center = md.center.clone();
    }

    public void set(MassData md) {
        mass = md.mass;
        I = md.I;
        center.set(md.center);
    }

    /**
     * Return a copy of this object.
     */
    public MassData clone() {
        return new MassData(this);
    }
}
