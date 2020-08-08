package basic;

public class UseAccessModifier {

	// Access Modifier/ Access Specifier: class,variable,method
	// Private: only we can call or use within the class where it is located.
	// Public: we can call or use within the class where it is located and from any
	// other class.
	// Protected: only accessible from all the class of that particular package.

	public String name = "James";
	private static int age = 24;
	protected static String firstName = "Iqra";

	public static void main(String[] args) {
		UseAccessModifier.age = 32;

	}

}
