package tutorial.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Test the MyArrayList class.
 *
 */
public class MyArrayListTest {

	/**
	 * A list that is set up fresh for each test.
	 */
	private List<String> list;
	private Random rand = new Random();

	/**
	 * Return a random string to help tests.
	 *
	 * @return A random string.
	 */
	private String getRandomString() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Set up a fresh array list before each test case.
	 *
	 * @throws Exception If something goes wrong.
	 */
	@Before
	public void setUpBeforeTest() throws Exception {
		this.list = new MyArrayList();
	}

	/**
	 * Test adding at a specific location.
	 */
	@Test
	public void testAddIntString() {
		// boundary conditions
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.add(-1, "Invalid"));
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.add(1, "Invalid"));

		String[] entries = new String[10];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			this.list.add(0, entries[i]);
			Assert.assertEquals(entries[0], this.list.get(i));
		}

		// They should now be in reverse order
		for (int i = 0; i < entries.length; ++i) {
			Assert.assertEquals(entries[i],
				this.list.get(entries.length - 1 - i));
		}
	}

	/**
	 * Test adding strings and reading them back.
	 */
	@Test
	public void testAddString() {
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
			Assert.assertEquals(entries[i], this.list.get(i));
		}

		// check again that the original strings are still good
		for (int i = 0; i < entries.length; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i));
		}
	}

	/**
	 * Test that clearing the array actually does clear it.
	 */
	@Test
	public void testClear() {
		// try while empty
		this.list.clear();

		for (int i = 0; i < 1000; ++i) {
			Assert.assertTrue(this.list.add(this.getRandomString()));
		}

		this.list.clear();
		Assert.assertEquals(0, this.list.size());
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.get(0));
	}

	/**
	 * Test that the contains method works.
	 */
	@Test
	public void testContains() {
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		for (String s : entries) {
			Assert.assertTrue(this.list.contains(s));
		}

		Assert.assertFalse(this.list.contains(null));
		Assert.assertFalse(this.list.contains("Not in List"));
		this.list.clear();
		for (String s : entries) {
			Assert.assertFalse(this.list.contains(s));
		}
	}

	/**
	 * Test edge cases for get.
	 *
	 * @see #testAddString()
	 */
	@Test
	public void testGet() {
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.get(0));
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.get(-1));
	}

	/**
	 * Test the index of method.
	 */
	@Test
	public void testIndexOf() {
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		for (int i = 0; i < entries.length; ++i) {
			Assert.assertEquals(i, this.list.indexOf(entries[i]));
		}

		// edge cases
		Assert.assertEquals(-1, this.list.indexOf(null));
		Assert.assertEquals(-1, this.list.indexOf("Not in the list"));

		// Handle duplicates
		String duplicate = "Duplicate string";
		this.list.add(2, duplicate);
		this.list.add(17, duplicate);
		Assert.assertEquals(2, this.list.indexOf(duplicate));
		this.list.add(50, duplicate);
		Assert.assertEquals(2, this.list.indexOf(duplicate));
	}

	/**
	 * Tests that the list correctly reports if it is empty or not.
	 */
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(this.list.isEmpty());
		Assert.assertTrue(this.list.add(this.getRandomString()));
		Assert.assertFalse(this.list.isEmpty());
		this.list.remove(0);
		Assert.assertTrue(this.list.isEmpty());

		Assert.assertTrue(this.list.add(this.getRandomString()));
		Assert.assertFalse(this.list.isEmpty());
		this.list.clear();
		Assert.assertTrue(this.list.isEmpty());
	}

	/**
	 * Test the method for finding the last index of an element.
	 */
	@Test
	public void testLastIndexOf() {
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		// edge cases
		Assert.assertEquals(-1, this.list.lastIndexOf(null));
		Assert.assertEquals(-1, this.list.lastIndexOf("Not in the list"));

		// Duplicate strings
		String duplicate = "Duplicate string";
		this.list.add(2, duplicate);
		this.list.add(17, duplicate);
		Assert.assertEquals(17, this.list.lastIndexOf(duplicate));
		this.list.add(50, duplicate);
		Assert.assertEquals(50, this.list.lastIndexOf(duplicate));
	}

	/**
	 * Check that removing from a given index works correctly.
	 */
	@Test
	public void testRemoveInt() {
		// error cases
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.remove(-1));
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.remove(0));

		// setup
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		Assert.assertEquals(entries.length, this.list.size());
		String removed = this.list.remove(0);
		// Check the old element is returned
		Assert.assertEquals(entries[0], removed);
		// Check that the length is updated
		Assert.assertEquals(entries.length - 1, this.list.size());

		// Check elements are shifted
		for (int i = 1; i < entries.length; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 1));
		}

		// check shifted elements when removing from the middle
		this.list.remove(20);
		for (int i = 1; i <= 20; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 1));
		}
		for (int i = 22; i < entries.length; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 2));
		}

		// check when removing from the end
		this.list.remove(this.list.size() - 1);
		for (int i = 1; i <= 20; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 1));
		}
		for (int i = 22; i < entries.length - 1; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 2));
		}

	}

	/**
	 * Test that removing an object reference works.
	 */
	@Test
	public void testRemoveObject() {
		// error cases
		Assert.assertFalse(this.list.remove(null));
		Assert.assertFalse(this.list.remove("Not in List"));

		// setup
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		Assert.assertEquals(entries.length, this.list.size());
		Assert.assertTrue(this.list.remove(entries[0]));
		// Check the old element is returned
		Assert.assertFalse(this.list.contains(entries[0]));
		// Check that the length is updated
		Assert.assertEquals(entries.length - 1, this.list.size());

		// Check elements are shifted
		for (int i = 1; i < entries.length; ++i) {
			Assert.assertEquals(entries[i], this.list.get(i - 1));
		}

		String newInsert = this.getRandomString();

		this.list.add(this.rand.nextInt(this.list.size()), newInsert);
		Assert.assertTrue(this.list.contains(newInsert));
		this.list.remove(newInsert);
		Assert.assertFalse(this.list.contains(newInsert));
	}

	/**
	 * Test the set method.
	 */
	@Test
	public void testSet() {
		// error cases
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.set(-1, "Invalid"));
		Assert.assertThrows(IndexOutOfBoundsException.class,
			() -> this.list.set(0, "Invalid"));

		// setup
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}

		// try some replacements
		for (int i = 0; i < 10; ++i) {
			int index = this.rand.nextInt(this.list.size());
			String newString = this.getRandomString();
			String replaced = this.list.set(index, newString);
			// check that we return the old string
			Assert.assertEquals(entries[index], replaced);
			// check that we have actually set the new string
			Assert.assertEquals(newString, this.list.get(index));
			// update our list in case we get the same index again
			entries[index] = newString;

			Assert.assertTrue(this.list.add(this.getRandomString()));
		}

	}

	/**
	 * Test that the size is accurately reflected.
	 */
	@Test
	public void testSize() {
		int expectedSize = 0;
		Assert.assertEquals(expectedSize, this.list.size());

		// Size after adding
		for (int i = 0; i < 100; ++i) {
			Assert.assertTrue(this.list.add(this.getRandomString()));
			++expectedSize;
			Assert.assertEquals(expectedSize, this.list.size());
		}

		// size after removing
		for (int i = 0; i < 10; ++i) {
			this.list.remove(this.rand.nextInt(this.list.size()));
			--expectedSize;
			Assert.assertEquals(expectedSize, this.list.size());
		}

		// size after clearing
		this.list.clear();
		Assert.assertEquals(0, this.list.size());
	}

	/**
	 * Test converting to an array.
	 */
	@Test
	public void testToArray() {
		// when empty
		Object[] empty = this.list.toArray();
		Assert.assertNotNull(empty);
		Assert.assertEquals(0, empty.length);

		// correct conversion
		String[] entries = new String[1000];
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = this.getRandomString();
			Assert.assertTrue(this.list.add(entries[i]));
		}
		Object[] resultArray = this.list.toArray();
		Assert.assertArrayEquals(entries, resultArray);

		// safe array
		resultArray[0] = "Different";
		Assert.assertNotEquals(resultArray[0], this.list.get(0));
	}

}
