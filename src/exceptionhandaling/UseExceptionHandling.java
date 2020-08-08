package exceptionhandaling;

import java.io.FileNotFoundException;

public class UseExceptionHandling {

//    ArithmeticException
//    It is thrown when an exceptional condition has occurred in an arithmetic operation.
//            ArrayIndexOutOfBoundsException
//    It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
//    ClassNotFoundException
//    This Exception is raised when we try to access a class whose definition is not found
//            FileNotFoundException
//            This Exception is raised when a file is not accessible or does not open.
//    IOException
//    It is thrown when an input-output operation failed or interrupted
//            InterruptedException
//    It is thrown when a thread is waiting , sleeping , or doing some processing , and it is interrupted.
//    NoSuchFieldException
//    It is thrown when a class does not contain the field (or variable) specified
//            NoSuchMethodException
//    It is thrown when accessing a method which is not found.
//            NullPointerException
//    This exception is raised when referring to the members of a null object. Null represents nothing
//            NumberFormatException
//    This exception is raised when a method could not convert a string into a numeric format.
//    RuntimeException
//    This represents any exception which occurs during runtime.
//    StringIndexOutOfBoundsException
//    It is thrown by String class methods to indicate that an index is either negative than the size of the string


    public static void main(String[] args) throws FileNotFoundException {


        try {
            int num1 = 10;
            int num2 = 2;
            int division = num1 / num2;
            System.out.println(division);

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("This is Arithmetic Exception");
        }


        // Multi Try catch

        try {


        } catch (Exception e) {

            try {


            } catch (Exception e1) {

            }


        }


        System.out.println("****************************************");
        // Multi catch block

        try {

            int num1 = 10;
            int num2 = 0;
            int division = num1 / num2;
            System.out.println(division);

        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e2) {
            System.out.println("Null Point Exception");
        } finally {
            // Finally block always Execute
            int num1 = 10;
            int num2 = 3;
            int division = num1 / num2;
            System.out.println(division);
            System.out.println(" Value will be print");
        }


        // Finally:


    }


}
