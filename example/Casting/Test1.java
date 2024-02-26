package Casting;

public class Test1 {
    public static void main(String[] args) {


        byte age = 127;
        int S_age = age;  // widening
        System.out.println(S_age);

        int number = 128;
        byte b1 = (byte) number;  // Type Casting
        System.out.println(b1);

    }
}
