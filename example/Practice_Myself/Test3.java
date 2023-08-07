package Practice_Myself;

import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
        Function <Integer , Integer> f1 = i->i*i;
      int n1=   f1.apply(2);
        System.out.println(n1);


        Function <String , Integer > f2 = s -> s.length();
        String input = " Sameer_Java_programmer";
        System.out.println(input);
        System.out.println(f2.apply(input));

    }
}
