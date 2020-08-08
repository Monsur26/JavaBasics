package basic;

public class UseNestedClass {

	// Nested class: Child class

	// Parent class:

	public static void main(String[] args) {

		Car.carModel = 2021;
		System.out.println(Car.carModel);

	}

	public static class Car {
		// child class

		static int carModel = 2020;

	}

	public class Car1 {

	}

}
