package Concept_Consumer_Default_Functional_Interface;

import java.util.function.Consumer;
/*
* Consumer is a Default Functional interface
* It holds single parameter
* It does not return any value
* Method is accept()
* It will consume the Data given by the User
* */



public class Test1 {
    public static void main(String[] args) {
        Consumer <String> c1 = s-> System.out.println(s);
        c1.accept("Sameer");

        Consumer <Integer> c2 = i-> System.out.println(i);
        c2.accept(2);
    }
}
