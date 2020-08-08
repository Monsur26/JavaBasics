package datastructurealgorithom.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
    public static void main(String[] args) {
        int[]number1={1,3,4,6};
        int[]number2={2,3,5,6,7,9};

        Set<Integer> num1=new HashSet<Integer>();
        num1.addAll(Arrays.asList(new Integer[]{1,3,4,6}));
        Set<Integer> num2=new HashSet<Integer>();
        num2.addAll(Arrays.asList(new Integer[]{2,3,5,6,7,9}));


        // To Find UnionIntersectionDifference
        Set<Integer> union=new HashSet<>(num1);
        union.addAll(num2);
        System.out.println("UnionIntersectionDifference of two set");
        System.out.println(union);


        // To Find Intersection
        Set<Integer> intersection=new HashSet<>(num1);
        intersection.retainAll(num2);
        System.out.println("Intersection of two set");
        System.out.println(intersection);



        // To Find Symmetric Difference
        Set<Integer> difference=new HashSet<>(num1);
        difference.removeAll(num2);
        System.out.println("Difference of two set");
        System.out.println(difference);



    }
}
