
package com.badlogic.gdx.tests;

import com.badlogic.gdx.tests.utils.GdxTestK;
import com.badlogic.gdx.tests.utils.GdxTests;

public class IosTestWrapper extends AbstractTestWrapper {
    @Override
    protected Instancer[] getTestList() {
        Instancer[] tests = new Instancer[GdxTests.tests.size()];
        int i = 0;
        for (final Class<? extends GdxTestK> aClass : GdxTests.tests) {
            tests[i] = new IosInstancer(aClass);
            i++;
        }
        return tests;
    }

    class IosInstancer implements Instancer {
        final Class<? extends GdxTestK> clazz;

        IosInstancer(Class<? extends GdxTestK> clazz) {
            this.clazz = clazz;
        }

        @Override
        public GdxTestK instance() {
            try {
                return clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public String getSimpleName() {
            return clazz.getSimpleName();
        }
    }
}
