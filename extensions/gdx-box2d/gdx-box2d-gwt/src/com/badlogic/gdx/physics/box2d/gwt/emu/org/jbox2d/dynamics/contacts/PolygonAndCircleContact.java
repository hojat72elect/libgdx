package org.jbox2d.dynamics.contacts;

import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.CircleShape;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.collision.shapes.ShapeType;
import org.jbox2d.common.Transform;
import org.jbox2d.dynamics.Fixture;
import org.jbox2d.pooling.IWorldPool;

public class PolygonAndCircleContact extends Contact {

    public PolygonAndCircleContact(IWorldPool argPool) {
        super(argPool);
    }

    public void init(Fixture fixtureA, Fixture fixtureB) {
        super.init(fixtureA, 0, fixtureB, 0);
        assert (m_fixtureA.getType() == ShapeType.POLYGON);
        assert (m_fixtureB.getType() == ShapeType.CIRCLE);
    }

    @Override
    public void evaluate(Manifold manifold, Transform xfA, Transform xfB) {
        pool.getCollision().collidePolygonAndCircle(manifold, (PolygonShape) m_fixtureA.getShape(), xfA,
                (CircleShape) m_fixtureB.getShape(), xfB);
    }
}
