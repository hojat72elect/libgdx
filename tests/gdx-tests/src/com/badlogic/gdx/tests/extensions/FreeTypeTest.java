package com.badlogic.gdx.tests.extensions;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeBitmapFontData;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.tests.utils.GdxTest;
import com.badlogic.gdx.utils.ScreenUtils;

public class FreeTypeTest extends GdxTest {
    BitmapFont font;
    SpriteBatch batch;
    BitmapFont ftFont;

    @Override
    public void create() {
        boolean flip = false;
        batch = new SpriteBatch();
        if (flip) {
            OrthographicCamera cam = new OrthographicCamera();
            cam.setToOrtho(flip);
            cam.update();
            batch.setProjectionMatrix(cam.combined);
        }
        font = new BitmapFont(Gdx.files.internal("data/lsans-15.fnt"), flip);
        FileHandle fontFile = Gdx.files.internal("data/lsans.ttf");

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);

        FreeTypeFontParameter parameter = new FreeTypeFontParameter();
        parameter.size = 15;
        parameter.flip = flip;
        parameter.genMipMaps = true;
        // parameter.shadowOffsetX = 1;
        // parameter.shadowOffsetY = 1;
        // parameter.shadowColor = Color.GREEN;
        // parameter.borderWidth = 1f;
        // parameter.borderColor = Color.PURPLE;

        FreeTypeBitmapFontData fontData = generator.generateData(parameter);
        ftFont = generator.generateFont(parameter);
        generator.dispose();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);

        batch.begin();
        font.setColor(Color.RED);
        font.draw(batch, "This is a test\nAnd another line\n()����$%&/!12390#", 100, 112);
        ftFont.draw(batch, "This is a test\nAnd another line\n()����$%&/!12390#", 100, 112);
// batch.disableBlending();
        batch.draw(ftFont.getRegion(), 300, 0);
// batch.enableBlending();
        batch.end();
    }
}
