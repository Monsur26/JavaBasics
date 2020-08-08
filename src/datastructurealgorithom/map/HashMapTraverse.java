package datastructurealgorithom.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

    //	Key Points
    //
    //	For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
    //	TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
    //	TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
    //


    public static void main(String[] args) {
        int[] num = {23, 445, 67, 35, 89, 78, 123, 45,35,78,445,78,500};
        printFrequency(num);
    }

    public static void printFrequency(int[] arr) {
        // Wrapper class: Integer
        // Create an empty Hashmap
        HashMap<Integer, Integer> hmap = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {

            Integer c = hmap.get(arr[i]);

            // if this is first occurrence
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            } else {
                hmap.put(arr[i], ++c);
            }
        }
        // Retrieve value
        for (Map.Entry m: hmap.entrySet()) {
            System.out.println("Frequency of "+m.getKey()+" : "+m.getValue());
        }

    }

}
