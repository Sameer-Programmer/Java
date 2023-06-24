class MethodOverLoading {
    public static void name() {
        System.out.println("name");
    }
    public static  String  name(String s) {
        return s;
    }
    public static int name(int age){
        return age;
    }
    public static int name(int age , int height){
        return height;
    }

}
public class Test27 {
    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        mo.name();
        mo.name("sameer");
        System.out.println( mo.name("sameer"));
        mo.name(22,5);
        System.out.println( mo.name(22,5));
        mo.name(27);
        System.out.println(mo.name(27));

    }
}
