package Practice_Myself;

import java.util.function.Predicate;

public class T_Class1 {
    public static void main(String[] args) {
        Predicate <Integer> predicate = integer -> (integer>10); // Predicate is an Default functional interface
       boolean b =  predicate.test(10);
        System.out.println(b);
         Predicate <String> predicate2 = string -> (string.length()>5);
        boolean b1 =  predicate2.test("Dog");
        System.out.println(b1);

        String a[] = {"Telugu" , "Hindi", " English", "Maths","Science", "Social"};
        Predicate <String> predicate3 = string -> (string.length()>1);

        for(String object :a){
            if(predicate3.test(object)){
                System.out.println(object);
            }

        }



    }
}
