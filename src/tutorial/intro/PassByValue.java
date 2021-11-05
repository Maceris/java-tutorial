package tutorial.intro;

/**
 * Demonstrates the idea of pass by value.
 * 
 * @author Ches Burks
 *
 */
public class PassByValue {

	/**
	 * Reassigns the number that is passed in.
	 * 
	 * @param value A parameter.
	 */
	public void changeValue(int value) {
		// Only changes the local copy of the value
		value = 5;
	}

	/**
	 * Demonstrates numbers being passed by value.
	 */
	public void numberExample() {
		int var = 7;
		// Prints "7"
		System.out.println(var);

		changeValue(var);

		// Still prints "7"
		System.out.println(var);
	}

	/**
	 * Demonstrates how objects are passed by value.
	 * 
	 * @param obj An object, where the value being passed is like the address of
	 *            the object.
	 */
	public void references(SimpleClass obj) {
		/*
		 * This actually does change the variable inside obj.
		 */
		obj.setNumber(2);
		/*
		 * Now we point our variable "obj" to another object, but do not
		 * overwrite the original.
		 */
		obj = new SimpleClass();
		// The original obj's number is still 2 here
		obj.setNumber(17);
	}
}
