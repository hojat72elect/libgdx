package com.badlogic.gdx.physics.box2d;

/**
 * This holds contact filtering data.
 */
public class Filter {
    /**
     * The collision category bits. Normally you would just set one bit.
     */
    public short categoryBits = 0x0001;

    /**
     * The collision mask bits. This states the categories that this shape would accept for collision.
     */
    public short maskBits = -1;

    /**
     * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no
     * collision group. Non-zero group filtering always wins against the mask bits.
     */
    public short groupIndex = 0;
}
