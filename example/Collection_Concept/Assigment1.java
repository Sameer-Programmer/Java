package Collection_Concept;

import java.util.ArrayList;
import java.util.Collections;

public class Assigment1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("sameer");
        list.add("@");
        list.add("1");
        list.add(1, "Apple");
        list.add("1"); // Duplicates Allowed
        System.out.println(list.size()       +"                       size from 1");
        System.out.println(list +"            from 2");
        Collections.sort(list);
        System.out.println(list+"        collections");
        list.set(1,"Dhoni");
        System.out.println(list+"            from 3");
        list.set(1,"India");
        System.out.println(list+"            from 4"); // Printing
        list.add("welcome"); // After Printing also Insertion Allowed
        System.out.println(list.remove(1)+"            from 5"); // Removing with the help of index
        System.out.println(list+"            from 6");
        list.remove("@");
        System.out.println(list+"            from 7");
        System.out.println(list.contains("welcome"+"            from 8")); // printing boolean statement true or false
        System.out.println(list.get(0)+"            from 9");
        System.out.println(list.isEmpty());       // printing boolean statement true or false
        //  list.clear();              // Clearing the content
        System.out.println(list+"            from 10");      // After clear
        System.out.println(list.isEmpty()+"            from 11");      // printing boolean statement true or false
        String s1=list.toString();
        System.out.println(s1+"           Converted to String successfully  from 12");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list+"             reverse order from 13 ");
       // list.clear(); // to clear elements in a List
        System.out.println(list+"          from14  All cleared ");
        System.out.println(list.isEmpty()+"   Now the Collection is Empty         from 14");


        /*1. for Shuffling
         we have one more method  shuffle - in Collections Class in java
        * Collections.shuffle() */
        Collections.shuffle(list);
        System.out.println(list+"       shuffling done successfully           from 15");

        list.clear(); // to clear elements in a List
        System.out.println(list+"          from16  All cleared ");
        System.out.println(list.isEmpty()+"   Now the Collection is Empty         from 17");


    }
}
