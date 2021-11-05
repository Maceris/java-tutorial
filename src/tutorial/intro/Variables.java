package tutorial.intro;

/**
 * Examples of different types of variables.
 *
 * @author Ches Burks
 *
 */
public class Variables {
	/**
	 * Stores integer values between {@value Byte#MIN_VALUE} and
	 * {@value Byte#MAX_VALUE}.
	 */
	public byte tinyNumber = 126;

	/**
	 * Stores integer values between {@value Short#MIN_VALUE} and
	 * {@value Short#MAX_VALUE}.
	 */
	public short smallNumber = 500;

	/**
	 * Stores integer values between {@value Integer#MIN_VALUE} and
	 * {@value Integer#MAX_VALUE}.
	 */
	public int integer = 1;

	/**
	 * Stores integer values between {@value Long#MIN_VALUE} and
	 * {@value Long#MAX_VALUE}.
	 */
	public long largeInteger = 10000000000L;

	/**
	 * Stores floating point values between {@value Float#MIN_VALUE} and
	 * {@value Float#MAX_VALUE}. Good for up to 6-7 digits.
	 */
	public float decimal = 3.14f;

	/**
	 * Stores double-precision floating point values between
	 * {@value Double#MIN_VALUE} and {@value Double#MAX_VALUE}. Good for up to
	 * 15 digits.
	 */
	public double longDecimal = 3.14159d;

	/**
	 * Stores true or false values.
	 */
	public boolean bool = false;

	/**
	 * Stores characters (16-bit values) with values between \u0000 and \uffff.
	 */
	public char letter = 'a';

	/**
	 * Stores a string of text.
	 */
	public String string = "Text";

	/**
	 * An array of integers, provided with an actual list of values to use.
	 */
	public int[] intArray = {1, 2, 3, 4};

	/**
	 * An object of the type {@link SimpleClass}.
	 */
	public SimpleClass object = new SimpleClass();
}
