package com.badlogic.gdx.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushablePoolTest {
    @Test
    public void initializeFlushablePoolTest1() {
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool();
        assertEquals(0, flushablePool.getFree());
        assertEquals(Integer.MAX_VALUE, flushablePool.max);
    }

    @Test
    public void initializeFlushablePoolTest2() {
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(10);
        assertEquals(0, flushablePool.getFree());
        assertEquals(Integer.MAX_VALUE, flushablePool.max);
    }

    @Test
    public void initializeFlushablePoolTest3() {
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(10, 10);
        assertEquals(0, flushablePool.getFree());
        assertEquals(10, flushablePool.max);
    }

    @Test
    public void obtainTest() {
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(10, 10);
        flushablePool.newObject();
        assertEquals(0, flushablePool.obtained.size);
        flushablePool.obtain();
        assertEquals(1, flushablePool.obtained.size);
        flushablePool.flush();
        assertEquals(0, flushablePool.obtained.size);
    }

    @Test
    public void flushTest() {
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(10, 10);
        flushablePool.newObject();
        flushablePool.obtain();
        assertEquals(1, flushablePool.obtained.size);
        flushablePool.flush();
        assertEquals(0, flushablePool.obtained.size);
    }

    @Test
    public void freeTest() {
        // Create the flushable pool.
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(10, 10);
        flushablePool.newObject();
        flushablePool.newObject();

        // Obtain the elements.
        String element1 = flushablePool.obtain();
        String element2 = flushablePool.obtain();

        // Test preconditions.
        assertTrue(flushablePool.obtained.contains(element1, true));
        assertTrue(flushablePool.obtained.contains(element2, true));

        // Free element and check containment.
        flushablePool.free(element2);
        assertTrue(flushablePool.obtained.contains(element1, true));
        assertFalse(flushablePool.obtained.contains(element2, true));
    }

    @Test
    public void freeAllTest() {
        // Create the flushable pool.
        com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool flushablePool = new com.badlogic.gdx.utils.FlushablePoolTest.FakeFlushablePool(5, 5);
        flushablePool.newObject();
        flushablePool.newObject();

        // Obtain the elements.
        final String element1 = flushablePool.obtain();
        final String element2 = flushablePool.obtain();

        // Create array with elements.
        Array<String> elementArray = new Array<>();
        elementArray.add(element1);
        elementArray.add(element2);

        // Test preconditions.
        assertTrue(flushablePool.obtained.contains(element1, true));
        assertTrue(flushablePool.obtained.contains(element2, true));

        // Free elements and check containment.
        flushablePool.freeAll(elementArray);
        assertFalse(flushablePool.obtained.contains(element1, true));
        assertFalse(flushablePool.obtained.contains(element2, true));
    }

    /**
     * Test implementation class of FlushablePool.
     */
    private class FakeFlushablePool extends FlushablePool<String> {

        FakeFlushablePool() {
            super();
        }

        FakeFlushablePool(int initialCapacity) {
            super(initialCapacity);
        }

        FakeFlushablePool(int initialCapacity, int max) {
            super(initialCapacity, max);
        }

        @Override
        protected String newObject() {
            return Integer.toString(getFree());
        }
    }
}
