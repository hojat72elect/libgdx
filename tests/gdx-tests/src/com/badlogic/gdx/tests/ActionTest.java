package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.tests.utils.GdxTest;

public class ActionTest extends GdxTest {
    Stage stage;
    Texture texture;

    @Override
    public void create() {
        stage = new Stage();
        texture = new Texture(Gdx.files.internal("data/badlogic.jpg"), false);
        texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
        final Image img = new Image(new TextureRegion(texture));
        img.setSize(100, 100);
        img.setOrigin(50, 50);
        img.setPosition(100, 100);

        // img.addAction(forever(sequence(delay(1.0f), new Action() {
        // public boolean act (float delta) {
        // System.out.println(1);
        // img.clearActions();
        // return true;
        // }
        // })));

        img.addAction(Actions.moveBy(100, 0, 2));
        img.addAction(Actions.after(Actions.scaleTo(2, 2, 2)));

        stage.addActor(img);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
        texture.dispose();
    }
}
