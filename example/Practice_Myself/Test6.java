package Practice_Myself;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test6 {
    public static void main(String[] args) {
        Predicate <Integer> p1 = integer -> integer >10;
        boolean b1= p1.test(10);
        System.out.println(b1);

        Predicate <Integer> p2 = integer -> integer %2 == 0;
        boolean b2= p2.test(10);
        System.out.println(b2);


        Function < String ,Integer> f1 = s -> s.length();
        int s1 = f1.apply("sameer");
        System.out.println(s1);



    }
}
