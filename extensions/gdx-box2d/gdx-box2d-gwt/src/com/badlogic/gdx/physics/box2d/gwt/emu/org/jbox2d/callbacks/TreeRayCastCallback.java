package org.jbox2d.callbacks;

import org.jbox2d.collision.RayCastInput;
import org.jbox2d.collision.broadphase.DynamicTree;

// updated to rev 100

/**
 * callback for {@link DynamicTree}
 *
 * @author Daniel Murphy
 */
public interface TreeRayCastCallback {
    /**
     * @param input
     * @param nodeId
     * @return the fraction to the node
     */
    public float raycastCallback(RayCastInput input, int nodeId);
}
