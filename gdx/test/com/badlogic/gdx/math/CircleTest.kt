package com.badlogic.gdx.math

import org.junit.Assert
import org.junit.Test

class CircleTest {

    @Test
    fun `tests overlapping and containing between circles`() {

        val c1 = Circle(0f, 0f, 1f)
        val c2 = Circle(0f, 0f, 1f)
        val c3 = Circle(2f, 0f, 1f)
        val c4 = Circle(0f, 0f, 2f)

        Assert.assertTrue(c1.overlaps(c1))
        Assert.assertTrue(c1.overlaps(c2))
        Assert.assertFalse(c1.overlaps(c3))
        Assert.assertTrue(c1.overlaps(c4))
        Assert.assertTrue(c4.overlaps(c1))
        Assert.assertTrue(c1.contains(0f, 1f))
        Assert.assertFalse(c1.contains(0f, 2f))
        Assert.assertTrue(c1.contains(c1))
        Assert.assertFalse(c1.contains(c4))
        Assert.assertTrue(c4.contains(c1))
    }
}