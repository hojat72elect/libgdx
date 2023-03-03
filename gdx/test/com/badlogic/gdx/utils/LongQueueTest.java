package com.badlogic.gdx.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class LongQueueTest {


    @Test
    public void resizableQueueTest() {
        final LongQueue q = new LongQueue(8);

        assertEquals("New queue is not empty!", 0, q.size);

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < i; j++) {
                try {
                    q.addLast(j);
                } catch (IllegalStateException e) {
                    fail("Failed to add element " + j + " (" + i + ")");
                }
                final long peeked = q.last();
                assertEquals("peekLast shows " + peeked + ", should be " + j + " (" + i + ")", peeked, j);
                final int size = q.size;
                assertEquals("Size should be " + (j + 1) + " but is " + size + " (" + i + ")", size, j + 1);
            }

            if (i != 0) {
                final long peek = q.first();
                assertEquals("First thing is not zero but " + peek + " (" + i + ")", 0, peek);
            }

            for (int j = 0; j < i; j++) {
                final long pop = q.removeFirst();
                assertEquals("Popped should be " + j + " but is " + pop + " (" + i + ")", pop, j);

                final int size = q.size;
                assertEquals("Size should be " + (i - 1 - j) + " but is " + size + " (" + i + ")", size, i - 1 - j);
            }

            assertEquals("Not empty after cycle " + i, 0, q.size);
        }

        for (int i = 0; i < 56; i++) {
            q.addLast(42);
        }
        q.clear();
        assertEquals("Clear did not clear properly", 0, q.size);
    }

    /**
     * Same as resizableQueueTest, but in reverse
     */
    @Test
    public void resizableDequeTest() {
        final LongQueue q = new LongQueue(8);

        assertEquals("New deque is not empty!", 0, q.size);

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < i; j++) {
                try {
                    q.addFirst(j);
                } catch (IllegalStateException e) {
                    fail("Failed to add element " + j + " (" + i + ")");
                }
                final long peeked = q.first();
                assertEquals("peek shows " + peeked + ", should be " + j + " (" + i + ")", peeked, j);
                final int size = q.size;
                assertEquals("Size should be " + (j + 1) + " but is " + size + " (" + i + ")", size, j + 1);
            }

            if (i != 0) {
                final long peek = q.last();
                assertEquals("Last thing is not zero but " + peek + " (" + i + ")", 0, peek);
            }

            for (int j = 0; j < i; j++) {
                final long pop = q.removeLast();
                assertEquals("Popped should be " + j + " but is " + pop + " (" + i + ")", pop, j);

                final int size = q.size;
                assertEquals("Size should be " + (i - 1 - j) + " but is " + size + " (" + i + ")", size, i - 1 - j);
            }

            assertEquals("Not empty after cycle " + i, 0, q.size);
        }

        for (int i = 0; i < 56; i++) {
            q.addFirst(42);
        }
        q.clear();
        assertEquals("Clear did not clear properly", 0, q.size);
    }

    @Test
    public void getTest() {
        final LongQueue q = new LongQueue(7);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                q.addLast(j);
            }
            assertEquals("get(0) is not equal to peek (" + i + ")", q.get(0), q.first());
            assertEquals("get(size-1) is not equal to peekLast (" + i + ")", q.get(q.size - 1), q.last());
            for (int j = 0; j < 4; j++) {
                assertEquals(q.get(j), j);
            }
            for (int j = 0; j < 4 - 1; j++) {
                q.removeFirst();
                assertEquals("get(0) is not equal to peek (" + i + ")", q.get(0), q.first());
            }
            q.removeFirst();
            assert q.size == 0; // Failing this means broken test
            try {
                q.get(0);
                fail("get() on empty queue did not throw");
            } catch (IndexOutOfBoundsException ignore) {
                // Expected
            }
        }
    }

    @Test
    public void removeTest() {
        final LongQueue q = new LongQueue();

        // Test head < tail.
        for (int j = 0; j <= 6; j++)
            q.addLast(j);
        assertValues(q, 0, 1, 2, 3, 4, 5, 6);
        q.removeIndex(0);
        assertValues(q, 1, 2, 3, 4, 5, 6);
        q.removeIndex(1);
        assertValues(q, 1, 3, 4, 5, 6);
        q.removeIndex(4);
        assertValues(q, 1, 3, 4, 5);
        q.removeIndex(2);
        assertValues(q, 1, 3, 5);

        // Test head >= tail and index >= head.
        q.clear();
        for (int j = 2; j >= 0; j--)
            q.addFirst(j);
        for (int j = 3; j <= 6; j++)
            q.addLast(j);
        assertValues(q, 0, 1, 2, 3, 4, 5, 6);
        q.removeIndex(1);
        assertValues(q, 0, 2, 3, 4, 5, 6);
        q.removeIndex(0);
        assertValues(q, 2, 3, 4, 5, 6);

        // Test head >= tail and index < tail.
        q.clear();
        for (int j = 2; j >= 0; j--)
            q.addFirst(j);
        for (int j = 3; j <= 6; j++)
            q.addLast(j);
        assertValues(q, 0, 1, 2, 3, 4, 5, 6);
        q.removeIndex(5);
        assertValues(q, 0, 1, 2, 3, 4, 6);
        q.removeIndex(5);
        assertValues(q, 0, 1, 2, 3, 4);
    }

    @Test
    public void indexOfTest() {
        final LongQueue q = new LongQueue();

        // Test head < tail.
        for (int j = 0; j <= 6; j++)
            q.addLast(j);
        for (int j = 0; j <= 6; j++)
            assertEquals(q.indexOf(j), j);

        // Test head >= tail.
        q.clear();
        for (int j = 2; j >= 0; j--)
            q.addFirst(j);
        for (int j = 3; j <= 6; j++)
            q.addLast(j);
        for (int j = 0; j <= 6; j++)
            assertEquals(q.indexOf(j), j);
    }

    @Test
    public void hashEqualsTest() {
        LongQueue q1 = new LongQueue();
        LongQueue q2 = new LongQueue();

        assertEqualsAndHash(q1, q2);
        q1.addFirst(1);
        assertNotEquals(q1, q2);
        q2.addFirst(1);
        assertEqualsAndHash(q1, q2);

        q1.clear();
        q1.addLast(1);
        q1.addLast(2);
        q2.addLast(2);
        assertEqualsAndHash(q1, q2);

        for (int i = 0; i < 100; i++) {
            q1.addLast(i);
            q1.addLast(i);
            q1.removeFirst();

            assertNotEquals(q1, q2);

            q2.addLast(i);
            q2.addLast(i);
            q2.removeFirst();

            assertEqualsAndHash(q1, q2);
        }
    }

    private void assertEqualsAndHash(LongQueue q1, LongQueue q2) {
        assertEquals(q1, q2);
        assertEquals("Hash codes are not equal", q1.hashCode(), q2.hashCode());
    }

    private void assertValues(LongQueue q, long... values) {
        for (int i = 0, n = values.length; i < n; i++) {
            Assert.assertEquals(values[i], q.get(i));
        }
    }
}
