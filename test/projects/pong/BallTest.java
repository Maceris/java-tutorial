package projects.pong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the ball class.
 *
 * @author Ches Burks
 *
 */
public class BallTest {

	/**
	 * Creates many balls and asserts that they have acceptable speeds.
	 */
	@Test
	public void testBall() {
		final int iterations = 1000;
		Rectangle initialLocation = new Rectangle(-1, -1, 2, 2);

		// Within 5% of the max speed
		final double marginOfError = Ball.MAX_SPEED * 0.05d;
		final double expectedSpeed = Ball.MAX_SPEED;

		for (int i = 0; i < iterations; ++i) {
			Ball ball = new Ball(initialLocation);
			double velocityX = ball.getVelocityX();
			double velocityY = ball.getVelocityY();
			double speed =
				Math.sqrt(velocityX * velocityX + velocityY * velocityY);
			Assert.assertEquals(expectedSpeed, speed, marginOfError);
		}
	}

	/**
	 * Test that we properly invert the x velocity.
	 */
	@Test
	public void testInvertVelocityX() {
		// Within 5% of the max speed
		final double marginOfError = Ball.MAX_SPEED * 0.05d;
		Ball ball = new Ball(new Rectangle(-1, -1, 2, 2));

		double expectedX = -ball.getVelocityX();
		ball.invertVelocityX();
		Assert.assertEquals(expectedX, ball.getVelocityX(), marginOfError);

		expectedX = -expectedX;
		ball.invertVelocityX();
		Assert.assertEquals(expectedX, ball.getVelocityX(), marginOfError);
	}

	/**
	 * Test that we properly invert the y velocity.
	 */
	@Test
	public void testInvertVelocityY() {
		// Within 5% of the max speed
		final double marginOfError = Ball.MAX_SPEED * 0.05d;
		Ball ball = new Ball(new Rectangle(-1, -1, 2, 2));

		double expectedY = -ball.getVelocityY();
		ball.invertVelocityY();
		Assert.assertEquals(expectedY, ball.getVelocityY(), marginOfError);

		expectedY = -expectedY;
		ball.invertVelocityY();
		Assert.assertEquals(expectedY, ball.getVelocityY(), marginOfError);
	}

}
