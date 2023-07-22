package Sameer_Collection_Class;

import java.util.HashSet;

public class Class1 {
    public static void main(String[] args) {
        HashSet ap = new HashSet();
        ap.add("Vizag");
        ap.add(26);
        System.out.println(ap);
        System.out.println(ap.isEmpty());
        System.out.println(ap.contains("Vizag"));
        System.out.println(ap.size());



        HashSet ts = new HashSet();
        ts.add("Hyderabad");
        ts.add(33);
        System.out.println(ts);

        HashSet in = new HashSet();
        in.addAll(ap);
        in.addAll(ts);
        System.out.println(in);

        // Difference between ap and ts
        in.removeAll(ap);
        System.out.println(in);
        in.removeAll(in);
        System.out.println(in);

    }
}
