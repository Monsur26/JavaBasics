package datastructurealgorithom.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UseHashSet {


    public static void main(String[] args) {

        Set<String> lastName=new HashSet<>();
        lastName.add("Samad");
        lastName.add("Islam");
        lastName.add("Ahmed");
        lastName.add("William");
        lastName.add("Rahman");
        lastName.add("Rahman");

        System.out.println(lastName);
        lastName.remove("Ahmed");
        System.out.println(lastName);

        System.out.println("************************");






    }










}
