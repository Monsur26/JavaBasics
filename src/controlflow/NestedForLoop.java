package controlflow;

import java.util.Scanner;

public class NestedForLoop {
    // Nested For Loop


    public static void main(String[] args) {

//        for (int i=0; i<4; i++){ // parent for loop start
//            System.out.println("We are learning Nested for loop");
//
//            for (int j=0; j<2; j++){
//                System.out.println("Nested");
//            }
//
//        } // end


        // User will give the number and it will print as a Row Basis

        // Output
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // Scanner and nested for loop


        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");

        int rowNumber=input.nextInt();


        for (int i=1; i<=rowNumber;i++){



            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();





        }









    }





}
