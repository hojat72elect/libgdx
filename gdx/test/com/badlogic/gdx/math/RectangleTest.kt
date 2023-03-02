package com.badlogic.gdx.math

import org.junit.Assert.assertEquals
import org.junit.Test

class RectangleTest {
    private val mockRectangleString = "[5.0,-4.1,0.03,-0.02]"
    private val mockRectangle = Rectangle(5f, -4.1f, 0.03f, -0.02f)
    private val defaultRectangle = Rectangle()

    @Test
    fun `test converting a Rectangle to string`() {
        assertEquals(
            mockRectangleString,
            mockRectangle.toString()
        )
        assertEquals(
            "[0.0,0.0,0.0,0.0]",
            defaultRectangle.toString()
        )
    }

    @Test
    fun `test converting string to Rectangle`() {
        assertEquals(
            mockRectangle,
            Rectangle().fromString(mockRectangleString)
        )
        assertEquals(
            defaultRectangle,
            Rectangle().fromString("[0.0,0.0,0.0,0.0]")
        )
    }

    @Test
    fun `test area of Rectangle`() {
        assertEquals(
            (-5.9999997E-4).toFloat(), mockRectangle.area()
        )
        assertEquals(0.0f, defaultRectangle.area())
    }

    @Test
    fun `test perimeter of Rectangle`() {
        assertEquals(
            0.02f, mockRectangle.perimeter()
        )
        assertEquals(
            0.0f, defaultRectangle.perimeter()
        )
    }

    @Test
    fun `gets a correct rectangle from another rectangle`() {
        val newRectangle = Rectangle(mockRectangle)
        assertEquals(mockRectangle, newRectangle)
    }

    @Test
    fun `test whether coordination of rectangle can be changed correctly`() {
        val newRectangle = mockRectangle.setX(0f).setY(0f)
        assertEquals(Rectangle(0f, 0f, mockRectangle.width, mockRectangle.height), newRectangle)

    }
}