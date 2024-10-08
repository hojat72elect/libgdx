package com.badlogic.gdx.tests;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.tests.utils.GdxTest;

public class ActionSequenceTest extends GdxTest implements Runnable {

    Image img;
    Image img2;
    Image img3;
    Stage stage;
    Texture texture;

    @Override
    public void create() {
        stage = new Stage();
        texture = new Texture(Gdx.files.internal("data/badlogic.jpg"), false);
        texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
        img = new Image(new TextureRegion(texture));
        img.setSize(100, 100);
        img.setOrigin(50, 50);
        img.setPosition(100, 100);

        img2 = new Image(new TextureRegion(texture));
        img2.setSize(100, 100);
        img2.setOrigin(50, 50);
        img2.setPosition(100, 100);

        img3 = new Image(new TextureRegion(texture));
        img3.setSize(100, 100);
        img3.setOrigin(50, 50);
        img3.setPosition(100, 100);

        stage.addActor(img);
        stage.addActor(img2);
        stage.addActor(img3);

        img.addAction(sequence());
        img2.addAction(parallel(sequence(), moveBy(100, 0, 1)));
        img3.addAction(sequence(parallel(moveBy(100, 200, 2)), Actions.run(this)));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();
    }

    @Override
    public void run() {
        System.out.println("completed");
    }

    @Override
    public void dispose() {
        stage.dispose();
        texture.dispose();
    }
}
