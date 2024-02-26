package Predicate_interface;

import java.util.function.Predicate;

public class p2 {
    public static void main(String[] args) {
        Predicate <String> predicate = string ->(string.length()<10);

        String a[] = {"john", "Lion","Tiger", "Elephant"};
        for (String forloopvariable : a){
          //  if(predicate.test(forloopvariable)){
//                System.out.println(forloopvariable);
//            }
            //or
            if(forloopvariable.length()<10){
                System.out.println(forloopvariable);
            }

        }
        // Note : To check single condition we may go with if forloopvariable.length()<10)
        // for Multiple Condition we prefer predicate.test(forloopvariable)
    }
}
