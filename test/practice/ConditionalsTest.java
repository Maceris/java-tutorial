package practice;

import org.junit.Assert;
import org.junit.Test;
import practice.Conditionals.Operator;

/**
 * Tests the conditional tests.
 *
 * @author Ches Burks
 *
 */
public class ConditionalsTest {

	/**
	 * Tests the {@link Conditionals#absoluteValue(int)} method.
	 */
	@Test
	public void testAbsoluteValue() {
		Assert.assertEquals(0, Conditionals.absoluteValue(0));
		Assert.assertEquals(1, Conditionals.absoluteValue(1));
		Assert.assertEquals(1, Conditionals.absoluteValue(-1));
		Assert.assertEquals(9999, Conditionals.absoluteValue(-9999));
		Assert.assertEquals(123456, Conditionals.absoluteValue(123456));
	}

	/**
	 * Tests the {@link Conditionals#isEven(int)} method.
	 */
	@Test
	public void testIsEven() {
		Assert.assertEquals(true, Conditionals.isEven(0));
		Assert.assertEquals(true, Conditionals.isEven(2));
		Assert.assertEquals(true, Conditionals.isEven(4));
		Assert.assertEquals(true, Conditionals.isEven(12346890));
		Assert.assertEquals(true, Conditionals.isEven(-2));
		Assert.assertEquals(true, Conditionals.isEven(-9999998));
		Assert.assertEquals(false, Conditionals.isEven(1));
		Assert.assertEquals(false, Conditionals.isEven(-1));
		Assert.assertEquals(false, Conditionals.isEven(-12341));
		Assert.assertEquals(false, Conditionals.isEven(9999));
		Assert.assertEquals(false, Conditionals.isEven(777));
	}

	/**
	 * Tests the {@link Conditionals#math(int, int, Operator)} method.
	 */
	@Test
	public void testMath() {
		// Add
		Assert.assertEquals(5, Conditionals.math(2, 3, Operator.ADD));
		Assert.assertEquals(1, Conditionals.math(-1, 2, Operator.ADD));
		Assert.assertEquals(0, Conditionals.math(10, -10, Operator.ADD));
		Assert.assertEquals(-123, Conditionals.math(-123, 0, Operator.ADD));
		Assert.assertEquals(44, Conditionals.math(0, 44, Operator.ADD));
		Assert.assertEquals(Integer.MIN_VALUE,
			Conditionals.math(Integer.MAX_VALUE, 1, Operator.ADD));
		// Subtract
		Assert.assertEquals(50, Conditionals.math(65, 15, Operator.SUBTRACT));
		Assert.assertEquals(-3, Conditionals.math(-1, 2, Operator.SUBTRACT));
		Assert.assertEquals(0, Conditionals.math(10, 10, Operator.SUBTRACT));
		Assert.assertEquals(-123,
			Conditionals.math(-123, 0, Operator.SUBTRACT));
		Assert.assertEquals(-44, Conditionals.math(0, 44, Operator.SUBTRACT));
		Assert.assertEquals(54, Conditionals.math(10, -44, Operator.SUBTRACT));
		Assert.assertEquals(Integer.MAX_VALUE,
			Conditionals.math(Integer.MIN_VALUE, 1, Operator.SUBTRACT));
		// Divide
		Assert.assertEquals(50, Conditionals.math(100, 2, Operator.DIVIDE));
		Assert.assertEquals(1, Conditionals.math(3, 2, Operator.DIVIDE));
		Assert.assertEquals(1, Conditionals.math(10, 10, Operator.DIVIDE));
		Assert.assertEquals(-20, Conditionals.math(-80, 4, Operator.DIVIDE));
		Assert.assertThrows(ArithmeticException.class, () -> {
			Conditionals.math(80, 0, Operator.DIVIDE);
		});
		Assert.assertThrows(ArithmeticException.class, () -> {
			Conditionals.math(-55, 0, Operator.DIVIDE);
		});
		// Multiply
		Assert.assertEquals(100, Conditionals.math(50, 2, Operator.MULTIPLY));
		Assert.assertEquals(100, Conditionals.math(4, 25, Operator.MULTIPLY));
		Assert.assertEquals(1, Conditionals.math(1, 1, Operator.MULTIPLY));
		Assert.assertEquals(-10, Conditionals.math(-5, 2, Operator.MULTIPLY));
		Assert.assertEquals(-16, Conditionals.math(4, -4, Operator.MULTIPLY));
		Assert.assertEquals(25, Conditionals.math(-5, -5, Operator.MULTIPLY));
		Assert.assertEquals(0, Conditionals.math(4, 0, Operator.MULTIPLY));
		Assert.assertEquals(0, Conditionals.math(0, 4, Operator.MULTIPLY));
		Assert.assertEquals(0, Conditionals.math(-4, 0, Operator.MULTIPLY));
		Assert.assertEquals(0, Conditionals.math(0, -7, Operator.MULTIPLY));
		Assert.assertEquals(1, Conditionals.math(Integer.MAX_VALUE,
			Integer.MAX_VALUE, Operator.MULTIPLY));
	}

