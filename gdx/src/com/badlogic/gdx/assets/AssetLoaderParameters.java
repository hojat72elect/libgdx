

package com.badlogic.gdx.assets;

public class AssetLoaderParameters<T> {

	/** Callback interface that will be invoked when the {@link AssetManager} loaded an asset.
	 * @author mzechner */
	public interface LoadedCallback {
		public void finishedLoading (AssetManager assetManager, String fileName, Class type);
	}

	public LoadedCallback loadedCallback;
}
