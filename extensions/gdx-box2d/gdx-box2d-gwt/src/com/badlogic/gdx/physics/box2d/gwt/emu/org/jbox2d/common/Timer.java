package org.jbox2d.common;

public class Timer {

    private double resetMillis;

    public Timer() {
        reset();
    }

    private static native double now() /*-{
    return Date.now();
  }-*/;

    public void reset() {
        resetMillis = now();
    }

    public float getMilliseconds() {
        return (float) (now() - resetMillis);
    }
}
