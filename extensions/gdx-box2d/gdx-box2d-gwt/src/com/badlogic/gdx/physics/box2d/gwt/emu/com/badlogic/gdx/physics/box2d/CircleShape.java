package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/**
 * A circle shape.
 */
public class CircleShape extends Shape {
    /**
     * Returns the position of the shape
     */
    private final Vector2 position = new Vector2();
    org.jbox2d.collision.shapes.CircleShape shape;

    public CircleShape() {
        super(new org.jbox2d.collision.shapes.CircleShape());
        shape = (org.jbox2d.collision.shapes.CircleShape) super.shape;
    }

    CircleShape(org.jbox2d.collision.shapes.CircleShape shape) {
        super(shape);
        this.shape = shape;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Type getType() {
        return Type.Circle;
    }

    public Vector2 getPosition() {
        return position.set(shape.m_p.x, shape.m_p.y);
    }

    /**
     * Sets the position of the shape
     */
    public void setPosition(Vector2 position) {
        shape.m_p.set(position.x, position.y);
    }

    @Override
    public float getRadius() {
        return shape.getRadius();
    }

    @Override
    public void setRadius(float radius) {
        shape.setRadius(radius);
    }

    @Override
    public int getChildCount() {
        return shape.getChildCount();
    }
}
