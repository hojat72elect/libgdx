package org.jbox2d.callbacks;

import org.jbox2d.collision.broadphase.DynamicTree;

// update to rev 100

/**
 * callback for {@link DynamicTree}
 *
 * @author Daniel Murphy
 */
public interface TreeCallback {

    /**
     * Callback from a query request.
     *
     * @param proxyId the id of the proxy
     * @return if the query should be continued
     */
    public boolean treeCallback(int proxyId);
}
