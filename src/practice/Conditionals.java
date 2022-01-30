package practice;

/**
 * Practice problems for writing conditionals.
 *
 * @author Ches Burks
 *
 */
public class Conditionals {

	/**
	 * Operators used in the math method.
	 */
	public enum Operator {
		/**
		 * Add two numbers together.
		 */
		ADD,
		/**
		 * Subtract the second number from the first.
		 */
		SUBTRACT,
		/**
		 * Divide the first number by the second.
		 */
		DIVIDE,
		/**
		 * Multiply the two numbers together.
		 */
		MULTIPLY;
	}

	/**
	 * Returns the absolute value of the given number. If the number is positive
	 * or zero, it is returned. If it is negative, the sign is inverted so that
	 * it is positive.
	 *
	 * @param number The input number.
	 * @return The absolute value of the given number.
	 */
	public static int absoluteValue(int number) {
		return -1;
	}

	/**
	 * Checks if the given number is even. If the number is even, returns true,
	 * and odd it returns false. Negative numbers are considered as if they were
	 * positive, and zero is considered even.
	 *
	 * @param number The number to test.
	 * @return True if even, false if odd.
	 */
	public static boolean isEven(int number) {
		return false;
	}

	/**
	 * Performs some math on the provided numbers based on the given operator.
	 * The format is <code>a _ b</code> where the blank is the provided
	 * operation.
	 *
	 * @param a The first number.
	 * @param b The second number.
	 * @param operation The operation to do, in the form
	 *            <code>a operation b</code>
	 * @return The resulting number.
	 * @throws ArithmeticException If there is an impossible calculation, like
	 *             dividing by zero.
	 */
	public static int math(int a, int b, Operator operation)
		throws ArithmeticException {
		return -1;
	}

	/**
	 * Returns the largest of the two provided values.
	 *
	 * @param a The first value.
	 * @param b The second value.
	 * @return The largest of the two provided numbers.
	 */
	public static int max(int a, int b) {
		return -1;
	}

	/**
	 * Returns the largest of the three provided values.
	 *
	 * @param a The first value.
	 * @param b The second value.
	 * @param c The third value.
	 * @return The largest of the three provided numbers.
	 */
	public static int max(int a, int b, int c) {
		return -1;
	}

}
