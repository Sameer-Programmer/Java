package Practice_Myself;

import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,0,11,22,33,44,55,66,77,};

        Predicate<Integer> p1 = integer -> integer >1;
        Predicate<Integer> p2 = integer -> integer %2 == 0;

        for(Integer values:a) {
            if(p1.and(p2).test(values)){
                System.out.println(values);
            }
        }



    }


}
