package basic;

public class UseObject {

	// A class is a blueprint or prototype that defines the variables and the
	// methods (functions) common
	// to all objects of a certain kind.

	// An object is a specimen of a class.
	// Software objects are often used to model real-world objects you find in
	// everyday life.

	public static void main(String[] args) {
		// ClassName objectName= new ConstructorOfClass()
		Computer myComputer = new Computer();

		myComputer.display(); // Call method by objectName

		myComputer.computerBrandName = "HP"; // Call varaible by objectName and Re-Initialize value

		System.out.println("Computer Brand: " + myComputer.computerBrandName);

		// myComputer.computerPrice = 2600.500;

		// int age=40;

		double price = myComputer.computerPrice = 2600.500;

		System.out.println("Computer Price: " + price);

		UseStatic.age = 30;
		System.out.println(UseStatic.age);

		Computer.tvDisplay();

		// Can we create multiple object of same class?

		Computer yourComputer = new Computer();
		String brandName = yourComputer.computerBrandName = "Dell";
		System.out.println(brandName);

		// UseAccessModifier.age = 55;
		UseAccessModifier.firstName = "Sarkar";

	}

}
