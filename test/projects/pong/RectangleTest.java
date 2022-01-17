package projects.pong;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the Rectangle class.
 *
 * @author Ches Burks
 *
 */
public class RectangleTest {

	/**
	 * Tests the addX method.
	 */
	@Test
	public void testAddX() {
		Rectangle rectangle = new Rectangle();
		final int originalY = rectangle.getY();
		final int originalWidth = rectangle.getWidth();
		final int originalHeight = rectangle.getHeight();

		rectangle.setX(0);
		Assert.assertEquals(0, rectangle.getX());

		rectangle.addX(4);
		Assert.assertEquals(4, rectangle.getX());
		Assert.assertEquals(originalY, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.addX(-8);
		Assert.assertEquals(-4, rectangle.getX());
		Assert.assertEquals(originalY, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.setX(7);
		rectangle.addX(0);
		Assert.assertEquals(7, rectangle.getX());
		Assert.assertEquals(originalY, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());
	}

	/**
	 * Tests the addY method.
	 */
	@Test
	public void testAddY() {
		Rectangle rectangle = new Rectangle();
		final int originalX = rectangle.getX();
		final int originalWidth = rectangle.getWidth();
		final int originalHeight = rectangle.getHeight();

		rectangle.setY(0);
		Assert.assertEquals(0, rectangle.getY());

		rectangle.addY(4);
		Assert.assertEquals(4, rectangle.getY());
		Assert.assertEquals(originalX, rectangle.getX());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.addY(-8);
		Assert.assertEquals(-4, rectangle.getY());
		Assert.assertEquals(originalX, rectangle.getX());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.setY(7);
		rectangle.addY(0);
		Assert.assertEquals(7, rectangle.getY());
		Assert.assertEquals(originalX, rectangle.getX());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());
	}

	/**
	 * Tests the displace method.
	 */
	@Test
	public void testDisplace() {
		Rectangle rectangle = new Rectangle();
		final int originalWidth = rectangle.getWidth();
		final int originalHeight = rectangle.getHeight();

		int x = 0;
		int y = 0;

		rectangle.setX(x);
		rectangle.setY(y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());

		rectangle.displace(5, 5);
		x += 5;
		y += 5;
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.displace(0, 0);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.displace(-10, 1);
		x += -10;
		y += 1;
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());

		rectangle.displace(5, -15);
		x += 5;
		y += -15;
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
		Assert.assertEquals(originalWidth, rectangle.getWidth());
		Assert.assertEquals(originalHeight, rectangle.getHeight());
	}

	/**
	 * Tests many different
	 */
	@Test
	public void testOverlap() {
		Rectangle first = new Rectangle();
		Rectangle second = new Rectangle();

		// Exact overlap
		first.setSize(2, 2);
		first.setPosition(-1, -1);
		second.setSize(2, 2);
		second.setPosition(-1, -1);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Corner, top left
		second.setPosition(-2, -2);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Corner, top right
		second.setPosition(0, -2);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Corner, bottom left
		second.setPosition(-2, 0);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Corner, bottom right
		second.setPosition(0, 0);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Larger, above
		second.setPosition(-2, -2);
		second.setSize(4, 2);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Larger, right
		second.setPosition(0, -2);
		second.setSize(2, 4);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Larger, below
		second.setPosition(-2, 0);
		second.setSize(4, 2);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Larger, left
		second.setPosition(-2, -2);
		second.setSize(2, 4);
		Assert.assertTrue(Rectangle.overlap(first, second));

		first.setSize(2, 2);
		first.setPosition(-1, -1);
		second.setPosition(-2, -2);
		second.setSize(4, 4);

		// Larger, surrounding
		Assert.assertTrue(Rectangle.overlap(first, second));
		// Smaller, contained
		Assert.assertTrue(Rectangle.overlap(second, first));

		// Edge overlap, top
		first.setPosition(-2, -2);
		first.setSize(4, 4);
		second.setSize(2, 2);
		second.setPosition(-1, -3);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Edge overlap, right
		second.setPosition(1, -1);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Edge overlap, bottom
		second.setPosition(-1, 1);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Edge overlap, left

		second.setPosition(-3, -1);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Multiple edge overlap, left and right
		second.setSize(6, 2);
		second.setPosition(-3, -1);
		Assert.assertTrue(Rectangle.overlap(first, second));

		// Multiple edge overlap, top and bottom
		second.setSize(2, 6);
		second.setPosition(-1, -3);
		Assert.assertTrue(Rectangle.overlap(first, second));
	}

	/**
	 * Test the 4 argument rectangle constructor.
	 */
	@Test
	public void testRectangleIntIntIntInt() {
		final int x = 1;
		final int y = 2;
		final int width = 3;
		final int height = 4;

		Rectangle rectangle = new Rectangle(x, y, width, height);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
		Assert.assertEquals(width, rectangle.getWidth());
		Assert.assertEquals(height, rectangle.getHeight());
	}

