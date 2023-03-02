package com.badlogic.gdx.math

import org.junit.Test
import org.junit.Assert.assertEquals

class Vector2Test {

    @Test
    fun `test converting the Vector2 to string`() {

        assertEquals(
            "(-5.0,42.00055)",
            Vector2(-5f, 42.00055f).toString()
        )
    }

    @Test
    fun `test converting a string to Vector2`() {
        assertEquals(Vector2(-5f, 42.00055f), Vector2().fromString("(-5,42.00055)"))
    }

    @Test
    fun `test angle of vector2 in degrees`() {

        assertEquals(270f, Vector2(0f, -1f).angleDeg(), MathUtils.FLOAT_ROUNDING_ERROR)
    }

    @Test
    fun `test the relative angle of vector2 (in degrees)`() {

        assertEquals(270f, Vector2(0f, -1f).angleDeg(Vector2.X), MathUtils.FLOAT_ROUNDING_ERROR)
    }

    @Test
    fun `test angle of vector2 in radian`() {

        assertEquals(
            -MathUtils.HALF_PI,
            Vector2(0f, -1f).angleRad(),
            MathUtils.FLOAT_ROUNDING_ERROR
        )
    }

    @Test
    fun `test the relative angle of vector2 (in radian)`() {
        assertEquals(
            -MathUtils.HALF_PI,
            Vector2(0f, -1f).angleRad(Vector2.X),
            MathUtils.FLOAT_ROUNDING_ERROR
        )
    }
}