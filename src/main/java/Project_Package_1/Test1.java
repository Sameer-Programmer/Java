package Project_Package_1;

class A {

     static int x = 10;
   public static  void m1() {
        System.out.println("from method m1-class A");
    }
}

public class Test1  extends  A {
    public static  void main(String[] args) {
      m1();
        System.out.println(x);


    }
}
