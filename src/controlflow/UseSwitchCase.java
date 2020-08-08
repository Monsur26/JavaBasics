package controlflow;

public class UseSwitchCase {

	public static void main(String[] args) {

		int foodSeries = 5;
		String myFood;

		switch (foodSeries) {
		case 1:
			myFood = "Pizza";
			break;
		case 2:
			myFood = "Coffee";
			break;
		case 3:
			myFood = "Donut";
			break;
		case 4:
			myFood = "creamcheese";
			break;
		default:
			myFood = "Invalid Item";
			break;

		}
		System.out.println("My Food Item is " + myFood);

	}

}
