package datastructurealgorithom.array;

public class Array3D {
    // 3D Array= 1D Array+2D Array

    // DataType[Size][Row][Column]=new DataType[Size][Row][Column]

    static String[][][] pizza = new String[5][3][4];

    public static void main(String[] args) {

        pizza[0][0][0] = "Sl";
        pizza[0][0][1] = "Pizza Type";
        pizza[0][0][2] = "Qty";
        pizza[0][0][3] = "Price";


        pizza[1][1][0] = "1";
        pizza[1][1][1] = "American Pizza";
        pizza[1][1][2] = "10";
        pizza[1][1][3] = "60";

        pizza[2][2][0]="2";
        pizza[2][2][1]="Sicilian Pizza";
        pizza[2][2][2]="12";
        pizza[2][2][3]="70";

        System.out.println(pizza[1][1][1]);


        for (String pizzaInfo[][]:pizza) {

            for (String pizzaIn[]:pizzaInfo) {

                for (String pizz:pizzaIn) {
                    System.out.println(pizz);
                }
            }
        }

        System.out.println(pizza.length);


    }


}
