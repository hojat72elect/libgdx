

package org.jbox2d.dynamics.contacts;

import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.collision.shapes.ShapeType;
import org.jbox2d.common.Transform;
import org.jbox2d.dynamics.Fixture;
import org.jbox2d.pooling.IWorldPool;

public class PolygonContact extends Contact {

	public PolygonContact (IWorldPool argPool) {
		super(argPool);
	}

	public void init (Fixture fixtureA, Fixture fixtureB) {
		super.init(fixtureA, 0, fixtureB, 0);
		assert (m_fixtureA.getType() == ShapeType.POLYGON);
		assert (m_fixtureB.getType() == ShapeType.POLYGON);
	}

	@Override
	public void evaluate (Manifold manifold, Transform xfA, Transform xfB) {
		pool.getCollision().collidePolygons(manifold, (PolygonShape)m_fixtureA.getShape(), xfA, (PolygonShape)m_fixtureB.getShape(),
			xfB);
	}
}
