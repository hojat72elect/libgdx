package com.badlogic.gdx.tests.g3d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.tests.utils.GdxTest;

public class ModelLoaderTest extends GdxTest {
    AssetManager assets;
    PerspectiveCamera camera;
    ModelInstance instance;
    ModelBatch modelBatch;
    SpriteBatch spriteBatch;
    float counter;

    @Override
    public void create() {
        camera = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.position.set(0, 0, 5);
        camera.near = 1;
        camera.far = 100;
        camera.update();
        assets = new AssetManager();
        assets.load("data/g3d/cube.g3dj", Model.class);
        spriteBatch = new SpriteBatch();
        modelBatch = new ModelBatch();
// assets.getLogger().setLevel(Logger.DEBUG);
    }

    private void doneLoading() {
        instance = new ModelInstance(assets.get("data/g3d/cube.g3dj", Model.class));
    }

    @Override
    public void render() {
        if ((instance != null) && ((counter += Gdx.graphics.getDeltaTime()) >= 1f)) {
            counter = 0f;
            instance = null;
            assets.unload("data/g3d/cube.g3dj");
            assets.load("data/g3d/cube.g3dj", Model.class);
            assets.finishLoading();
        }

        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        Gdx.gl.glEnable(GL20.GL_DEPTH_TEST);

        if (assets.update(16)) {
            doneLoading();
        }

        if (instance != null) {
            modelBatch.begin(camera);
            modelBatch.render(instance);
            modelBatch.end();
            spriteBatch.begin();
            spriteBatch.draw(assets.get("data/g3d/checkboard.png", Texture.class), 0, 0, 100, 100);
            spriteBatch.draw(assets.get("data/g3d/Knight.png", Texture.class), 100, 0, 100, 100);
            spriteBatch.end();
        }
    }

    @Override
    public void dispose() {
        assets.dispose();
        modelBatch.dispose();
        spriteBatch.dispose();
    }
}
