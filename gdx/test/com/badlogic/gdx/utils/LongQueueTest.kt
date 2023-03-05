package com.badlogic.gdx.utils

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class LongQueueTest {

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

    @Test
    fun `tests the resizability of the queue`() {

        val q = LongQueue(8)
        assertEquals("New queue is not empty!", 0, q.size)
        for (i in 0..99) {
            for (j in 0 until i) {
                try {
                    q.addLast(j.toLong())
                } catch (e: IllegalStateException) {
                    fail("Failed to add element $j ($i)")
                }
                val peeked = q.last()
                assertEquals("peekLast shows $peeked, should be $j ($i)", peeked, j.toLong())
                val size = q.size
                assertEquals("Size should be ${j + 1} but is $size ($i)", size, j + 1)
            }
            if (i != 0) {
                val peek = q.first()
                assertEquals("First thing is not zero but $peek ($i)", 0, peek)
            }
            for (j in 0 until i) {
                val pop = q.removeFirst()
                assertEquals("Popped should be $j but is $pop ($i)", pop, j.toLong())
                val size = q.size
                assertEquals(
                    "Size should be ${i - 1 - j} but is $size ($i)", size, i - 1 - j
                )
            }
            assertEquals("Not empty after cycle $i", 0, q.size)
        }
        for (i in 0..55) {
            q.addLast(42)
        }
        q.clear()
        assertEquals("Clear did not clear properly", 0, q.size)
    }

    @Test
    fun `tests the resizability of the dequeue`() {
        val q = LongQueue(8)
        assertEquals("New deque is not empty!", 0, q.size)
        for (i in 0..99) {
            for (j in 0 until i) {
                try {
                    q.addFirst(j.toLong())
                } catch (e: IllegalStateException) {
                    fail("Failed to add element $j ($i)")
                }
                val peeked = q.first()
                assertEquals("peek shows $peeked, should be $j ($i)", peeked, j.toLong())
                val size = q.size
                assertEquals("Size should be ${j + 1} but is $size ($i)", size, (j + 1))
            }
            if (i != 0) {
                val peek = q.last()
                assertEquals("Last thing is not zero but $peek ($i)", 0, peek)
            }
            for (j in 0 until i) {
                val pop = q.removeLast()
                assertEquals("Popped should be $j but is $pop ($i)", pop, j.toLong())
                val size = q.size
                assertEquals("Size should be ${i - 1 - j} but is $size ($i)", size, (i - 1 - j))
            }
            assertEquals("Not empty after cycle $i", 0, q.size)
        }
        for (i in 0..55) {
            q.addFirst(42)
        }
        q.clear()
        assertEquals("Clear did not clear properly", 0, q.size)
    }

    @Test
    fun `tests getting and peeking functions of the queue`() {
        val q = LongQueue(7)
        for (i in 0..4) {
            for (j in 0..3) {
                q.addLast(j.toLong())
            }
            assertEquals("get(0) is not equal to peek ($i)", q[0], q.first())
            assertEquals("get(size-1) is not equal to peekLast ($i)", q[q.size - 1], q.last())
            for (j in 0..3) {
                assertEquals(q[j], j.toLong())
            }
            for (j in 0 until 4 - 1) {
                q.removeFirst()
                assertEquals("get(0) is not equal to peek ($i)", q[0], q.first())
            }
            q.removeFirst()
            assert(
                q.size == 0 // Failing this means broken test
            )
            try {
                q[0]
                fail("get() on empty queue did not throw")
            } catch (ignore: IndexOutOfBoundsException) {
                // Expected
            }
        }
    }

    @Test
    fun removeTest() {
        val q = LongQueue()

        // Test head < tail.
        for (j in 0..6) q.addLast(j.toLong())
        assertValues(q, 0, 1, 2, 3, 4, 5, 6)
        q.removeIndex(0)
        assertValues(q, 1, 2, 3, 4, 5, 6)
        q.removeIndex(1)
        assertValues(q, 1, 3, 4, 5, 6)
        q.removeIndex(4)
        assertValues(q, 1, 3, 4, 5)
        q.removeIndex(2)
        assertValues(q, 1, 3, 5)

        // Test head >= tail and index >= head.
        q.clear()
        for (j in 2 downTo 0) q.addFirst(j.toLong())
        for (j in 3..6) q.addLast(j.toLong())
        assertValues(q, 0, 1, 2, 3, 4, 5, 6)
        q.removeIndex(1)
        assertValues(q, 0, 2, 3, 4, 5, 6)
        q.removeIndex(0)
        assertValues(q, 2, 3, 4, 5, 6)

        // Test head >= tail and index < tail.
        q.clear()
        for (j in 2 downTo 0) q.addFirst(j.toLong())
        for (j in 3..6) q.addLast(j.toLong())
        assertValues(q, 0, 1, 2, 3, 4, 5, 6)
        q.removeIndex(5)
        assertValues(q, 0, 1, 2, 3, 4, 6)
        q.removeIndex(5)
        assertValues(q, 0, 1, 2, 3, 4)
    }

    @Test
    fun indexOfTest() {
        val q = LongQueue()

        // Test head < tail.
        for (j in 0..6) q.addLast(j.toLong())
        for (j in 0..6) assertEquals(q.indexOf(j.toLong()), j)

        // Test head >= tail.
        q.clear()
        for (j in 2 downTo 0) q.addFirst(j.toLong())
        for (j in 3..6) q.addLast(j.toLong())
        for (j in 0..6) assertEquals(q.indexOf(j.toLong()), j)
    }

    @Test
    fun hashEqualsTest() {
        val q1 = LongQueue()
        val q2 = LongQueue()
        assertEqualsAndHash(q1, q2)
        q1.addFirst(1)
        Assert.assertNotEquals(q1, q2)
        q2.addFirst(1)
        assertEqualsAndHash(q1, q2)
        q1.clear()
        q1.addLast(1)
        q1.addLast(2)
        q2.addLast(2)
        assertEqualsAndHash(q1, q2)
        for (i in 0..99) {
            q1.addLast(i.toLong())
            q1.addLast(i.toLong())
            q1.removeFirst()
            Assert.assertNotEquals(q1, q2)
            q2.addLast(i.toLong())
            q2.addLast(i.toLong())
            q2.removeFirst()
            assertEqualsAndHash(q1, q2)
        }
    }

    private fun assertEqualsAndHash(q1: LongQueue, q2: LongQueue) {
        assertEquals(q1, q2)
        assertEquals("Hash codes are not equal", q1.hashCode(), q2.hashCode())
    }

    private fun assertValues(q: LongQueue, vararg values: Long) {
        var i = 0
        val n = values.size
        while (i < n) {
            assertEquals(values[i], q[i])
            i++
        }
    }
}