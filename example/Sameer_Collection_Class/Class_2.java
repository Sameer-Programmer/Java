package Sameer_Collection_Class;

import java.util.HashSet;

public class Class_2 {
    public static void main(String[] args) {
        HashSet ap = new HashSet();
        ap.add("apple");
        ap.add("Mango");
        ap.add("Banana");
        System.out.println(ap);

        HashSet ts = new HashSet();
        ts.add("apple");
        ts.add("Mango");
        ts.add("sugar");
        System.out.println(ts);

      //  Unique Elements
        ap.addAll(ts);
        System.out.println(ap);     // mango , apple , sugar, Banana

        // Commom Elements in ap and ts
        //Now elements in ap apple , Mango , sugar, Banana
        // Elements in ts = apple , Mango ,Sugar

       ap.retainAll(ts);
       System.out.println(ap+"        Commom Elements");

       ap.containsAll(ts);
        System.out.println(ap.containsAll(ts));

        ap.removeAll(ts);
        System.out.println(ap);

        HashSet in  = new HashSet();
        in.add("karnataka");
        in.add("Kerala");
        in.add("Andhra Pradesh");
        in.add("Telangana");
        System.out.println(in);

        HashSet ch  = new HashSet();
        ch.add("beijing");
        ch.addAll(in);
        System.out.println(ch);

        // Difference
        ch.removeAll(in);
        System.out.println(ch);
    }
}
