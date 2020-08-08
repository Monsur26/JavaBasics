package controlflow;

public class WhileLoop {



    // While loop is used in situations where we do not know how many times loop
    // needs to be executed before hand.
    // For loop is used where we already know about the number of times loop needs
    // to be executed. Typically for a index used in iteration.

    // While Loop: pre condition check
    // while(condition){ ++ or -- }


    public static void main(String[] args) {

        int number1=60;
        int number2=56;

        // while(){  }

        // Pre condition:
        while (number1>55){
            System.out.println("We are learning While Loop");
            number1--;
        }

        System.out.println("***************************************************");


        // Nested While Loop

        int num1=59;
        int num2=55;
        while (num1>55){
            System.out.println("We are learning Nested While Loop");
            num1--;

            while (num2<60){
                System.out.println("Nested While Loop");
                num2++;
            }


        }




    }
}
