package Function_default_interface;

import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
   // Chaning in Function


        Function<Integer,Integer> f1 = i->i*2;
        Function<Integer,Integer> f2 = i->i*2*2;

        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f2.compose(f1).apply(3)); //24

    }
}
