package practice;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests the loops practice problems.
 *
 * @author Ches Burks
 *
 */
public class LoopsTest {

	private static PrintStream originalSystemOut;
	private static ByteArrayOutputStream outputCapture =
		new ByteArrayOutputStream();

	/**
	 * Sets up the system out to capture output in our buffer instead of
	 * printing.
	 */
	@BeforeClass
	public static void setUpBeforeClass() {
		LoopsTest.originalSystemOut = System.out;
		System.setOut(new PrintStream(LoopsTest.outputCapture));
	}

	/**
	 * Restores the original system out call.
	 */
	@AfterClass
	public static void tearDownAfterClass() {
		System.setOut(LoopsTest.originalSystemOut);
	}

	/**
	 * Clear our temporary output buffer before each test.
	 */
	@Before
	public void setupBeforeMethod() {
		LoopsTest.outputCapture.reset();
	}

	/**
	 * Test the fizbuzz problem.
	 */
	@Test
	public void testFizbuzz() {
		String separator = System.getProperty("line.separator");
		// We don't want to give away the loop solution
		String expected = "1" + separator + "2" + separator + "fizz" + separator
			+ "4" + separator + "buzz" + separator + "fizz" + separator + "7"
			+ separator + "8" + separator + "fizz" + separator + "buzz"
			+ separator + "11" + separator + "fizz" + separator + "13"
			+ separator + "14" + separator + "fizzbuzz" + separator + "16"
			+ separator + "17" + separator + "fizz" + separator + "19"
			+ separator + "buzz" + separator + "fizz" + separator + "22"
			+ separator + "23" + separator + "fizz" + separator + "buzz"
			+ separator + "26" + separator + "fizz" + separator + "28"
			+ separator + "29" + separator + "fizzbuzz" + separator + "31"
			+ separator + "32" + separator + "fizz" + separator + "34"
			+ separator + "buzz" + separator + "fizz" + separator + "37"
			+ separator + "38" + separator + "fizz" + separator + "buzz"
			+ separator + "41" + separator + "fizz" + separator + "43"
			+ separator + "44" + separator + "fizzbuzz" + separator + "46"
			+ separator + "47" + separator + "fizz" + separator + "49"
			+ separator + "buzz" + separator + "fizz" + separator + "52"
			+ separator + "53" + separator + "fizz" + separator + "buzz"
			+ separator + "56" + separator + "fizz" + separator + "58"
			+ separator + "59" + separator + "fizzbuzz" + separator + "61"
			+ separator + "62" + separator + "fizz" + separator + "64"
			+ separator + "buzz" + separator + "fizz" + separator + "67"
			+ separator + "68" + separator + "fizz" + separator + "buzz"
			+ separator + "71" + separator + "fizz" + separator + "73"
			+ separator + "74" + separator + "fizzbuzz" + separator + "76"
			+ separator + "77" + separator + "fizz" + separator + "79"
			+ separator + "buzz" + separator + "fizz" + separator + "82"
			+ separator + "83" + separator + "fizz" + separator + "buzz"
			+ separator + "86" + separator + "fizz" + separator + "88"
			+ separator + "89" + separator + "fizzbuzz" + separator + "91"
			+ separator + "92" + separator + "fizz" + separator + "94"
			+ separator + "buzz" + separator + "fizz" + separator + "97"
			+ separator + "98" + separator + "fizz" + separator + "buzz"
			+ separator;
		Loops.fizbuzz();
		Assert.assertEquals(expected, LoopsTest.outputCapture.toString());
	}

