package datastructurealgorithom.array;

import java.util.ArrayList;

public class UseArrayList {

    // ArrayList: No need to declare Array size/ Dynamic Array



    public static void main(String[] args) {

        ArrayList<String> studentList=new ArrayList<String>();
        // add() to insert value in ArrayList
        studentList.add("Anika");
        studentList.add("Mahid");
        studentList.add("Farjana");
        studentList.add("Mezba");
        studentList.add("Nafis");
        studentList.add("Nafis");


        System.out.println(studentList.get(3));

        studentList.remove(2);

        for (String st: studentList) {
            System.out.println(st);
        }




        // 1. anika
        // 2. mahid
        // 3. Farjana
        // 4. Nafis



    }















}
