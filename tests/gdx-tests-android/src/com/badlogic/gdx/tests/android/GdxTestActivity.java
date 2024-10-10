

package com.badlogic.gdx.tests.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.tests.utils.GdxTest;
import com.badlogic.gdx.tests.utils.GdxTests;

public class GdxTestActivity extends AndroidApplication {

	public void onCreate (Bundle bundle) {
		super.onCreate(bundle);

		// obtain the test info
		Bundle extras = getIntent().getExtras();
		String testName = (String)extras.get("test");
		GdxTest test = GdxTests.newTest(testName);

		// and run the application...
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useImmersiveMode = true;
		config.useRotationVectorSensor = true;
		config.useGyroscope = true;
		config.renderUnderCutout = true;
		initialize(test, config);
	}
}
