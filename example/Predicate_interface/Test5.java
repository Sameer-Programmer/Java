package Predicate_interface;

import java.util.function.Predicate;

public class Test5 {
    public static void main(String[] args) {

        int a [] = {1,2,3,45,6,7,89,0,22,3,3,4,45,5,6,6,7,7,8,8,9,9,9,9,60,99};
        Predicate <Integer> p1 = integer -> integer %2 == 0;
        Predicate <Integer> p2= integer -> integer > 50;

        for (Integer values: a) {
            if(p1.test(values) && p2.test(values)){
                System.out.println(values);
            }
        }


    }
}
// combining of two predicates we can write like this also
// p1and(p2).test(values)
