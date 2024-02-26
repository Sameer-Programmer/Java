package Predicate_interface;

import java.util.function.Predicate;
// Predicate is an functional interface - single abstract method
// purpose - To check the conditional Statements
// Predicate--------Single abstract methods --------return boolean value --
// have single arguement - default method is test()
public class p1 {
    public static void main(String[] args) {
        Predicate <Integer> p = (i)->(i>10);
        //Predicate _ datatype reference variable = single argument -- Lamda Expression -- Condition
        System.out.println(p.test(20));
        System.out.println(p.test(2));
        Predicate <String> pr = (str)->(str.length()>10);
        System.out.println(pr.test("sameeeeeeeeeee"));

    }
}
