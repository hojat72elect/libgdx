package org.jbox2d.dynamics.contacts;

import org.jbox2d.collision.Manifold.ManifoldType;
import org.jbox2d.common.Settings;
import org.jbox2d.common.Vec2;

public class ContactPositionConstraint {
    final Vec2 localNormal = new Vec2();
    final Vec2 localPoint = new Vec2();
    final Vec2 localCenterA = new Vec2();
    final Vec2 localCenterB = new Vec2();
    Vec2[] localPoints = new Vec2[Settings.maxManifoldPoints];
    int indexA;
    int indexB;
    float invMassA, invMassB;
    float invIA, invIB;
    ManifoldType type;
    float radiusA, radiusB;
    int pointCount;

    public ContactPositionConstraint() {
        for (int i = 0; i < localPoints.length; i++) {
            localPoints[i] = new Vec2();
        }
    }
}
