package Self_Java_Practice;

public class Test34 {
    public static void main(String[] args) {
        // Convertion
        byte b = 20;
        int  c = b;
        System.out.println(c+"          conversion");

        // Casting
        int Boat = 100;
        byte ship = (byte)Boat;
        System.out.println(ship +"        Casting");

        // Type Promotion
        byte bb = 22;
        byte cc =33;
        int sum = bb+cc;
        System.out.println(sum +"               Type Promotion");
    }
}
