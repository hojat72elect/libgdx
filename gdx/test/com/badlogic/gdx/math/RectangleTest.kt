package com.badlogic.gdx.math

import org.junit.Assert.assertEquals
import org.junit.Test

class RectangleTest {

    @Test
    fun `test converting a Rectangle to string`() {
        assertEquals(
            "[5.0,-4.1,0.03,-0.02]",
            Rectangle(5f, -4.1f, 0.03f, -0.02f).toString()
        )
    }

    @Test
    fun `test converting string to Rectangle`() {
        assertEquals(
            Rectangle(5f, -4.1f, 0.03f, -0.02f),
            Rectangle().fromString("[5.0,-4.1,0.03,-0.02]")
        )
    }
}