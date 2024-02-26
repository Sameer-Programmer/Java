package Project_Package_1;

class Fruits {

    int price = 10;
    void m3 (){
        System.out.println("Apples grow more in Kashmir");
    }
    Fruits (){
        System.out.println(" Fruits comes from tress ");
    }
}

class Apple extends Fruits {
    Apple (){
        super();
        System.out.println("Apples are red in Colour ");
        System.out.println(super.price);
        super.m3();
    }
}

public class Test2 {
    public static void main(String[] args) {
        Apple apple = new Apple();
    }
}
