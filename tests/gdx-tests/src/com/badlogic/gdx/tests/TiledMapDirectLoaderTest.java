package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.tests.utils.GdxTest;
import com.badlogic.gdx.tests.utils.OrthoCamController;
import com.badlogic.gdx.utils.ScreenUtils;

public class TiledMapDirectLoaderTest extends GdxTest {

    private TiledMap map;
    private TiledMapRenderer renderer;
    private OrthographicCamera camera;
    private OrthoCamController cameraController;
    private BitmapFont font;
    private SpriteBatch batch;

    @Override
    public void create() {
        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, (w / h) * 10, 10);
        camera.update();

        cameraController = new OrthoCamController(camera);
        Gdx.input.setInputProcessor(cameraController);

        font = new BitmapFont();
        batch = new SpriteBatch();

        map = new TmxMapLoader().load("data/maps/tiled/super-koalio/level1.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, 1f / 32f);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.55f, 0.55f, 0.55f, 1f);
        camera.update();
        renderer.setView(camera);
        renderer.render();
        batch.begin();
        font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 10, 20);
        batch.end();
    }

    @Override
    public void dispose() {
        map.dispose();
    }
}