	/**
	 * Test the height getter and setter.
	 */
	@Test
	public void testSetAndGetHeight() {
		Rectangle rectangle = new Rectangle();
		int[] heightList = {0, 1, 99999};
		final int originalX = rectangle.getX();
		final int originalY = rectangle.getY();
		final int originalWidth = rectangle.getWidth();

		for (int height : heightList) {
			rectangle.setHeight(height);
			Assert.assertEquals(height, rectangle.getHeight());
			// Check that the other variables remain the same
			Assert.assertEquals(originalX, rectangle.getX());
			Assert.assertEquals(originalY, rectangle.getY());
			Assert.assertEquals(originalWidth, rectangle.getWidth());
		}

		rectangle.setHeight(-1);
		Assert.assertEquals(0, rectangle.getHeight());
	}

	/**
	 * Test the position setter.
	 */
	@Test
	public void testSetAndGetPosition() {
		Rectangle rectangle = new Rectangle();
		int x = 0;
		int y = 0;

		rectangle.setPosition(x, y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());

		x = 123;
		y = 5;
		rectangle.setPosition(x, y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());

		x = 99;
		y = 99;
		rectangle.setPosition(x, y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());

		x = -1;
		y = -333;
		rectangle.setPosition(x, y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());

		x = 999;
		y = -345;
		rectangle.setPosition(x, y);
		Assert.assertEquals(x, rectangle.getX());
		Assert.assertEquals(y, rectangle.getY());
	}

	/**
	 * Test the size setter.
	 */
	@Test
	public void testSetAndGetSize() {
		Rectangle rectangle = new Rectangle();
		int width = 0;
		int height = 0;

		rectangle.setSize(width, height);
		Assert.assertEquals(width, rectangle.getWidth());
		Assert.assertEquals(height, rectangle.getHeight());

		width = 123;
		height = 5;
		rectangle.setSize(width, height);
		Assert.assertEquals(width, rectangle.getWidth());
		Assert.assertEquals(height, rectangle.getHeight());

		width = 99;
		height = 99;
		rectangle.setSize(width, height);
		Assert.assertEquals(width, rectangle.getWidth());
		Assert.assertEquals(height, rectangle.getHeight());

		width = -1;
		height = -333;
		rectangle.setSize(width, height);
		Assert.assertEquals(0, rectangle.getWidth());
		Assert.assertEquals(0, rectangle.getHeight());
	}

	/**
	 * Test the width getter and setter.
	 */
	@Test
	public void testSetAndGetWidth() {
		Rectangle rectangle = new Rectangle();
		int[] widthList = {0, 1, 10000};
		final int originalX = rectangle.getX();
		final int originalY = rectangle.getY();
		final int originalHeight = rectangle.getHeight();

		for (int width : widthList) {
			rectangle.setWidth(width);
			Assert.assertEquals(width, rectangle.getWidth());
			// Check that the other variables remain the same
			Assert.assertEquals(originalX, rectangle.getX());
			Assert.assertEquals(originalY, rectangle.getY());
			Assert.assertEquals(originalHeight, rectangle.getHeight());
		}

		rectangle.setWidth(-1);
		Assert.assertEquals(0, rectangle.getWidth());
	}

	/**
	 * Test the X getter and setter.
	 */
	@Test
	public void testSetAndGetX() {
		Rectangle rectangle = new Rectangle();
		int[] xList = {0, -1, 10000, -100000};
		final int originalY = rectangle.getY();
		final int originalWidth = rectangle.getWidth();
		final int originalHeight = rectangle.getHeight();

		for (int x : xList) {
			rectangle.setX(x);
			Assert.assertEquals(x, rectangle.getX());
			// Check that the other variables remain the same
			Assert.assertEquals(originalY, rectangle.getY());
			Assert.assertEquals(originalWidth, rectangle.getWidth());
			Assert.assertEquals(originalHeight, rectangle.getHeight());
		}
	}

	/**
	 * Test the Y getter and setter.
	 */
	@Test
	public void testSetAndGetY() {
		Rectangle rectangle = new Rectangle();
		int[] yList = {0, -1, 10000, -100000};
		final int originalX = rectangle.getX();
		final int originalWidth = rectangle.getWidth();
		final int originalHeight = rectangle.getHeight();

		for (int y : yList) {
			rectangle.setY(y);
			Assert.assertEquals(y, rectangle.getY());
			// Check that the other variables remain the same
			Assert.assertEquals(originalX, rectangle.getX());
			Assert.assertEquals(originalWidth, rectangle.getWidth());
			Assert.assertEquals(originalHeight, rectangle.getHeight());
		}
	}

}
