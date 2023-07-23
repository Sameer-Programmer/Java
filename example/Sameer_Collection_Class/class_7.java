package Sameer_Collection_Class;

import java.util.PriorityQueue;

public class class_7 {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue<>();
        queue.add("sameer");
        queue.add("Imran");
        System.out.println(queue);
        queue.remove();  // removes Head here // Imran Removed
        System.out.println(queue); // printing Sameer which is Left
        queue.poll();
        System.out.println(queue); // Null
        queue.peek();
        System.out.println(queue);       // null
        queue.element();
        System.out.println(queue);    // empty - throws exception
    }
}
