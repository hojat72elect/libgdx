package com.badlogic.gdx.backends.gwt;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.gwt.preloader.Preloader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.google.gwt.storage.client.Storage;

public class GwtFiles implements Files {

    public static final Storage LocalStorage = Storage.getLocalStorageIfSupported(); // Can be null if cookies are disabled or
    // blocked by the browser with "block
    // third-party cookies"

    protected final Preloader preloader;

    public GwtFiles(Preloader preloader) {
        this.preloader = preloader;
    }

    @Override
    public FileHandle getFileHandle(String path, FileType type) {
        if (type != FileType.Internal)
            throw new GdxRuntimeException("FileType '" + type + "' not supported in GWT backend");
        return new GwtFileHandle(preloader, path, type);
    }

    @Override
    public FileHandle classpath(String path) {
        return new GwtFileHandle(preloader, path, FileType.Classpath);
    }

    @Override
    public FileHandle internal(String path) {
        return new GwtFileHandle(preloader, path, FileType.Internal);
    }

    @Override
    public FileHandle external(String path) {
        throw new GdxRuntimeException("external() not supported in GWT backend");
    }

    @Override
    public FileHandle absolute(String path) {
        throw new GdxRuntimeException("absolute() not supported in GWT backend");
    }

    @Override
    public FileHandle local(String path) {
        throw new GdxRuntimeException("local() not supported in GWT backend");
    }

    @Override
    public String getExternalStoragePath() {
        return null;
    }

    @Override
    public boolean isExternalStorageAvailable() {
        return false;
    }

    @Override
    public String getLocalStoragePath() {
        return null;
    }

    @Override
    public boolean isLocalStorageAvailable() {
        return false;
    }
}
