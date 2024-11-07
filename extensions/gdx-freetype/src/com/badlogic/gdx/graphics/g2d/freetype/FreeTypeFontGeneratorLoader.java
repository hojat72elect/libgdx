package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;

/**
 * Makes {@link FreeTypeFontGenerator} managable via {@link AssetManager}.
 * <p>
 * Do
 * {@code assetManager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(new InternalFileHandleResolver()))}
 * to register it.
 * </p>
 */
public class FreeTypeFontGeneratorLoader
        extends SynchronousAssetLoader<FreeTypeFontGenerator, FreeTypeFontGeneratorLoader.FreeTypeFontGeneratorParameters> {

    public FreeTypeFontGeneratorLoader(FileHandleResolver resolver) {
        super(resolver);
    }

    @Override
    public FreeTypeFontGenerator load(AssetManager assetManager, String fileName, FileHandle file,
                                      FreeTypeFontGeneratorParameters parameter) {
        FreeTypeFontGenerator generator = null;
        if (file.extension().equals("gen")) {
            generator = new FreeTypeFontGenerator(file.sibling(file.nameWithoutExtension()));
        } else {
            generator = new FreeTypeFontGenerator(file);
        }
        return generator;
    }

    @Override
    public Array<AssetDescriptor> getDependencies(String fileName, FileHandle file, FreeTypeFontGeneratorParameters parameter) {
        return null;
    }

    static public class FreeTypeFontGeneratorParameters extends AssetLoaderParameters<FreeTypeFontGenerator> {
    }
}
