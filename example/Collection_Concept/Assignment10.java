package Collection_Concept;

import java.util.HashSet;

public class Assignment10 {
    public static void main(String[] args) {
        HashSet<Integer> ev = new HashSet<>();
        ev.add(2);
        ev.add(4);
        ev.add(6);
        ev.add(8);
        ev.add(10);
        System.out.println(ev);

        HashSet<Integer> odd = new HashSet<>();
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        odd.add(11);
        System.out.println(odd);
        odd.addAll(ev);
        System.out.println(odd);
        odd.removeAll(ev);
        System.out.println(odd);

    }
}
