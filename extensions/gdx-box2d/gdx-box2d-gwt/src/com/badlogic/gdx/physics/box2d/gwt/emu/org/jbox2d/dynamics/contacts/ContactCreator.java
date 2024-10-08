package org.jbox2d.dynamics.contacts;

import org.jbox2d.dynamics.Fixture;
import org.jbox2d.pooling.IWorldPool;

// updated to rev 100
public interface ContactCreator {

    public Contact contactCreateFcn(IWorldPool argPool, Fixture fixtureA, Fixture fixtureB);

    public void contactDestroyFcn(IWorldPool argPool, Contact contact);
}
