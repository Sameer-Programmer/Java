package Practice_Myself;

        import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {

        int Values [] = {1,2,3,4,56,7,8,9,22,33,44,66};
        Predicate <Integer> p1 = i -> i> 1;
        Predicate <Integer> p2 = integer -> integer %2 == 0 ;

        for (Integer names:Values) {
            if(p1 .and(p2) .test(names)) {
                System.out.println(names);
            }
        }



    }
}
