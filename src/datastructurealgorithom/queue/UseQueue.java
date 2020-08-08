package datastructurealgorithom.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    // Queue
    //FIFO: First in first out


    public static void main(String[] args) {


        Queue<String> name = new LinkedList<>();
        name.add("Anika");
        name.add("Mahid");
        name.add("Mezba");
        name.add("Milan");
        name.add("Farjana");

        for (String st : name) {
            System.out.println(st);
        }

        System.out.println("After Remove");
        name.remove("Mahid");
        for (String st : name) {
            System.out.println(st);
        }

        System.out.println("*******************************");
        System.out.println(name.element());
        System.out.println("****************  After Element ***************");
        System.out.println(name.poll());
        System.out.println(name.poll());
        System.out.println(name.poll());
        System.out.println("************************");
        System.out.println(name.remove());
        System.out.println(name.poll());









    }


}
