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

package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.tests.utils.GdxTest;

/** A simple test to demonstrate the life cycle of an application. */
public class LifeCycleTest extends GdxTest {

	@Override
	public void dispose () {
		Gdx.app.log("Test", "app destroyed");
	}

	@Override
	public void pause () {
		Gdx.app.log("Test", "app paused");
	}

	@Override
	public void resume () {
		Gdx.app.log("Test", "app resumed");
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void create () {
		Gdx.app.log("Test", "app created: " + Gdx.graphics.getWidth() + "x" + Gdx.graphics.getHeight());
	}

	@Override
	public void resize (int width, int height) {
		Gdx.app.log("Test",
			"app resized: " + width + "x" + height + ", Graphics says: " + Gdx.graphics.getWidth() + "x" + Gdx.graphics.getHeight());
	}
}
