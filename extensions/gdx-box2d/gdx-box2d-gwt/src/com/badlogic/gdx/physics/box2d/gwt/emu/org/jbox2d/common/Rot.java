package org.jbox2d.common;

import java.io.Serializable;

/**
 * Represents a rotation
 */
public class Rot implements Serializable {
    private static final long serialVersionUID = 1L;

    public float s, c; // sin and cos

    public Rot() {
        setIdentity();
    }

    public Rot(float angle) {
        set(angle);
    }

    public static final void mul(Rot q, Rot r, Rot out) {
        float tempc = q.c * r.c - q.s * r.s;
        out.s = q.s * r.c + q.c * r.s;
        out.c = tempc;
    }

    public static final void mulUnsafe(Rot q, Rot r, Rot out) {
        assert (r != out);
        assert (q != out);
        // [qc -qs] * [rc -rs] = [qc*rc-qs*rs -qc*rs-qs*rc]
        // [qs qc] [rs rc] [qs*rc+qc*rs -qs*rs+qc*rc]
        // s = qs * rc + qc * rs
        // c = qc * rc - qs * rs
        out.s = q.s * r.c + q.c * r.s;
        out.c = q.c * r.c - q.s * r.s;
    }

    public static final void mulTrans(Rot q, Rot r, Rot out) {
        final float tempc = q.c * r.c + q.s * r.s;
        out.s = q.c * r.s - q.s * r.c;
        out.c = tempc;
    }

    public static final void mulTransUnsafe(Rot q, Rot r, Rot out) {
        // [ qc qs] * [rc -rs] = [qc*rc+qs*rs -qc*rs+qs*rc]
        // [-qs qc] [rs rc] [-qs*rc+qc*rs qs*rs+qc*rc]
        // s = qc * rs - qs * rc
        // c = qc * rc + qs * rs
        out.s = q.c * r.s - q.s * r.c;
        out.c = q.c * r.c + q.s * r.s;
    }

    public static final void mulToOut(Rot q, Vec2 v, Vec2 out) {
        float tempy = q.s * v.x + q.c * v.y;
        out.x = q.c * v.x - q.s * v.y;
        out.y = tempy;
    }

    public static final void mulToOutUnsafe(Rot q, Vec2 v, Vec2 out) {
        out.x = q.c * v.x - q.s * v.y;
        out.y = q.s * v.x + q.c * v.y;
    }

    public static final void mulTrans(Rot q, Vec2 v, Vec2 out) {
        final float tempy = -q.s * v.x + q.c * v.y;
        out.x = q.c * v.x + q.s * v.y;
        out.y = tempy;
    }

    public static final void mulTransUnsafe(Rot q, Vec2 v, Vec2 out) {
        out.x = q.c * v.x + q.s * v.y;
        out.y = -q.s * v.x + q.c * v.y;
    }

    public float getSin() {
        return s;
    }

    @Override
    public String toString() {
        return "Rot(s:" + s + ", c:" + c + ")";
    }

    public float getCos() {
        return c;
    }

    public Rot set(float angle) {
        s = MathUtils.sin(angle);
        c = MathUtils.cos(angle);
        return this;
    }

    public Rot set(Rot other) {
        s = other.s;
        c = other.c;
        return this;
    }

    public Rot setIdentity() {
        s = 0;
        c = 1;
        return this;
    }

    public float getAngle() {
        return MathUtils.atan2(s, c);
    }

    public void getXAxis(Vec2 xAxis) {
        xAxis.set(c, s);
    }

    public void getYAxis(Vec2 yAxis) {
        yAxis.set(-s, c);
    }

    // @Override // annotation omitted for GWT-compatibility
    public Rot clone() {
        Rot copy = new Rot();
        copy.s = s;
        copy.c = c;
        return copy;
    }
}