	/**
	 * Tests the {@link Conditionals#max(int, int)} method.
	 */
	@Test
	public void testMaxIntInt() {
		// Equal values
		Assert.assertEquals(-55, Conditionals.max(-55, -55));
		Assert.assertEquals(0, Conditionals.max(0, 0));
		Assert.assertEquals(9999, Conditionals.max(9999, 9999));
		// Negative and zero
		Assert.assertEquals(0, Conditionals.max(0, -22));
		Assert.assertEquals(0, Conditionals.max(-22, 0));
		// All negatives
		Assert.assertEquals(-55, Conditionals.max(-55, -998));
		Assert.assertEquals(-55, Conditionals.max(-999, -55));
		// Positive and zero
		Assert.assertEquals(754, Conditionals.max(754, 0));
		Assert.assertEquals(754, Conditionals.max(0, 754));
		// Positive and negative
		Assert.assertEquals(1, Conditionals.max(1, -1));
		Assert.assertEquals(1, Conditionals.max(-1, 1));
		// All positives
		Assert.assertEquals(9999, Conditionals.max(9999, 4));
		Assert.assertEquals(9999, Conditionals.max(4, 9999));
	}

	/**
	 * Tests the {@link Conditionals#max(int, int, int)} method.
	 */
	@Test
	public void testMaxIntIntInt() {
		// Equal values
		Assert.assertEquals(-55, Conditionals.max(-55, -55, -55));
		Assert.assertEquals(0, Conditionals.max(0, 0, 0));
		Assert.assertEquals(9999, Conditionals.max(9999, 9999, 9999));
		// Negative and zero
		Assert.assertEquals(0, Conditionals.max(0, -22, -1234));
		Assert.assertEquals(0, Conditionals.max(-22, 0, -555));
		Assert.assertEquals(0, Conditionals.max(-22, -694, 0));
		// All negatives
		Assert.assertEquals(-55, Conditionals.max(-55, -998, -78));
		Assert.assertEquals(-55, Conditionals.max(-999, -55, -888888));
		Assert.assertEquals(-55, Conditionals.max(-999, -555, -55));
		// Positive and zero
		Assert.assertEquals(754, Conditionals.max(754, 0, 0));
		Assert.assertEquals(754, Conditionals.max(0, 754, 0));
		Assert.assertEquals(754, Conditionals.max(0, 0, 754));
		// Positive and negative
		Assert.assertEquals(1, Conditionals.max(1, -1, -48));
		Assert.assertEquals(1, Conditionals.max(-1, 1, -78));
		Assert.assertEquals(1, Conditionals.max(-1, -881, 1));
		// All positives
		Assert.assertEquals(9999, Conditionals.max(9999, 4, 5));
		Assert.assertEquals(9999, Conditionals.max(4, 9999, 1));
		Assert.assertEquals(9999, Conditionals.max(8888, 9998, 9999));
	}

}
