

package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;

/** {@link AssetLoader} for {@link Pixmap} instances. The Pixmap is loaded asynchronously.
 * @author mzechner */
public class PixmapLoader extends AsynchronousAssetLoader<Pixmap, PixmapLoader.PixmapParameter> {
	public PixmapLoader (FileHandleResolver resolver) {
		super(resolver);
	}

	Pixmap pixmap;

	@Override
	public void loadAsync (AssetManager manager, String fileName, FileHandle file, PixmapParameter parameter) {
		pixmap = null;
		pixmap = new Pixmap(file);
	}

	@Override
	public Pixmap loadSync (AssetManager manager, String fileName, FileHandle file, PixmapParameter parameter) {
		Pixmap pixmap = this.pixmap;
		this.pixmap = null;
		return pixmap;
	}

	@Override
	public Array<AssetDescriptor> getDependencies (String fileName, FileHandle file, PixmapParameter parameter) {
		return null;
	}

	static public class PixmapParameter extends AssetLoaderParameters<Pixmap> {
	}
}
