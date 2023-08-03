package Practice_Myself;

import java.util.function.Predicate;

public class PCTst1 {
    public static void main(String[] args) {

        String a[] = { "Dog","Cat","Lion", "World"};
        Predicate <String > predicate = str -> (str.length()==3);
        for (String names : a) {
            if (predicate.test(names)) {
                System.out.println(names);
            }
        }

    }
}
