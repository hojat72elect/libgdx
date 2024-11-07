package org.jbox2d.common;

/**
 * Orientated bounding box viewport transform
 */
public class OBBViewportTransform implements IViewportTransform {

    protected final OBB box = new OBB();
    private final Mat22 yFlipMat = new Mat22(1, 0, 0, -1);
    private final Mat22 inv = new Mat22();
    private final Mat22 inv2 = new Mat22();
    private boolean yFlip = false;

    public OBBViewportTransform() {
        box.R.setIdentity();
    }

    public void set(OBBViewportTransform vpt) {
        box.center.set(vpt.box.center);
        box.extents.set(vpt.box.extents);
        box.R.set(vpt.box.R);
        yFlip = vpt.yFlip;
    }

    public void setCamera(float x, float y, float scale) {
        box.center.set(x, y);
        Mat22.createScaleTransform(scale, box.R);
    }

    public Vec2 getExtents() {
        return box.extents;
    }

    public void setExtents(Vec2 argExtents) {
        box.extents.set(argExtents);
    }

    @Override
    public Mat22 getMat22Representation() {
        return box.R;
    }

    public void setExtents(float halfWidth, float halfHeight) {
        box.extents.set(halfWidth, halfHeight);
    }

    public Vec2 getCenter() {
        return box.center;
    }

    public void setCenter(Vec2 argPos) {
        box.center.set(argPos);
    }

    public void setCenter(float x, float y) {
        box.center.set(x, y);
    }

    /**
     * Gets the transform of the viewport, transforms around the center. Not a copy.
     */
    public Mat22 getTransform() {
        return box.R;
    }

    /**
     * Sets the transform of the viewport. Transforms about the center.
     */
    public void setTransform(Mat22 transform) {
        box.R.set(transform);
    }

    /**
     * Multiplies the obb transform by the given transform
     */
    @Override
    public void mulByTransform(Mat22 transform) {
        box.R.mulLocal(transform);
    }

    public boolean isYFlip() {
        return yFlip;
    }

    public void setYFlip(boolean yFlip) {
        this.yFlip = yFlip;
    }

    public void getScreenVectorToWorld(Vec2 screen, Vec2 world) {
        box.R.invertToOut(inv);
        inv.mulToOut(screen, world);
        if (yFlip) {
            yFlipMat.mulToOut(world, world);
        }
    }

    public void getWorldVectorToScreen(Vec2 world, Vec2 screen) {
        box.R.mulToOut(world, screen);
        if (yFlip) {
            yFlipMat.mulToOut(screen, screen);
        }
    }

    public void getWorldToScreen(Vec2 world, Vec2 screen) {
        screen.x = world.x - box.center.x;
        screen.y = world.y - box.center.y;
        box.R.mulToOut(screen, screen);
        if (yFlip) {
            yFlipMat.mulToOut(screen, screen);
        }
        screen.x += box.extents.x;
        screen.y += box.extents.y;
    }

    public void getScreenToWorld(Vec2 screen, Vec2 world) {
        world.x = screen.x - box.extents.x;
        world.y = screen.y - box.extents.y;
        if (yFlip) {
            yFlipMat.mulToOut(world, world);
        }
        box.R.invertToOut(inv2);
        inv2.mulToOut(world, world);
        world.x += box.center.x;
        world.y += box.center.y;
    }

    public static class OBB {
        public final Mat22 R = new Mat22();
        public final Vec2 center = new Vec2();
        public final Vec2 extents = new Vec2();
    }
}
