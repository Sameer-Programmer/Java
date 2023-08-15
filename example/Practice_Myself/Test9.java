package Practice_Myself;

import java.util.function.Predicate;

public class Test9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 23, 44, 55, 66, 77, 88, 99, 100};
        int length_of_array = a.length;

        System.out.println(length_of_array + " length_of_array");

        Predicate<Integer> p1 = integer -> integer > 10;
        Predicate<Integer> p2 = integer -> integer % 2 == 0;

        for (int i = 0; i < length_of_array; i++) {
            boolean b1 = p1.and(p2).test(a[i]);
            if (b1) {
                System.out.println(a[i]);
            } else {
                System.out.println(a[i]+"false");
            }
        }
    }
}
