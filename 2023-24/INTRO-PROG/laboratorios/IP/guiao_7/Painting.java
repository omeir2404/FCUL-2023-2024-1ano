import java.awt.Color;

/**
 * The Painting class implements some basic drawing primitives which depend on
 * the StdDraw class.
 *
 * Since this class depends on StdDraw, the file StdDraw.class should be in the
 * same folder as this file.
 *
 * Compile: javac Painting.java
 * Run: java Painting
 *
 * @author filipecasal 1920
 */
public class Painting {

    /**
     * Defines the canvas to be a square with coordinates {@code
     * (0, sz)              (sz, sz)
     *    ______________________
     *   |                      |
     *   |                      |
     *   |                      |
     *   |                      |
     *   |                      |
     *   |                      |
     *   |                      |
     *   |                      |
     *   |______________________|
     * (0, 0)                (sz, 0)
     *  }
     *
     * @param sz size of the canvas
     */
    public static void setCanvasSize(int sz) {
        StdDraw.setScale(0, sz);
    }

    /**
     * Paint a pixel at {@code (x, y)}, with a given color
     *
     * @param c Color to paint the pixel
     * @param x x-coordinate of the pixel
     * @param y y-coordinate of the pixel
     */
    public static void paintPixel(Color c, int x, int y) {
        StdDraw.setPenColor(c);
        StdDraw.filledSquare(x, y, 0.5);
    }

    /**
     * Checks a mystery condition for a given point (x, y)
     *
     * @param x       x-coordinate of the point to be checked
     * @param y       y-coordinate of the point to be checked
     * @param centerX center x-coordinate of the mystery
     * @param centerY center y-coordinate of the mystery
     * @return true if the point is mysterious, false otherwise
     */
    public static boolean isMystery(int x, int y, int centerX, int centerY) {
        int offsetX = (x - centerX) * (x - centerX);
        int offsetY = (y - centerY) * (y - centerY);
        return offsetX + offsetY < 1 - 3000 * offsetX * offsetY;
    }

    /**
     * Draw a mysterious curve
     *
     * @param dim     Size of the canvas
     * @param c       Color to pain the mystery curve
     * @param centerX Center x-coordinate of the mystery curve
     * @param centerY Center y-coordinate of the mystery curve
     */
    public static void paintMystery(int dim, Color c, int centerX, int centerY) {
        // TODO
    }

    /**
     * Draws line y = x with a given color on a canvas of size {@code dim}
     *
     * @param dim The dimensions of the given canvas
     * @param c   The color to be used when drawing the line
     */
    public static void drawLine(int dim, Color c) {
        for (int x = 0; x < dim; x++) {
            for (int y = 0; y < dim; y++) {
                if (y == x)
                    paintPixel(c, x, y);
            }
        }
    }

    public static void main(String[] args) {
        int dim = 128;
        setCanvasSize(dim);

        // Draw line y = x with color red
        Color red = Color.red;
        drawLine(dim, red);

    }

}