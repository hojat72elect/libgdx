package com.badlogic.gdx.backends.gwt.preloader;

/**
 * Interface used by the PreloaderBundleGenerator to decide whether an asset found in the gdx.assetpath should be included in the
 * war/ folder or not. Also used to determine the type of an asset. Default implementation can be found in DefaultAssetFilter, and
 * is used if user doesn't specify a custom filter in the module gwt.xml file.
 */
public interface AssetFilter {
    /**
     * @param file        the file to filter
     * @param isDirectory whether the file is a directory
     * @return whether to include the file in the war/ folder or not.
     */
    public boolean accept(String file, boolean isDirectory);

    /**
     * @param file the file to filter
     * @return whether to preload the file, or to lazy load it via AssetManager
     */
    public boolean preload(String file);

    /**
     * @param file the file to get the type for
     * @return the type of the file, one of {@link AssetType}
     */
    public AssetType getType(String file);

    /**
     * @param file the file to get the bundle name for
     * @return the name of the bundle to which this file should be added
     */
    public String getBundleName(String file);

    public enum AssetType {
        Image("i"), Audio("a"), Text("t"), Binary("b"), Directory("d");

        public final String code;

        private AssetType(String code) {
            this.code = code;
        }
    }

}
