package operators;

public class EqualityAndRelationalOperator {

	// == Equal to
	// != not Equal
	// > Grater than
	// >= Grater than Equal
	// < Less than
	// <= Less than Equal

	public static void main(String[] args) {

		int num1 = 34;
		int num2 = 44;

		if (num1 == 34) {
			System.out.println("num1 is 34");
		}

		if (num1 != 34) {
			System.out.println("num1 is not equal 34");
		}

		if (num1 > 34) {
			System.out.println("num1 is grater then 34");
		}

		if (num1 >= 34) {
			System.out.println("num1 is grater then 34 equal");
		}

		if (num1 < 34) {
			System.out.println("num1 is less then 34");
		}

		if (num1 <= 34) {
			System.out.println("num1 is less then 34 equal");
		}

	}

}
