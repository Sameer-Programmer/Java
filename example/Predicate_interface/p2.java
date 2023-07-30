package Predicate_interface;

import java.util.function.Predicate;

public class p2 {
    public static void main(String[] args) {
        Predicate <Integer> predicate = i -> (i>10);
        System.out.println(predicate.test(1));

        Predicate <String> stringPredicate = s -> (s.length()>10);
        System.out.println(stringPredicate.test("Lion"));
    }
}
