

package com.badlogic.gdx.backends.android;

import android.view.View;

/** Allows immersive mode support while maintaining compatibility with Android versions before API Level 19 (4.4)
 * @author Unkn0wn0ne */
public class AndroidVisibilityListener {

	public void createListener (final AndroidApplicationBase application) {
		try {
			View rootView = application.getApplicationWindow().getDecorView();
			rootView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
				@Override
				public void onSystemUiVisibilityChange (int arg0) {
					application.getHandler().post(new Runnable() {
						@Override
						public void run () {
							application.useImmersiveMode(true);
						}
					});
				}
			});
		} catch (Throwable t) {
			application.log("AndroidApplication", "Can't create OnSystemUiVisibilityChangeListener, unable to use immersive mode.",
				t);
		}
	}
}
