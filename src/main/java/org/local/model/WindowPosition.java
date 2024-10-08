package org.local.model;

/**
 * WindowPosition class.
 *
 * @author Wender Couto
 * @since 0.0.1 Beta
 */

public class WindowPosition {
    public int x;
    public int y;
    public int width;
    public int height;
    public int windowPositionIndex;

    public WindowPosition(int x, int y, int width, int height, int windowPositionIndex) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.windowPositionIndex = windowPositionIndex;
    }
}