	/**
	 * Test the 99 bottles of beer method.
	 */
	@Test
	public void testNinteyNineBottles() {
		String separator = System.getProperty("line.separator");
		// We don't want to give away the loop solution
		String expected = "99 bottles of beer on the wall, 99 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 99 bottles of beer on the wall."
			+ separator + "98 bottles of beer on the wall, 98 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 98 bottles of beer on the wall."
			+ separator + "97 bottles of beer on the wall, 97 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 97 bottles of beer on the wall."
			+ separator + "96 bottles of beer on the wall, 96 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 96 bottles of beer on the wall."
			+ separator + "95 bottles of beer on the wall, 95 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 95 bottles of beer on the wall."
			+ separator + "94 bottles of beer on the wall, 94 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 94 bottles of beer on the wall."
			+ separator + "93 bottles of beer on the wall, 93 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 93 bottles of beer on the wall."
			+ separator + "92 bottles of beer on the wall, 92 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 92 bottles of beer on the wall."
			+ separator + "91 bottles of beer on the wall, 91 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 91 bottles of beer on the wall."
			+ separator + "90 bottles of beer on the wall, 90 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 90 bottles of beer on the wall."
			+ separator + "89 bottles of beer on the wall, 89 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 89 bottles of beer on the wall."
			+ separator + "88 bottles of beer on the wall, 88 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 88 bottles of beer on the wall."
			+ separator + "87 bottles of beer on the wall, 87 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 87 bottles of beer on the wall."
			+ separator + "86 bottles of beer on the wall, 86 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 86 bottles of beer on the wall."
			+ separator + "85 bottles of beer on the wall, 85 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 85 bottles of beer on the wall."
			+ separator + "84 bottles of beer on the wall, 84 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 84 bottles of beer on the wall."
			+ separator + "83 bottles of beer on the wall, 83 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 83 bottles of beer on the wall."
			+ separator + "82 bottles of beer on the wall, 82 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 82 bottles of beer on the wall."
			+ separator + "81 bottles of beer on the wall, 81 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 81 bottles of beer on the wall."
			+ separator + "80 bottles of beer on the wall, 80 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 80 bottles of beer on the wall."
			+ separator + "79 bottles of beer on the wall, 79 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 79 bottles of beer on the wall."
			+ separator + "78 bottles of beer on the wall, 78 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 78 bottles of beer on the wall."
			+ separator + "77 bottles of beer on the wall, 77 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 77 bottles of beer on the wall."
			+ separator + "76 bottles of beer on the wall, 76 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 76 bottles of beer on the wall."
			+ separator + "75 bottles of beer on the wall, 75 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 75 bottles of beer on the wall."
			+ separator + "74 bottles of beer on the wall, 74 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 74 bottles of beer on the wall."
			+ separator + "73 bottles of beer on the wall, 73 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 73 bottles of beer on the wall."
			+ separator + "72 bottles of beer on the wall, 72 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 72 bottles of beer on the wall."
			+ separator + "71 bottles of beer on the wall, 71 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 71 bottles of beer on the wall."
			+ separator + "70 bottles of beer on the wall, 70 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 70 bottles of beer on the wall."
			+ separator + "69 bottles of beer on the wall, 69 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 69 bottles of beer on the wall."
			+ separator + "68 bottles of beer on the wall, 68 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 68 bottles of beer on the wall."
			+ separator + "67 bottles of beer on the wall, 67 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 67 bottles of beer on the wall."
			+ separator + "66 bottles of beer on the wall, 66 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 66 bottles of beer on the wall."
			+ separator + "65 bottles of beer on the wall, 65 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 65 bottles of beer on the wall."
			+ separator + "64 bottles of beer on the wall, 64 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 64 bottles of beer on the wall."
			+ separator + "63 bottles of beer on the wall, 63 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 63 bottles of beer on the wall."
			+ separator + "62 bottles of beer on the wall, 62 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 62 bottles of beer on the wall."
			+ separator + "61 bottles of beer on the wall, 61 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 61 bottles of beer on the wall."
			+ separator + "60 bottles of beer on the wall, 60 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 60 bottles of beer on the wall."
			+ separator + "59 bottles of beer on the wall, 59 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 59 bottles of beer on the wall."
			+ separator + "58 bottles of beer on the wall, 58 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 58 bottles of beer on the wall."
			+ separator + "57 bottles of beer on the wall, 57 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 57 bottles of beer on the wall."
			+ separator + "56 bottles of beer on the wall, 56 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 56 bottles of beer on the wall."
			+ separator + "55 bottles of beer on the wall, 55 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 55 bottles of beer on the wall."
			+ separator + "54 bottles of beer on the wall, 54 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 54 bottles of beer on the wall."
			+ separator + "53 bottles of beer on the wall, 53 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 53 bottles of beer on the wall."
			+ separator + "52 bottles of beer on the wall, 52 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 52 bottles of beer on the wall."
			+ separator + "51 bottles of beer on the wall, 51 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 51 bottles of beer on the wall."
			+ separator + "50 bottles of beer on the wall, 50 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 50 bottles of beer on the wall."
			+ separator + "49 bottles of beer on the wall, 49 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 49 bottles of beer on the wall."
			+ separator + "48 bottles of beer on the wall, 48 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 48 bottles of beer on the wall."
			+ separator + "47 bottles of beer on the wall, 47 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 47 bottles of beer on the wall."
			+ separator + "46 bottles of beer on the wall, 46 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 46 bottles of beer on the wall."
			+ separator + "45 bottles of beer on the wall, 45 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 45 bottles of beer on the wall."
			+ separator + "44 bottles of beer on the wall, 44 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 44 bottles of beer on the wall."
			+ separator + "43 bottles of beer on the wall, 43 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 43 bottles of beer on the wall."
			+ separator + "42 bottles of beer on the wall, 42 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 42 bottles of beer on the wall."
			+ separator + "41 bottles of beer on the wall, 41 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 41 bottles of beer on the wall."
			+ separator + "40 bottles of beer on the wall, 40 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 40 bottles of beer on the wall."
			+ separator + "39 bottles of beer on the wall, 39 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 39 bottles of beer on the wall."
			+ separator + "38 bottles of beer on the wall, 38 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 38 bottles of beer on the wall."
			+ separator + "37 bottles of beer on the wall, 37 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 37 bottles of beer on the wall."
			+ separator + "36 bottles of beer on the wall, 36 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 36 bottles of beer on the wall."
			+ separator + "35 bottles of beer on the wall, 35 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 35 bottles of beer on the wall."
			+ separator + "34 bottles of beer on the wall, 34 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 34 bottles of beer on the wall."
			+ separator + "33 bottles of beer on the wall, 33 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 33 bottles of beer on the wall."
			+ separator + "32 bottles of beer on the wall, 32 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 32 bottles of beer on the wall."
			+ separator + "31 bottles of beer on the wall, 31 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 31 bottles of beer on the wall."
			+ separator + "30 bottles of beer on the wall, 30 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 30 bottles of beer on the wall."
			+ separator + "29 bottles of beer on the wall, 29 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 29 bottles of beer on the wall."
			+ separator + "28 bottles of beer on the wall, 28 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 28 bottles of beer on the wall."
			+ separator + "27 bottles of beer on the wall, 27 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 27 bottles of beer on the wall."
			+ separator + "26 bottles of beer on the wall, 26 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 26 bottles of beer on the wall."
			+ separator + "25 bottles of beer on the wall, 25 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 25 bottles of beer on the wall."
			+ separator + "24 bottles of beer on the wall, 24 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 24 bottles of beer on the wall."
			+ separator + "23 bottles of beer on the wall, 23 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 23 bottles of beer on the wall."
			+ separator + "22 bottles of beer on the wall, 22 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 22 bottles of beer on the wall."
			+ separator + "21 bottles of beer on the wall, 21 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 21 bottles of beer on the wall."
			+ separator + "20 bottles of beer on the wall, 20 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 20 bottles of beer on the wall."
			+ separator + "19 bottles of beer on the wall, 19 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 19 bottles of beer on the wall."
			+ separator + "18 bottles of beer on the wall, 18 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 18 bottles of beer on the wall."
			+ separator + "17 bottles of beer on the wall, 17 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 17 bottles of beer on the wall."
			+ separator + "16 bottles of beer on the wall, 16 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 16 bottles of beer on the wall."
			+ separator + "15 bottles of beer on the wall, 15 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 15 bottles of beer on the wall."
			+ separator + "14 bottles of beer on the wall, 14 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 14 bottles of beer on the wall."
			+ separator + "13 bottles of beer on the wall, 13 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 13 bottles of beer on the wall."
			+ separator + "12 bottles of beer on the wall, 12 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 12 bottles of beer on the wall."
			+ separator + "11 bottles of beer on the wall, 11 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 11 bottles of beer on the wall."
			+ separator + "10 bottles of beer on the wall, 10 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 10 bottles of beer on the wall."
			+ separator + "9 bottles of beer on the wall, 9 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 9 bottles of beer on the wall."
			+ separator + "8 bottles of beer on the wall, 8 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 8 bottles of beer on the wall."
			+ separator + "7 bottles of beer on the wall, 7 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 7 bottles of beer on the wall."
			+ separator + "6 bottles of beer on the wall, 6 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 6 bottles of beer on the wall."
			+ separator + "5 bottles of beer on the wall, 5 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 5 bottles of beer on the wall."
			+ separator + "4 bottles of beer on the wall, 4 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 4 bottles of beer on the wall."
			+ separator + "3 bottles of beer on the wall, 3 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 3 bottles of beer on the wall."
			+ separator + "2 bottles of beer on the wall, 2 bottles of beer."
			+ separator
			+ "Take one down and pass it around, 2 bottles of beer on the wall."
			+ separator + "1 bottle of beer on the wall, 1 bottle of beer."
			+ separator
			+ "Take one down and pass it around, 1 bottle of beer on the wall."
			+ separator
			+ "No more bottles of beer on the wall, no more bottles of beer."
			+ separator
			+ "Go to the store and buy some more, 99 bottles of beer on the wall."
			+ separator;
		Loops.ninteyNineBottles();
		Assert.assertEquals(expected, LoopsTest.outputCapture.toString());
	}

}
