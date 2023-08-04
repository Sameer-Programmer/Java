package Predicate_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Boys{
    String name, Gender;
    int age ;

    Boys(String name, int age, String Gender){
        this.name = name;
        this.Gender = Gender;
        this.age = age;
    }
}
public class T_Class2 {
    public static void main(String[] args) {

        Predicate <Boys> predicate4 = e->(e.name.length() <5 && e.Gender.length() <5);


        ArrayList list = new ArrayList<>();
        list.add(new Boys("Prakash",24,"Male"));
        list.add(new Boys("Sreyas",22,"Male"));
        list.add(new Boys("Siddu",21,"Male"));


        for (Boys e : list) {
            if (predicate4.test(e)) {
                System.out.println(e.name + "   " + e.Gender);
            }
        }


    }
}
