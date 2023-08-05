package Self_Java_Practice;

public class Test35 {
    public static void main(String[] args) {
        // wrapper class
        // converting varaible into Object
        int a =10;
        Integer integer = new Integer(10);
       System.out.println(integer+"           Autoboxing");
        // Converting Object into Variale
        int j = integer.valueOf(10);
        System.out.println(j+"             Unboxing");

    }
}
