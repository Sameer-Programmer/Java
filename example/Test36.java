// agenda to implement casting , Conversion and type Promotion

public class Test36 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        int don = 400;
        System.out.println(a+"          conversion");
        byte d = (byte)don;
        System.out.println(d+"             Casting");
        int g = 1000;
        int sum = d+ g;
        System.out.println(sum+"             Type_Promotion");
    }
}
