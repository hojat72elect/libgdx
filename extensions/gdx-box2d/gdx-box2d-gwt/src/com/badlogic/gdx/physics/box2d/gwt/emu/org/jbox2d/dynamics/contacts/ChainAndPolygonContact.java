

package org.jbox2d.dynamics.contacts;

import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.ChainShape;
import org.jbox2d.collision.shapes.EdgeShape;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.collision.shapes.ShapeType;
import org.jbox2d.common.Transform;
import org.jbox2d.dynamics.Fixture;
import org.jbox2d.pooling.IWorldPool;

public class ChainAndPolygonContact extends Contact {

	public ChainAndPolygonContact (IWorldPool argPool) {
		super(argPool);
	}

	@Override
	public void init (Fixture fA, int indexA, Fixture fB, int indexB) {
		super.init(fA, indexA, fB, indexB);
		assert (m_fixtureA.getType() == ShapeType.CHAIN);
		assert (m_fixtureB.getType() == ShapeType.POLYGON);
	}

	private final EdgeShape edge = new EdgeShape();

	@Override
	public void evaluate (Manifold manifold, Transform xfA, Transform xfB) {
		ChainShape chain = (ChainShape)m_fixtureA.getShape();
		chain.getChildEdge(edge, m_indexA);
		pool.getCollision().collideEdgeAndPolygon(manifold, edge, xfA, (PolygonShape)m_fixtureB.getShape(), xfB);
	}
}
