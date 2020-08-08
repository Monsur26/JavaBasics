package controlflow;

public class UseIfElseIf {

	public static void main(String[] args) {

		double score = 60.00;

		if (score >= 90) {
			System.out.println("Your Grade is A+");
		} else if (score >= 80) {
			System.out.println("Your Grade is A");
		} else if (score >= 70) {
			System.out.println("Your Grade is A-");
		} else if (score >= 60) {
			System.out.println("Your Grade is B");
		} else if (score >= 50) {
			System.out.println("Your Grade is C");
		} else if (score >= 40) {
			System.out.println("Your Grade is F");
		} else {
			System.out.println("Your Grade is too Poor");
		}

	}

}
