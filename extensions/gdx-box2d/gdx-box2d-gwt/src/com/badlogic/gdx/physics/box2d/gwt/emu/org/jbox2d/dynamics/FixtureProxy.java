package org.jbox2d.dynamics;

import org.jbox2d.collision.AABB;

/**
 * This proxy is used internally to connect fixtures to the broad-phase.
 */
public class FixtureProxy {
    final AABB aabb = new AABB();
    Fixture fixture;
    int childIndex;
    int proxyId;
}
