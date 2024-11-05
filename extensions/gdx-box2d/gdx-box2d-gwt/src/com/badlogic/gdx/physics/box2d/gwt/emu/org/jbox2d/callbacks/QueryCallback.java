/**
 * Created at 4:30:03 AM Jul 15, 2010
 */

package org.jbox2d.callbacks;

import org.jbox2d.dynamics.Fixture;
import org.jbox2d.dynamics.World;

/**
 * Callback class for AABB queries. See {@link World#queryAABB(QueryCallback, org.jbox2d.collision.AABB)}.
 */
public interface QueryCallback {

    /**
     * Called for each fixture found in the query AABB.
     *
     * @param fixture
     * @return false to terminate the query.
     */
    public boolean reportFixture(Fixture fixture);
}
