package controlflow;

public class UseIfElse {

	public static void main(String[] args) {

		// if(condition){ }
		// if condition is true then it will execute if block and
		// if condition is false it will execute else block

		int age = 17;

		if (age > 18) {
			System.out.println("You are Adult");
		} else {
			System.out.println("You are not Adult");
		}

		double score = 85.50;

		if (score >= 80) {
			System.out.println("You did Excellent");
		} else {
			System.out.println("Your result is not Excellent");
		}

	}

}
