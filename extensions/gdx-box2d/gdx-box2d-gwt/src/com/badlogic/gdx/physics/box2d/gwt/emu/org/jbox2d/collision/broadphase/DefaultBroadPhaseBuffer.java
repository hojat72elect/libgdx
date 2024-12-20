package org.jbox2d.collision.broadphase;

import java.util.Arrays;

import org.jbox2d.callbacks.DebugDraw;
import org.jbox2d.callbacks.PairCallback;
import org.jbox2d.callbacks.TreeCallback;
import org.jbox2d.callbacks.TreeRayCastCallback;
import org.jbox2d.collision.AABB;
import org.jbox2d.collision.RayCastInput;
import org.jbox2d.common.Vec2;

/**
 * The broad-phase is used for computing pairs and performing volume queries and ray casts. This broad-phase does not persist
 * pairs. Instead, this reports potentially new pairs. It is up to the client to consume the new pairs and to track subsequent
 * overlap.
 */
public class DefaultBroadPhaseBuffer implements TreeCallback, BroadPhase {

    private final BroadPhaseStrategy m_tree;

    private int m_proxyCount;

    private int[] m_moveBuffer;
    private int m_moveCapacity;
    private int m_moveCount;

    private Pair[] m_pairBuffer;
    private int m_pairCapacity;
    private int m_pairCount;

    private int m_queryProxyId;

    public DefaultBroadPhaseBuffer(BroadPhaseStrategy strategy) {
        m_proxyCount = 0;

        m_pairCapacity = 16;
        m_pairCount = 0;
        m_pairBuffer = new Pair[m_pairCapacity];
        for (int i = 0; i < m_pairCapacity; i++) {
            m_pairBuffer[i] = new Pair();
        }

        m_moveCapacity = 16;
        m_moveCount = 0;
        m_moveBuffer = new int[m_moveCapacity];

        m_tree = strategy;
        m_queryProxyId = NULL_PROXY;
    }

    @Override
    public final int createProxy(final AABB aabb, Object userData) {
        int proxyId = m_tree.createProxy(aabb, userData);
        ++m_proxyCount;
        bufferMove(proxyId);
        return proxyId;
    }

    @Override
    public final void destroyProxy(int proxyId) {
        unbufferMove(proxyId);
        --m_proxyCount;
        m_tree.destroyProxy(proxyId);
    }

    @Override
    public final void moveProxy(int proxyId, final AABB aabb, final Vec2 displacement) {
        boolean buffer = m_tree.moveProxy(proxyId, aabb, displacement);
        if (buffer) {
            bufferMove(proxyId);
        }
    }

    @Override
    public void touchProxy(int proxyId) {
        bufferMove(proxyId);
    }

    @Override
    public Object getUserData(int proxyId) {
        return m_tree.getUserData(proxyId);
    }

    @Override
    public AABB getFatAABB(int proxyId) {
        return m_tree.getFatAABB(proxyId);
    }

    @Override
    public boolean testOverlap(int proxyIdA, int proxyIdB) {
        // return AABB.testOverlap(proxyA.aabb, proxyB.aabb);
        // return m_tree.overlap(proxyIdA, proxyIdB);
        final AABB a = m_tree.getFatAABB(proxyIdA);
        final AABB b = m_tree.getFatAABB(proxyIdB);
        if (b.lowerBound.x - a.upperBound.x > 0.0f || b.lowerBound.y - a.upperBound.y > 0.0f) {
            return false;
        }

        if (a.lowerBound.x - b.upperBound.x > 0.0f || a.lowerBound.y - b.upperBound.y > 0.0f) {
            return false;
        }

        return true;
    }

    @Override
    public final int getProxyCount() {
        return m_proxyCount;
    }

    @Override
    public void drawTree(DebugDraw argDraw) {
        m_tree.drawTree(argDraw);
    }

