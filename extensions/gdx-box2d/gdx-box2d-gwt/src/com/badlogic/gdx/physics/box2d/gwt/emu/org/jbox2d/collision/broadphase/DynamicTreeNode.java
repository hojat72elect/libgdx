

package org.jbox2d.collision.broadphase;

import org.jbox2d.collision.AABB;

public class DynamicTreeNode {
	/** Enlarged AABB */
	public final AABB aabb = new AABB();

	public Object userData;

	protected DynamicTreeNode parent;

	protected DynamicTreeNode child1;
	protected DynamicTreeNode child2;
	protected final int id;
	protected int height;

	public Object getUserData () {
		return userData;
	}

	public void setUserData (Object argData) {
		userData = argData;
	}

	protected DynamicTreeNode (int id) {
		this.id = id;
	}
}
