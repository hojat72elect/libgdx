/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.tests.gwt;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.tests.utils.GdxTest;

public class GwtWindowModeTest extends GdxTest {
	private final String windowedInstructions = "click for Full screen Mode";
	TextButton changeModeButton;
	private Stage stage;

	public void create () {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		Skin skin = new Skin(Gdx.files.internal("data/uiskin.json"));

		changeModeButton = new TextButton(windowedInstructions, skin);
		changeModeButton.setSize((float)Gdx.graphics.getWidth() / 2, (float)Gdx.graphics.getHeight() / 2);
		changeModeButton.setPosition((float)Gdx.graphics.getWidth() / 4, (float)Gdx.graphics.getHeight() / 4);
		stage.addActor(changeModeButton);

		changeModeButton.addListener(new ClickListener() {
			@Override
			public void clicked (InputEvent event, float x, float y) {
				super.clicked(event, x, y);
				if (!Gdx.graphics.isFullscreen()) {
					Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
				} else {
					Gdx.graphics.setWindowedMode(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
				}
			}
		});
		if (!Gdx.graphics.supportsDisplayModeChange()) {
			changeModeButton.setDisabled(true);
			String notSupported = "Changing the display mode is not supported";
			changeModeButton.setText(notSupported);
		}
	}

	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	public void resize (int width, int height) {
		stage.getViewport().update(width, height, true);
		if (Gdx.graphics.supportsDisplayModeChange()) {
			if (Gdx.graphics.isFullscreen()) {
				String fullScreenInstructions = "click for window Mode";
				changeModeButton.setText(fullScreenInstructions);
			} else {
				changeModeButton.setText(windowedInstructions);
			}
		}
	}

	public void dispose () {
		stage.dispose();
	}
}
