package constructor;

public class UseConstructor {

	// Constructor Name will be same as Class Name.
	// Constructor Has no Return Type
	// Constructors are used to initialize the object.
	// Before creating Parameterize constructor we must have to create Default
	// constructor

	// Deafult/ non Parametarized Constructor
	// Parametarized Constructor

	// AccessModifier className(){ }

	String name;
	String address;
	int mobile;
	double courseFee = 5000.500;

	public UseConstructor() {
		// Default constructor
		// ClassName()
		System.out.println("we are learning constructor");
	}

	public UseConstructor(String NewName) {
		// Parametarized Constructor
		// parameter Signature
		this.name = NewName;
		System.out.println("Name is : " + this.name);
	}

	public UseConstructor(String Newname, String NewAddress) {
		// Parametarized Constructor
		// parameter Signature
		this.name = Newname;
		this.address = NewAddress;
		System.out.println("Name is : " + this.name + " " + "Address is : " + this.address);
	}

	public UseConstructor(String name, String address, int mobile) {
		// Parametarized Constructor
		// parameter Signature
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		System.out.println("Name is : " + name + " " + "Address is : " + address + " " + "Mobile Number " + mobile);
	}

	public static void main(String[] args) {
		// classname object=new constructorOfClass()
		UseConstructor learn = new UseConstructor();

		UseConstructor anika = new UseConstructor("Anika Islam"); // Argument pass inside of the constructor

		UseConstructor hassan = new UseConstructor("Nizam Hassan", "Queens,NY");

		UseConstructor xavier = new UseConstructor("Xavier Sarkar", "Manhattan", 78887433);

	}

	// Create a class name: Pizza
	// Use Default and Parametarized constructor

}
