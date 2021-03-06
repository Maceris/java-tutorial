package projects.pong;

/**
 * A rectangle.
 */
public class Rectangle {
	/**
	 * Check if two rectangles are overlapping.
	 *
	 * @param r1 The first rectangle.
	 * @param r2 The second rectangle.
	 * @return True if the rectangles overlap, false if they do not.
	 */
	public static boolean overlap(Rectangle r1, Rectangle r2) {
		return r1.x < r2.x + r2.width && r1.x + r1.width > r2.x
			&& r1.y < r2.y + r2.height && r1.y + r1.height > r2.y;
	}

	private int x;
	private int y;
	private int width;
	private int height;

	/**
	 * Create a new rectangle with all zero values.
	 */
	public Rectangle() {
		this(0, 0, 0, 0);
	}

	/**
	 * Create a new rectangle.
	 *
	 * @param x The x location of the top left corner.
	 * @param y The y location of the top left corner.
	 * @param width The width of the rectangle. If <= 0, considered 0.
	 * @param height The height of the rectangle. If <= 0, considered 0.
	 */
	public Rectangle(final int x, final int y, final int width,
		final int height) {
		this.x = x;
		this.y = y;
		this.setWidth(width);
		this.setHeight(height);
	}

	/**
	 * Add a value to the x coordinate.
	 *
	 * @param delta The amount to increase by, may be negative.
	 */
	public void addX(int delta) {
		this.x += delta;
	}

	/**
	 * Add a value to the y coordinate.
	 *
	 * @param delta The amount to increase by, may be negative.
	 */
	public void addY(int delta) {
		this.y += delta;
	}

	/**
	 * Displace the x and y coordinates by the given amounts.
	 *
	 * @param deltaX The amount to increase x by, may be negative.
	 * @param deltaY The amount to increase y by, may be negative.
	 */
	public void displace(int deltaX, int deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Checks if this rectangle intersects with another.
	 *
	 * @param other The other rectangle.
	 * @return True if the rectangles overlap, false if they do not.
	 */
	public boolean overlapsWith(Rectangle other) {
		return Rectangle.overlap(this, other);
	}

	/**
	 * Sets the height of the rectangle. Anything <= 0 will be considered 0.
	 *
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		if (height <= 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
	}

	/**
	 * Set the new position of the rectangle.
	 *
	 * @param newX The new x position.
	 * @param newY The new y position.
	 */
	public void setPosition(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}

	/**
	 * Set the new size of the rectangle. If either are <= 0, they are
	 * considered 0.
	 *
	 * @param newWidth The new width.
	 * @param newHeight The new height.
	 */
	public void setSize(int newWidth, int newHeight) {
		this.setWidth(newWidth);
		this.setHeight(newHeight);
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		if (width <= 0) {
			this.width = 0;
		}
		else {
			this.width = width;
		}
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
