//Trying to implement Runtime Polymorphism
//Concept is Parent class Reference variable refers to the Child Class Oject
class A {
    void m1 (){
        System.out.println("Am smart ---A");
    }
}
class B extends  A {
    void m1 (){
        System.out.println("congrats you achived Runtime Polymorphism ");
    }
}

public class Test39 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
