package org.jbox2d.collision.broadphase;

import org.jbox2d.collision.AABB;

public class DynamicTreeNode {
    /**
     * Enlarged AABB
     */
    public final AABB aabb = new AABB();
    protected final int id;
    public Object userData;
    protected DynamicTreeNode parent;
    protected DynamicTreeNode child1;
    protected DynamicTreeNode child2;
    protected int height;

    protected DynamicTreeNode(int id) {
        this.id = id;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object argData) {
        userData = argData;
    }
}
