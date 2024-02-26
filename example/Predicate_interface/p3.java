package Predicate_interface;

import java.util.function.Predicate;

public class p3 {
    public static void main(String[] args) {

        String Subjects[] = {"Telugu","Hindi","English","Maths","Science","Social"};
        int LengthofSubjects = Subjects.length;
        System.out.println(LengthofSubjects+"      Subjects ");

        Predicate <String> predicate = string ->(string.length()<6);
        //System.out.println(predicate.test());

        for(String names : Subjects){
            if(predicate.test(names)){
                System.out.println(names);
            }
        }

    }
}
