package oop.polymorphism.overloading;

public class Calculator {

    // Overloading/ Method overloading:


    public int multiply(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int multiply = num1 * num2;
        System.out.println("Multiplied value is " + multiply);
        return multiply;
    }

    public int multiply(int number1, int number2, int number3) {
        int num1 = number1;
        int num2 = number2;
        int num3=number3;
        int multiply = num1 * num2*num3;
        System.out.println("Multiplied value is " + multiply);
        return multiply;
    }

    public int multiply(int number1, int number2, int number3, int number4) {
        int num1 = number1;
        int num2 = number2;
        int num3=number3;
        int num4=number4;
        int multiply = num1 * num2*num3*num4;
        System.out.println("Multiplied value is " + multiply);
        return multiply;
    }


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.multiply(60,50);
        calculator.multiply(20,30,40);
        calculator.multiply(10,20,30,50);

    }

}
