package Practice_Myself;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test8 {
    public static <integer> void main(String[] args) {
        Predicate<Integer> p1 = integer -> integer>10;
        boolean b = p1.test(10);
        System.out.println(b);

        Function<Integer, Boolean>f1 = i -> (i % 2) == 0;
        boolean n1 = f1.apply(11);
        System.out.println(n1);

    }
}
