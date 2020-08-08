package datastructurealgorithom.array;

public class UseArray {

    //Array:
    // Array is a kind of variable which hold multiple value
    // Array Index start from Zero

    // Single Dimensional Array []
    // 2D Array
    // 3D Array


    static String name="Tanjina"; // variable declare and Initialization

    // Array:
    // Index number: call by index number and index number start with 0
    static String[] stName={"Marufa","Anika","Mahid","Shamima"};

    static String adminName[]={"jack","james","william","salah"};


    // Array Declaration
    static String[] stAddress=new String[6];

    // Initialization is not possible if you declare earlier
    //stAddress[0]="Queens,NY";



    public static void main(String[] args) {

        System.out.println(name); // variable


        System.out.println(stName[1]); // Array
        System.out.println(stName[2]); // Array
        System.out.println(stName[3]); // Array

        stAddress[0]="Queens,NY";
        stAddress[1]="Jamaica,NY";
        stAddress[2]="Bronx,NY";
        stAddress[3]="Manhattan,NY";
        stAddress[4]="Yonkers,NY";
        stAddress[5]="Brooklyn,NY";

        System.out.println(stAddress[3]);
        System.out.println(stAddress.length);

        System.out.println("********************Using For Loop*********************************");

        // Retrieve Data from a Array using For Loop
        for (int i=0; i<stAddress.length; i++){
            System.out.println(stAddress[i]);

        }
        System.out.println("******************Using For Each loop *****************************");
        // Retrieve Data from a Array using For Each Loop
//            for(DataType varaiableName:ArrayName){
//                System.out.println(varaiableName);
//            }


        for (String address:stAddress) {
            System.out.println(address);
        }


        System.out.println("******************Array out of Bound Exception *****************************");

        try{
            System.out.println(stAddress[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of Bound Exception");
        }

        System.out.println(stName[1]+" and "+stName[2]+" are Good Friend");



        int [] numbers={1,2,3,4,5};
        System.out.println(numbers[1]);

        for (int num:numbers) {
            System.out.print(num);
        }




    }














}
