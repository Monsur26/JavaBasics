package datastructurealgorithom.stack;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {


    public static void main(String[] args) {

        // Stack: LIFO(Last in first out)
        // Pushing element on top of the stack: push()
        // Popping element from the top of the stack: pop()



        Stack<String> stId=new Stack<>();

        int choise=0;
        for (int i=0; i<5;i++){
            stId.push("stID"+i);
        }

        Iterator it=stId.iterator();
        while (it.hasNext()){
            System.out.println(stId.pop());
        }


        Stack<Integer> stNum=new Stack<>();
        stNum.push(1);
        stNum.push(2);
        stNum.push(3);
        stNum.push(4);
        stNum.push(5);

        stackSearch(stNum,4);
        System.out.println(stNum.peek());


    }


    public static void stackSearch(Stack<Integer> stack,int element){

        Integer pos=(Integer) stack.search(element);
        if (pos ==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at position "+pos);
        }
    }



}
