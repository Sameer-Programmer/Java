package Practice_Myself;

public class Test7 {
    public static void main(String[] args) {

        int a = 10;
        Integer i = new Integer(a); //Boxing
        Integer d = a;  // autoboxing
        System.out.println(d);
        System.out.println(i);
        int k = i;

        int f = Integer.valueOf(d); // Unboxing
        System.out.println(f);
        System.out.println(k); // Auto Unboxing




        String s = "123";
        int value = Integer.parseInt(s);
        System.out.println(value);


    }
}
