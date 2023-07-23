package Sameer_Collection_Class;

import java.util.PriorityQueue;
import java.util.Queue;

public class Class6 {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue<>();
        queue.add("sameer");
        queue.add("Imran");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.removeAll(queue);
        System.out.println(queue); // Empty
        System.out.println(queue.element()); // Exception
       // System.out.println(queue.peek()); //null


    }
}
