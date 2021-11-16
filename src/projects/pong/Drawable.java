package projects.pong;

import java.awt.Graphics;

/**
 * An object that can be drawn on the screen.
 */
public interface Drawable {
	/**
	 * Draw the specified shape on a canvas.
	 *
	 * @param g The graphics object to use for drawing.
	 */
	void draw(Graphics g);
}
