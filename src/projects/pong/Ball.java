package projects.pong;

import java.awt.Graphics;
import java.util.Random;

/**
 * The bouncing ball that the game is played with.
 */
public class Ball implements Drawable {

	/**
	 * The max amount the ball can move in one frame.
	 */
	public static final int MAX_SPEED = 5;

	private Rectangle location;

	/**
	 * How fast the ball is moving in the x direction.
	 */
	private int velocityX;
	/**
	 * How fast the ball is moving in the y direction.
	 */
	private int velocityY;

	private Random rand = new Random();

	/**
	 * Create a new ball at the given location.
	 *
	 * @param initialLocaton The starting location of the ball.
	 */
	public Ball(Rectangle initialLocaton) {
		if (initialLocaton == null) {
			throw new NullPointerException();
		}
		this.location = initialLocaton;
		this.setRandomDirection();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Fill this out
		// Hint: when drawing a new location, we first need to clear the old one
	}

	/**
	 * Get the location of the ball.
	 *
	 * @return The location.
	 */
	public Rectangle getLocation() {
		return this.location;
	}

	/**
	 * Return the x velocity.
	 *
	 * @return the velocityX
	 */
	public int getVelocityX() {
		return this.velocityX;
	}

	/**
	 * Return the y velocity.
	 *
	 * @return the velocityY
	 */
	public int getVelocityY() {
		return this.velocityY;
	}

	/**
	 * Make sure that no matter the direction, the speed is MAX_SPEED.
	 */
	private void normalizeVelocity() {
		double length = Math.sqrt(
			this.velocityX * this.velocityX + this.velocityY * this.velocityY);
		this.velocityX = (int) (this.velocityX / length) * Ball.MAX_SPEED;
		this.velocityY = (int) (this.velocityY / length) * Ball.MAX_SPEED;
	}

	/**
	 * Pick a random direction to be moving in.
	 */
	private void setRandomDirection() {
		// +/- max speed
		this.velocityX = this.rand.nextInt(Ball.MAX_SPEED * 2) - Ball.MAX_SPEED;
		this.velocityY = this.rand.nextInt(Ball.MAX_SPEED * 2) - Ball.MAX_SPEED;
		this.normalizeVelocity();
	}

	/**
	 * Set the x velocity.
	 *
	 * @param velocityX the velocityX to set
	 */
	public void setVelocityX(int velocityX) {
		this.velocityX = velocityX;
	}

	/**
	 * Set the y velocity.
	 *
	 * @param velocityY the velocityY to set
	 */
	public void setVelocityY(int velocityY) {
		this.velocityY = velocityY;
	}

}
