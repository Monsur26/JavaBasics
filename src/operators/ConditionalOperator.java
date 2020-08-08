package operators;

public class ConditionalOperator {

	// && Conditional AND: all condition must have to be true
	// || Conditional OR: if one codition is true then block of code will execute

	public static void main(String[] args) {

		int number1 = 75;
		int number2 = 65;

		// == Equal operator

		if (number1 == 55 && number2 == 65) {
			System.out.println("Number1 is 55 and Number2 is 65");

		}

		if (number1 == 55 || number2 == 65) {
			System.out.println("Number1 is 55 and Number2 is 65");

		}

	}

}
