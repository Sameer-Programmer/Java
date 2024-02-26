package Sameer_Collection_Class;

import java.util.ArrayList;
import java.util.HashSet;
// Convert Hashset into ArrayList
public class Class3 {
    public static void main(String[] args) {
        HashSet ap = new HashSet();
        ap.add("Vizag");
        ap.add(26);
        System.out.println(ap);
// Converting Hashset into ArrayList
        ArrayList list = new ArrayList<>();
        list.addAll(ap);
        System.out.println(list+"      Converted Hashset into ArrayList                 ");
        list.add("Vizag");
        System.out.println(list+"      Duplicates allowed in to  ArrayList                 ");
// Convert  ArrayList into  Hashset
        HashSet hs = new HashSet<>();
        hs.addAll(list);
        System.out.println(hs+"        Convert  ArrayList into  Hashset");
    }
}
