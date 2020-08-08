package basic;

import java.util.Scanner;

public class UseScanner {

	// Scanner is a class from JDK which take input from user

	public static void main(String[] args) {

		// className objectName= new constructorOFClass();

		// Scanner object created to take input from user
		Scanner input = new Scanner(System.in);
		// Print Enter your name
		System.out.println("Enter your Name");
		// take String input from user
		String name = input.nextLine();
		// Display the name
		System.out.println("My Name is " + name);

		System.out.println("Enter Student ID");
		int id = input.nextInt();
		System.out.println("Student ID is " + id);

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your Address");
		String address = myScanner.nextLine();
		System.out.println("My Address :" + address);

		// close scanner
		input.close();
		myScanner.close();

	}

}
