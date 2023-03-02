package com.badlogic.gdx.math

import org.junit.Assert.assertEquals
import org.junit.Test

class Vector3Test {

    @Test
    fun `test converting a Vector3 to string`() {
        assertEquals(
            "(-5.0,42.00055,44444.32)",
            Vector3(-5f, 42.00055f, 44444.32f).toString()
        )

    }

    @Test
    fun `test converting string to Vector3`() {
        assertEquals(
            Vector3(-5f, 42.00055f, 44444.32f),
            Vector3().fromString("(-5,42.00055,44444.32)")
        )
    }
}