package com.badlogic.gdx.backends.gwt;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.gwt.GwtGraphics.OrientationLockType;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextArea;

public class GwtApplicationConfiguration {
    /**
     * the width of the drawing area in pixels, or 0 for using the available space
     **/
    public final int width;
    /**
     * the height of the drawing area in pixels, or 0 for using the available space
     **/
    public final int height;
    /**
     * Whether to use physical device pixels or CSS pixels for scaling the canvas. Makes a difference on mobile devices and HDPI
     * and Retina displays. Set to true for resizable and fullscreen games on mobile devices and for Desktops if you want to use
     * the full resolution of HDPI/Retina displays.<br/>
     * Setting to false mostly makes sense for fixed-size games or non-mobile games expecting performance issues on huge
     * resolutions. If you target mobiles and desktops, consider using physical device pixels on mobile devices only by using the
     * return value of {@link GwtApplication#isMobileDevice()} .
     */
    public final boolean usePhysicalPixels;
    /**
     * If true, audio backend will not be used. This means {@link Application#getAudio()} returns null.
     */
    public boolean disableAudio;
    /**
     * Padding to use for resizing the game content in the browser window, for resizable applications only. Defaults to 10. The
     * padding is necessary to prevent the browser from showing scrollbars. This can happen if the game content is of the same size
     * than the browser window. The padding is given in logical pixels, not affected by {@link #usePhysicalPixels}.
     */
    public int padHorizontal = 10, padVertical = 10;
    /**
     * whether to use a stencil buffer
     **/
    public boolean stencil = false;
    /**
     * whether to enable antialiasing
     **/
    public boolean antialiasing = false;
    /**
     * the Panel to add the WebGL canvas to, can be null in which case a Panel is added automatically to the body element of the
     * DOM
     **/
    public Panel rootPanel;
    /**
     * the id of a canvas element to be used as the drawing area, can be null in which case a Panel and Canvas are added to the
     * body element of the DOM
     **/
    public String canvasId;
    /**
     * a TextArea to log messages to, can be null in which case a TextArea will be added to the body element of the DOM.
     */
    public TextArea log;
    /**
     * whether to use debugging mode for OpenGL calls. Errors will result in a RuntimeException being thrown.
     */
    public boolean useDebugGL = false;
    /**
     * Whether to enable OpenGL ES 3.0 (aka WebGL2) if supported. If not supported it will fall-back to OpenGL ES 2.0. When GL ES
     * 3.0 is enabled, {@link com.badlogic.gdx.Gdx#gl30} can be used to access its functionality.
     */
    public boolean useGL30 = false;
    /**
     * preserve the back buffer, needed if you fetch a screenshot via canvas#toDataUrl, may have performance impact
     **/
    public boolean preserveDrawingBuffer = false;
    /**
     * whether to include an alpha channel in the color buffer to combine the color buffer with the rest of the webpage
     * effectively allows transparent backgrounds in GWT, at a performance cost.
     **/
    public boolean alpha = false;
    /**
     * whether to use premultipliedalpha, may have performance impact
     **/
    public boolean premultipliedAlpha = false;
    /**
     * screen-orientation to attempt locking as the application enters full-screen-mode. Note that on mobile browsers, full-screen
     * mode can typically only be entered on a user gesture (click, tap, key-stroke)
     **/
    public OrientationLockType fullscreenOrientation;
    /* Whether openURI will open page in new tab. By default it will, however if may be blocked by popup blocker. */
    /* To prevent the page from being blocked you can redirect to the new page. However this will exit your game. */
    public boolean openURLInNewWindow = true;
    /**
     * whether to use the accelerometer. default: true
     **/
    public boolean useAccelerometer = true;
    /**
     * whether to use the gyroscope. default: false
     **/
    public boolean useGyroscope = false;
    /**
     * whether to make the webgl context compatible with WebXR, may have positive performance impact
     **/
    public boolean xrCompatible = false;

    /**
     * Whether to fetch available output devices. It asks the user automatically for permission
     */
    public boolean fetchAvailableOutputDevices = false;

    /**
     * Creates configuration for a resizable application, using available browser window space minus padding (see
     * {@link #padVertical}, {@link #padHorizontal}).
     */
    public GwtApplicationConfiguration() {
        this(false);
    }

    /**
     * Creates configuration for a resizable application, using available browser window space minus padding (see
     * {@link #padVertical}, {@link #padHorizontal}). Also see {@link #usePhysicalPixels} documentation.
     */
    public GwtApplicationConfiguration(boolean usePhysicalPixels) {
        this(0, 0, usePhysicalPixels);
    }

    /**
     * Creates configuration for a fixed size application
     */
    public GwtApplicationConfiguration(int width, int height) {
        this(width, height, false);
    }

    /**
     * Creates configuration for a fixed size application Also see {@link #usePhysicalPixels} documentation.
     */
    public GwtApplicationConfiguration(int width, int height, boolean usePhysicalPixels) {
        this.width = width;
        this.height = height;
        this.usePhysicalPixels = usePhysicalPixels;
    }

    public boolean isFixedSizeApplication() {
        return width != 0 && height != 0;
    }
}
