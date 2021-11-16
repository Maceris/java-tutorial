package projects.pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 * One of the paddles that are used to play the game with.
 */
public class Paddle implements Drawable {

	private Rectangle location;

	/**
	 * Create a new paddle at the given location.
	 *
	 * @param initialLocaton The starting location of the paddle.
	 */
	public Paddle(Rectangle initialLocaton) {
		if (initialLocaton == null) {
			throw new NullPointerException();
		}
		this.location = initialLocaton;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Fill this out
		// Hint: when drawing a new location, we first need to clear the old one
		g.setColor(Color.RED);
		g.fillRect(location.getX(), location.getY(), location.getWidth(),
			location.getHeight());
	}

	/**
	 * Get the location of the paddle.
	 *
	 * @return The location.
	 */
	public Rectangle getLocation() {
		return this.location;
	}

}
