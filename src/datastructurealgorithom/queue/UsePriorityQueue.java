package datastructurealgorithom.queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {


    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);

        // top element from Priority Queue: peek method only peek value from Queue
        System.out.println(pq.peek());
        for (int num:pq) {
            System.out.println(num);
        }

        System.out.println("Using Pool method ");
        // pool method do peek and remove
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

//        for (int num:pq) {
//            System.out.println(num);
//        }





    }

}
