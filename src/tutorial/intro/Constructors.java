package tutorial.intro;

/**
 * Shows constructors with varying numbers of arguments.
 *
 * @author Ches Burks
 *
 */
public class Constructors {

	private int x;
	private int y;
	private int z;

	/**
	 * Defaults all values to 0.
	 */
	public Constructors() {
		this(0, 0, 0);
	}

	/**
	 * Sets up only 1 of the values.
	 *
	 * @param x The x value.
	 */
	public Constructors(int x) {
		this(x, 0, 0);
	}

	/**
	 * Sets up only 2 of the values.
	 *
	 * @param x The x value.
	 * @param y The y value.
	 */
	public Constructors(int x, int y) {
		// Calls the 3 argument constructor
		this(x, y, 0);
	}

	/**
	 * Sets the variables up for this class.
	 *
	 * @param x The x value.
	 * @param y The y value.
	 * @param z The z value.
	 */
	public Constructors(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
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
	 * @return the z
	 */
	public int getZ() {
		return this.z;
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

	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}

}