    @Override
    public final void updatePairs(PairCallback callback) {
        // Reset pair buffer
        m_pairCount = 0;

        // Perform tree queries for all moving proxies.
        for (int i = 0; i < m_moveCount; ++i) {
            m_queryProxyId = m_moveBuffer[i];
            if (m_queryProxyId == NULL_PROXY) {
                continue;
            }

            // We have to query the tree with the fat AABB so that
            // we don't fail to create a pair that may touch later.
            final AABB fatAABB = m_tree.getFatAABB(m_queryProxyId);

            // Query tree, create pairs and add them pair buffer.
            // log.debug("quering aabb: "+m_queryProxy.aabb);
            m_tree.query(this, fatAABB);
        }
        // log.debug("Number of pairs found: "+m_pairCount);

        // Reset move buffer
        m_moveCount = 0;

        // Sort the pair buffer to expose duplicates.
        Arrays.sort(m_pairBuffer, 0, m_pairCount);

        // Send the pairs back to the client.
        int i = 0;
        while (i < m_pairCount) {
            Pair primaryPair = m_pairBuffer[i];
            Object userDataA = m_tree.getUserData(primaryPair.proxyIdA);
            Object userDataB = m_tree.getUserData(primaryPair.proxyIdB);

            // log.debug("returning pair: "+userDataA+", "+userDataB);
            callback.addPair(userDataA, userDataB);
            ++i;

            // Skip any duplicate pairs.
            while (i < m_pairCount) {
                Pair pair = m_pairBuffer[i];
                if (pair.proxyIdA != primaryPair.proxyIdA || pair.proxyIdB != primaryPair.proxyIdB) {
                    break;
                }
                ++i;
            }
        }
    }

    @Override
    public final void query(final TreeCallback callback, final AABB aabb) {
        m_tree.query(callback, aabb);
    }

    @Override
    public final void raycast(final TreeRayCastCallback callback, final RayCastInput input) {
        m_tree.raycast(callback, input);
    }

    @Override
    public final int getTreeHeight() {
        return m_tree.getHeight();
    }

    @Override
    public int getTreeBalance() {
        return m_tree.getMaxBalance();
    }

    @Override
    public float getTreeQuality() {
        return m_tree.getAreaRatio();
    }

    protected final void bufferMove(int proxyId) {
        if (m_moveCount == m_moveCapacity) {
            int[] old = m_moveBuffer;
            m_moveCapacity *= 2;
            m_moveBuffer = new int[m_moveCapacity];
            System.arraycopy(old, 0, m_moveBuffer, 0, old.length);
        }

        m_moveBuffer[m_moveCount] = proxyId;
        ++m_moveCount;
    }

    protected final void unbufferMove(int proxyId) {
        for (int i = 0; i < m_moveCount; i++) {
            if (m_moveBuffer[i] == proxyId) {
                m_moveBuffer[i] = NULL_PROXY;
            }
        }
    }

    /**
     * This is called from DynamicTree::query when we are gathering pairs.
     */
    public final boolean treeCallback(int proxyId) {
        // A proxy cannot form a pair with itself.
        if (proxyId == m_queryProxyId) {
            return true;
        }

        // Grow the pair buffer as needed.
        if (m_pairCount == m_pairCapacity) {
            Pair[] oldBuffer = m_pairBuffer;
            m_pairCapacity *= 2;
            m_pairBuffer = new Pair[m_pairCapacity];
            System.arraycopy(oldBuffer, 0, m_pairBuffer, 0, oldBuffer.length);
            for (int i = oldBuffer.length; i < m_pairCapacity; i++) {
                m_pairBuffer[i] = new Pair();
            }
        }

        if (proxyId < m_queryProxyId) {
            m_pairBuffer[m_pairCount].proxyIdA = proxyId;
            m_pairBuffer[m_pairCount].proxyIdB = m_queryProxyId;
        } else {
            m_pairBuffer[m_pairCount].proxyIdA = m_queryProxyId;
            m_pairBuffer[m_pairCount].proxyIdB = proxyId;
        }

        ++m_pairCount;
        return true;
    }
}
