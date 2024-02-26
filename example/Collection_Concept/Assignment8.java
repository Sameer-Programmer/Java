package Collection_Concept;

import java.util.Collections;
import java.util.LinkedList;

public class Assignment8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(" Mango");
        list.add(" Gova");
        list.add(" Apple");
        list.add(" Mango");
        list.add(" Carrot");
        list.add(" Tomato");
        System.out.println(list);

        // Creating Another Linked List and adding above linked list into new Linked List

        LinkedList  s1 = new LinkedList<>();
        s1.add("Maths");
        s1.addAll(list);
        System.out.println(s1);
       // s1.removeAll(list);
      //  System.out.println(s1);
      //  s1.removeAll(s1);
     //   System.out.println(s1);
        Collections.sort(s1);
        System.out.println(s1+              "          Sorted");
        Collections.sort(s1,Collections.reverseOrder());
        System.out.println(s1+              "          reversed");
        Collections.shuffle(s1);
        System.out.println(s1+"                     shuffled");

        s1.addFirst("first");
        s1.addLast("last");
        System.out.println(s1);

        s1.removeFirst();
        System.out.println(s1);
        s1.removeLast();
        System.out.println(s1);


    }
}
