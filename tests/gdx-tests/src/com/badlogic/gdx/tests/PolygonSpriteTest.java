package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.PolygonRegionLoader;
import com.badlogic.gdx.graphics.g2d.PolygonSprite;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.tests.utils.GdxTest;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;

public class PolygonSpriteTest extends GdxTest {

    PolygonSpriteBatch batch;
    ShapeRenderer renderer;

    Texture texture;
    OrthographicCamera camera;
    PolygonRegion region;
    Rectangle bounds;

    Array<PolygonSprite> sprites = new Array<PolygonSprite>();

    @Override
    public void create() {
        texture = new Texture(Gdx.files.internal("data/tree.png"));

        PolygonRegionLoader loader = new PolygonRegionLoader();
        region = loader.load(new TextureRegion(texture), Gdx.files.internal("data/tree.psh"));

        renderer = new ShapeRenderer();

        camera = new OrthographicCamera(480, 320);
        camera.position.x = 240;
        camera.position.y = 160;
        camera.update();

        batch = new PolygonSpriteBatch();

        for (int i = 0; i < 50; i++) {
            PolygonSprite sprite = new PolygonSprite(region);
            sprite.setPosition(MathUtils.random(-30, 440), MathUtils.random(-30, 290));
            sprite.setColor(MathUtils.random(), MathUtils.random(), MathUtils.random(), 1.0f);
            sprite.setScale(MathUtils.random(0.5f, 1.5f), MathUtils.random(0.5f, 1.5f));
            sprites.add(sprite);
        }
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1f);

        camera.update();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();

        for (int i = 0; i < sprites.size; i++) {
            PolygonSprite sprite = sprites.get(i);
            sprite.rotate(45 * Gdx.graphics.getDeltaTime());
            sprite.translateX(10 * Gdx.graphics.getDeltaTime());

            if (sprite.getX() > 450) sprite.setX(-50);

            sprite.draw(batch);
        }
        batch.end();

        // Some debug rendering, bounding box & origin of one sprite
        renderer.setProjectionMatrix(camera.combined);
        renderer.setColor(Color.GREEN);
        renderer.begin(ShapeType.Line);

        PolygonSprite sprite = sprites.get(49);

        bounds = sprite.getBoundingRectangle();
        renderer.rect(bounds.x, bounds.y, bounds.width, bounds.height);

        renderer.end();

        renderer.begin(ShapeType.Filled);

        renderer.circle(sprite.getX() + sprite.getOriginX(), sprite.getY() + sprite.getOriginY(), 4);

        renderer.end();
    }

    @Override
    public void dispose() {
        texture.dispose();
        batch.dispose();
    }
}
