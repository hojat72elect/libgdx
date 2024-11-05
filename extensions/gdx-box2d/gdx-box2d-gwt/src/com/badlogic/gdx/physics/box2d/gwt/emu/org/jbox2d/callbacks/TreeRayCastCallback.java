package org.jbox2d.callbacks;

import org.jbox2d.collision.RayCastInput;
import org.jbox2d.collision.broadphase.DynamicTree;

/**
 * callback for {@link DynamicTree}
 */
public interface TreeRayCastCallback {
    /**
     * @param input
     * @param nodeId
     * @return the fraction to the node
     */
    public float raycastCallback(RayCastInput input, int nodeId);
}
