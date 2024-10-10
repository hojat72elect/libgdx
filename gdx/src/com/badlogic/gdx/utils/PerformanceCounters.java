package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.MathUtils;

/**
 * @author xoppa
 */
public class PerformanceCounters {
    private final static float nano2seconds = MathUtils.nanoToSec;
    public final Array<PerformanceCounter> counters = new Array<PerformanceCounter>();
    private long lastTick = 0L;

    public PerformanceCounter add(final String name, final int windowSize) {
        PerformanceCounter result = new PerformanceCounter(name, windowSize);
        counters.add(result);
        return result;
    }

    public PerformanceCounter add(final String name) {
        PerformanceCounter result = new PerformanceCounter(name);
        counters.add(result);
        return result;
    }

    public void tick() {
        final long t = TimeUtils.nanoTime();
        if (lastTick > 0L) tick((t - lastTick) * nano2seconds);
        lastTick = t;
    }

    public void tick(final float deltaTime) {
        for (int i = 0; i < counters.size; i++)
            counters.get(i).tick(deltaTime);
    }

    public StringBuilder toString(final StringBuilder sb) {
        sb.setLength(0);
        for (int i = 0; i < counters.size; i++) {
            if (i != 0) sb.append("; ");
            counters.get(i).toString(sb);
        }
        return sb;
    }
}
