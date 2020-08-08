package controlflow;

public class UseNestedIfElse {

	public static void main(String[] args) {

		int age = 36;

		if (age >= 18) {
			System.out.println("You are Adult");

			if (age >= 24 && age <= 34) {
				System.out.println("You are eligibale for Marry");
			}
			if (age >= 35 && age > 44) {
				System.out.println("You are too late for Marry");
			}
			if (age >= 45) {
				System.out.println("You are old to marry");
			}

		} else {
			System.out.println("You are not Adult");
		}

	}

}
