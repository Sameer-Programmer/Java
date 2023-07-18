package Collection_Concept;

import java.util.HashSet;

public class Assignment9 {
    public static void main(String[] args) {
        //  HashSet hs = new HashSet();       Default capacity is 16---Load factor 0.75
        //  HashSet hs = new HashSet(100);    Initial capacity is 100
       // HashSet<Integers> hs = new HashSet<Integers>(); // Only Intezers

        HashSet hs = new HashSet(); // Multiple data types
        hs.add(11);
        hs.add(1.4);
        hs.add("Sameer");
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);    // Elements will print in Random Order
        hs.remove(11); // we dont have Index Concept
        System.out.println(hs);
        /// We dont have get method in hashset
        // Here we dont Update the Existing Value

        System.out.println( hs.contains("Sameer"));
        System.out.println( hs.contains(11));
        System.out.println( hs.isEmpty());

        // Lets Use For Loop ----- first take one Object
        for (Object e : hs) {
            System.out.println(e);
        }


        HashSet si = new HashSet();
        si.add(20);
        si.addAll(hs);               // add all method
        System.out.println(si);

        HashSet nh = new HashSet();
        nh.add(1000);
        nh.add(hs);
        System.out.println(nh);    // Added one new Element , complete hashset element in oneMore Hashset-nh
        System.out.println(nh.removeAll(hs));





    }
}
