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
	private double velocityX;
	/**
	 * How fast the ball is moving in the y direction.
	 */
	private double velocityY;

	private Random rand = new Random();

	/**
	 * Create a new ball at the given location.
	 *
	 * @param initialLocaton The starting location of the ball. Uses this actual
	 *            reference, does not make a copy.
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
	 * Return the x velocity rounded to an integer.
	 *
	 * @return the x velocity as an integer.
	 */
	public int getApproximateVelocityX() {
		final long x = Math.round(this.velocityX);

		if (x > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (x < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) x;
	}

	/**
	 * Return the y velocity rounded to an integer.
	 *
	 * @return the y velocity as an integer.
	 */
	public int getApproximateVelocityY() {
		final long y = Math.round(this.velocityY);

		if (y > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (y < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) y;
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
	 * Returns a value to nudge velocity by in case it's zero. Should give back
	 * a nonzero integer that is less than (in terms of absolute value) the max
	 * speed.
	 *
	 * @return The value to nudge velocity by.
	 */
	private double getNudge() {
		final int halfSpeed = Ball.MAX_SPEED / 2;
		final double nudge = this.rand.nextDouble() * halfSpeed + halfSpeed;
		return this.rand.nextBoolean() ? nudge : -nudge;
	}

	/**
	 * Return the x velocity.
	 *
	 * @return the x velocity.
	 */
	public double getVelocityX() {
		return this.velocityX;
	}

	/**
	 * Return the y velocity.
	 *
	 * @return the y velocity.
	 */
	public double getVelocityY() {
		return this.velocityY;
	}

	/**
	 * Flips the direction of the x component of velocity. Useful for bouncing
	 * against a vertical wall or paddle.
	 */
	public void invertVelocityX() {
		this.velocityX = -this.velocityX;
	}

	/**
	 * Flips the direction of the y component of velocity. Useful for bouncing
	 * against a horizontal floor or ceiling.
	 */
	public void invertVelocityY() {
		this.velocityY = -this.velocityY;
	}

	/**
	 * Make sure that no matter the direction, the speed is MAX_SPEED.
	 */
	private void normalizeVelocity() {
		final double length = Math.sqrt(
			this.velocityX * this.velocityX + this.velocityY * this.velocityY);
		this.velocityX = (this.velocityX / length) * Ball.MAX_SPEED;
		this.velocityY = (this.velocityY / length) * Ball.MAX_SPEED;
	}

	/**
	 * Pick a random direction to be moving in.
	 */
	private void setRandomDirection() {
		// +/- max speed
		this.velocityX = this.rand.nextDouble() * Ball.MAX_SPEED;
		if (this.rand.nextBoolean()) {
			this.velocityX = -this.velocityX;
		}
		if (this.velocityX == 0) {
			// Nudge zero values so the ball actually moves horizontally
			this.velocityX += this.getNudge();
		}
		this.velocityY = this.rand.nextDouble() * Ball.MAX_SPEED;
		if (this.rand.nextBoolean()) {
			this.velocityY = -this.velocityY;
		}
		if (this.velocityY == 0) {
			// nudge the y values so the ball actually moves vertically
			this.velocityY += this.getNudge();
		}
		this.normalizeVelocity();
	}

}
