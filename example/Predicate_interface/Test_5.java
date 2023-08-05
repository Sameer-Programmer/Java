package Predicate_interface;

import java.util.function.Function;

public class Test_5 {
    public static void main(String[] args) {
        Function<Integer , Integer> function = integer -> (integer +1);
        System.out.println(function.apply(10));

        Function<String , Integer > function2 = string -> (string.length());
        String input = "Welcome_to_my_World";
        System.out.println(input);
        System.out.println(function2.apply(input));

    }
}
/*Concept
1. Function is a Default interface contains two one argument and one Return type
2. Method is apply(0)
3. It will return a retype of Single value
4. Here in the Above Example --- String refers to Argument - string ->(string.length());
given input = "Welcome_to_my_World"
and Integer refers to return type - By given Condition to the argument
 */
