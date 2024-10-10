

package com.badlogic.gdx.files;

import java.io.InputStream;
import java.io.OutputStream;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtFileHandle;

/** A FileHandle intended to be subclassed for the purpose of implementing {@link #read()} and/or {@link #write(boolean)}. Methods
 * that would manipulate the file instead throw UnsupportedOperationException.
 *  */
public abstract class FileHandleStream extends GwtFileHandle {
	public FileHandleStream (String path) {
		super(((GwtApplication)Gdx.app).getPreloader(), path, FileType.Internal);
	}

	public boolean isDirectory () {
		return false;
	}

	public long length () {
		return 0;
	}

	public boolean exists () {
		return true;
	}

	public FileHandle child (String name) {
		throw new UnsupportedOperationException();
	}

	public FileHandle parent () {
		throw new UnsupportedOperationException();
	}

	public InputStream read () {
		throw new UnsupportedOperationException();
	}

	public OutputStream write (boolean overwrite) {
		throw new UnsupportedOperationException();
	}

	public FileHandle[] list () {
		throw new UnsupportedOperationException();
	}

	public void mkdirs () {
		throw new UnsupportedOperationException();
	}

	public boolean delete () {
		throw new UnsupportedOperationException();
	}

	public boolean deleteDirectory () {
		throw new UnsupportedOperationException();
	}

	public void copyTo (FileHandle dest) {
		throw new UnsupportedOperationException();
	}

	public void moveTo (FileHandle dest) {
		throw new UnsupportedOperationException();
	}
}
