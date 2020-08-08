package method;

public class UseMethod {

	// Method: block of code which runs when it is called. Method is used to perform
	// certain actions and they are known as function
	// Method Type:
	// Return Method without Parameter:
	// Return Method with Parameter:
	// Non Return Method without Parameter:
	// Non Return Method with Parameter:

	// Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
	// }
	// ReturnType/MethodType : Data Type/Class Type
	// MethodName: verb+Noun

	// Method Syntax:
	// AccessModifier ReturnType/MethodType MethodName(){ Method Body }

	// Return Types are: All Data type, void,class and object.

	public static void display() {// method body start point
		// display is method name
		System.out.println("Display is Good");

	}// method body End point

	public void tvDisplay() {
		System.out.println("TV Display is HD");
	}

	// Non Return Type Method without parameter
	public void doSummation() {
		int number1 = 50;
		int number2 = 60;
		int summation = number1 + number2;
		System.out.println("Summation of two number " + summation);
	}

	// Non Return Type Method with parameter: Dynamic method
	public void doSubstraction(int number1, int number2) {
		int substraction = number1 - number2;
		System.out.println("Substraction value is " + substraction);

	}

	public void doSubstraction(int number1, int number2, int number3) {
		int substraction = number1 - number2 - number3;
		System.out.println("Substraction value is " + substraction);
	}

	// Return Method without Parameter:

	public int doMultiply() {
		int number1 = 20;
		int number2 = 30;
		int multiply = number1 * number2;
		System.out.println("Multiplied value is " + multiply);

		return multiply;
	}

	// Return Method with Parameter:/ Dynamic method
	public int doMultiply(int number1, int number2) {
		int num1 = number1;
		int num2 = number2;
		int multiply = num1 * num2;
		System.out.println("Multiplied value is " + multiply);
		return multiply;
	}

	public static void main(String[] args) {
		UseMethod.display(); // call method by class name beause of static kew word

		UseMethod obj = new UseMethod();
		obj.tvDisplay(); // call by object name

		obj.doSummation(); // call by object name

		obj.doSubstraction(200, 80);
		obj.doSubstraction(100, 50);
		obj.doSubstraction(500, 400, 300);

		// Return method
		obj.doMultiply();
		obj.doMultiply(77, 67);

	}

	/**
	 * This method is to Display Data and its works with Parameter
	 * @param num
	 * @param num1
	 */
	public static void display(int num, int num1){

	}

}
