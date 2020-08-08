package datastructurealgorithom.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseList {


    // ArrayList vs LinkedList


    public static void main(String[] args) {
        // List type of Array using ArrayList
        List<String> fruitsList=new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Papaya");
        fruitsList.add("Mango");
        fruitsList.add("Lichi");

        System.out.println(fruitsList.get(2));
        // Retrieve Data from a ArrayList
        for (String st:fruitsList) {
            System.out.println(st);
        }


        // List type of Array using LinkedList
        List<String> stList=new LinkedList<>();

        stList.add("Anika");
        stList.add("Mahid");
        stList.add("Farjana");
        stList.add("Mezba");
        stList.add("Nafis");
        stList.add("Nafis");

        System.out.println(stList.get(3));
        // Retrive Data from LinkList
        for (String st:stList) {
            System.out.println(st);
        }



        UseList.displayPizzaList();



    }



    static List<String> pizzaList=new ArrayList<String>();


    public static void displayPizzaList(){

        pizzaList.add("American Pizza");
        pizzaList.add("Italian Pizza");
        pizzaList.add("Sicilian Pizza");
        pizzaList.add("Mexican Pizza");

        for (String st:pizzaList) {
            System.out.println(st);
        }



    }





















}
