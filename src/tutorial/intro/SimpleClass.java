package tutorial.intro;

/**
 * A simple class.
 *
 * @author Ches Burks
 *
 */
public class SimpleClass {

	/**
	 * A number that is stored in the object, named "number". Each object has
	 * their own copy of this.
	 */
	private int number;

	/**
	 * A constructor, used to set up when we create new objects from this class.
	 */
	public SimpleClass() {
		// Assigns a value to the variable named "number"
		this.number = 4;
	}

	/**
	 * A method that returns an integer, which takes no inputs.
	 *
	 * @return The number that we have stored in this object.
	 */
	public int getNumber() {
		/*
		 * Gets the value of the "number" variable and returns it when this
		 * method is called.
		 */
		return this.number;
	}

	/**
	 * A method that takes in an integer number, and does not return any values.
	 * We can use a method like this to change values stored in the object.
	 *
	 * @param newNumber The new number that we are passing in.
	 */
	public void setNumber(int newNumber) {
		// Sets the "number" variable to the number that is passed in.
		this.number = newNumber;
	}
}
