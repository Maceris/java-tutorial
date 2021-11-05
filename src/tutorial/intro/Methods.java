package tutorial.intro;

import java.util.function.IntBinaryOperator;

/**
 * Examples of different types of methods.
 *
 * @author Ches Burks
 *
 */
public class Methods {

	/**
	 * Doesn't do anything.
	 */
	public void doNothing() {
		// Nothing to see here.
	}

	/**
	 * Returns the number 1.
	 *
	 * @return 1.
	 */
	public int returnOne() {
		return 1;
	}

	/**
	 * Takes in a number, adds 5 to it, and returns the result.
	 *
	 * @param input The input number.
	 * @return The number provided, plus five.
	 */
	public int addFive(int input) {
		return input + 5;
	}

	/**
	 * Take two numbers and add them together.
	 * 
	 * @param number1 The first number.
	 * @param number2 The second number.
	 * @return The result of the numbers added together.
	 * @see Math#addExact(int, int)
	 */
	public int addNumbers(int number1, int number2) {
		return number1 + number2;
	}

	/**
	 * Prints out "Hi" to the console.
	 */
	public void sayHi() {
		// This is calling a method, by the way.
		System.out.println("Hi");
	}

	/**
	 * Takes in 2 numbers and a binary operator, and applies the operation on
	 * the two numbers. Yes, I am messing with you at this point, and yes this
	 * works.
	 * 
	 * @param number1 The first number.
	 * @param number2 The second number.
	 * @param operation A function that takes in 2 integers and returns another
	 *            integer.
	 * @return The result of applying the provided operation on the given
	 *         numbers.
	 */
	public int doMath(int number1, int number2, IntBinaryOperator operation) {
		return operation.applyAsInt(number1, number2);
	}

	/**
	 * Adds numbers together, but way too complicated.
	 * 
	 * @param num1 The first number.
	 * @param num2 The second number.
	 * @return The result of the numbers added together, I guess.
	 */
	public int addNumbersAnnoyingly(int num1, int num2) {
		return doMath(num1, num2, this::addNumbers);
	}

}
