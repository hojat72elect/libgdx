

package com.badlogic.gdx.tests.android;

import android.util.Log;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidDaydream;
import com.badlogic.gdx.tests.MeshShaderTest;

public class Daydream extends AndroidDaydream {
	@Override
	public void onAttachedToWindow () {
		super.onAttachedToWindow();

		Log.i("Andrew", "hi");

		AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();

		setInteractive(false);

		ApplicationListener app = new MeshShaderTest();
		initialize(app, cfg);
	}
}
