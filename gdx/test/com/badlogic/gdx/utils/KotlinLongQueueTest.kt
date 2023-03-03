package com.badlogic.gdx.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinLongQueueTest {

    @Test
    fun `test adding first and  last items`() {
        val queue = LongQueue().apply {
            addFirst(1)
            addLast(2)
            addFirst(3)
            addLast(4)
        }

        assertEquals(0, queue.indexOf(3))
        assertEquals(1, queue.indexOf(1))
        assertEquals(2, queue.indexOf(2))
        assertEquals(3, queue.indexOf(4))
    }

    @Test
    fun `test removing last item of queue`() {

        val queue = LongQueue().apply {
            addLast(1)
            addLast(2)
            addLast(3)
            addLast(4)
        }

        assertEquals(4, queue.size)
        assertEquals(3, queue.indexOf(4))
        assertEquals(4, queue.removeLast())
        assertEquals(3, queue.size)
        assertEquals(2, queue.indexOf(3))
        assertEquals(3, queue.removeLast())
        assertEquals(2, queue.size)
        assertEquals(1, queue.indexOf(2))
        assertEquals(2, queue.removeLast())
        assertEquals(1, queue.size)
        assertEquals(0, queue.indexOf(1))
        assertEquals(1, queue.removeLast())
        assertEquals(0, queue.size)
    }

    @Test
    fun `test removing first items`() {

        val queue = LongQueue().apply {
            addLast(1)
            addLast(2)
            addLast(3)
            addLast(4)
        }

        assertEquals(4, queue.size)
        assertEquals(0, queue.indexOf(1))
        assertEquals(1, queue.removeFirst())
        assertEquals(3, queue.size)
        assertEquals(0, queue.indexOf(2))
        assertEquals(2, queue.removeFirst())
        assertEquals(2, queue.size)
        assertEquals(0, queue.indexOf(3))
        assertEquals(3, queue.removeFirst())
        assertEquals(1, queue.size)
        assertEquals(0, queue.indexOf(4))
        assertEquals(4, queue.removeFirst())
        assertEquals(0, queue.size)
    }

    @Test
    fun `test converting to String`() {

        val q = LongQueue(1)
        assertEquals("[]", q.toString())
        q.addLast(4)
        assertEquals("[4]", q.toString())
        q.addLast(5)
        q.addLast(6)
        q.addLast(7)
        assertEquals("[4, 5, 6, 7]", q.toString())
    }
}