package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.tests.utils.GdxTest;
import com.badlogic.gdx.utils.Array;

public class ParticleEmitterChangeSpriteTest extends GdxTest {
    ParticleEffect effect;
    int emitterIndex = 0;
    Array<ParticleEmitter> emitters;
    TextureAtlas atlas;
    Array<Sprite> sprites;
    int currentSprite = 0;
    float fpsCounter;
    InputProcessor inputProcessor;
    private SpriteBatch spriteBatch;

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();

        atlas = new TextureAtlas("data/particles.atlas");

        int spriteCount = atlas.getRegions().size;
        sprites = new Array<Sprite>(spriteCount);
        for (TextureRegion region : atlas.getRegions()) {
            sprites.add(new Sprite(region));
        }

        effect = new ParticleEffect();
        effect.load(Gdx.files.internal("data/test.p"), Gdx.files.internal("data"));
        effect.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        // Of course, a ParticleEffect is normally just used, without messing around with its emitters.
        emitters = new Array(effect.getEmitters());
        effect.getEmitters().clear();
        effect.getEmitters().add(emitters.get(0));

        inputProcessor = new InputAdapter() {

            public boolean touchDragged(int x, int y, int pointer) {
                effect.setPosition(x, Gdx.graphics.getHeight() - y);
                return false;
            }

            public boolean touchDown(int x, int y, int pointer, int newParam) {
                ParticleEmitter emitter = emitters.get(emitterIndex);
                currentSprite = (currentSprite + 1) % sprites.size;
                emitter.setSprites(new Array<Sprite>(new Sprite[]{sprites.get(currentSprite)}));
                return false;
            }
        };

        Gdx.input.setInputProcessor(inputProcessor);
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        effect.dispose();
        atlas.dispose();
    }

    public void render() {
        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        float delta = Gdx.graphics.getDeltaTime();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        effect.draw(spriteBatch, delta);
        spriteBatch.end();
        fpsCounter += delta;
        if (fpsCounter > 3) {
            fpsCounter = 0;
            Gdx.app.log("libgdx", "current sprite: " + currentSprite + ", FPS: " + Gdx.graphics.getFramesPerSecond());
        }
    }

    public boolean needsGL20() {
        return false;
    }
}
