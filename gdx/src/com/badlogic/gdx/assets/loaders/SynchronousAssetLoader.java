package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;

public abstract class SynchronousAssetLoader<T, P extends AssetLoaderParameters<T>> extends AssetLoader<T, P> {
    public SynchronousAssetLoader(FileHandleResolver resolver) {
        super(resolver);
    }

    public abstract T load(AssetManager assetManager, String fileName, FileHandle file, P parameter);
}
