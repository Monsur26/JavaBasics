package basic;

public class UseVariable {

	/**
	 * Variable: Local variable Global variable/ Instance variable/ Reference
	 * variable Class Variable: static keyword is used
	 */

	// Variable: Varaible is a container which can hold value.

	// int integer is a Data Type and x is the variable name and 5 is the value

	// to close any statement in java we need use semi-colon ;

	// DataType varaibelName= value;

	// Global variable
	int x = 5; // Declare and Initialize value
	int y; // Declare varaible

	// Declare
	static int a;
	int b;
	int c;

	// Declare and Initialize
	int p = 46;
	int t = 12;

	// Variable Naming Convention:
	// Variable Name must have to meaningful
	int number = 90;

	String firstName = "James";

	// Constant varaible
	String MAX_WIDTH = "42";
	final String MAX_WIDTH_FOR_FABRIC = "36";

	// For Windows/ Mac: Ctrl+space button: Code suggestion will Appear

	public static void main(String args[]) { // method body start point
		// Driver method/ Main method
		// Method body

		// Local Variable:
		int s = 52;
		a = 7;
		int age = 24;
		int jamesAge = 30;

		System.out.println("We are learing varaible from Java");
		System.out.println(s);
		System.out.println(a);

		// Concatenation: Adding some string with Variable by +

		System.out.println("My Age is " + age);
		System.out.println("James Age is " + jamesAge);

	} // Method body End point

}
