package Self_Java_Practice;

public class Test15 {
    int a =10;
    int b = 20;
    public void m1(){
        int a = 30;
        int b= 40;
        int sub = a-b;
        System.out.println(sub +"        from m1()"  );
    }
    static int z= 23;

    static {
        int a = 11;
        int b = 22;
        System.out.println(a+b +"           from static ");
    }
    public int m2(){
        int a = 9;
        int b = 7;
        int sum = a+b;
        System.out.println(sum +"         from returnm2()");
        return sum;
    }
    public static void m3(){
        int a =11;
        int b = 222;
        int sum = a*b;
        System.out.println(sum + "         from m3()");
    }
    public static int  m4(){
        int a =0;
        int b = 90;
        int sum = a*b;
        System.out.println(sum + "         from m3()");
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(z +"         from static int z");
        Test15.m3();          // static method can be called through ClassName or Referance Variable
        Test15.m4();
        Test15 test15 = new Test15();
        test15.m1();
        test15.m2();
        int instancea = test15.a;
        int instanceb = test15.b;
        System.out.println(instancea);
        System.out.println(instanceb);
        System.out.println(instancea + instanceb);  // Doing the Numerical Operation of Intezers
        test15.m3(); // static method can be called through ClassName or Referance Variable
    }
}
/* ==================================
1.instance variable or class Variable or Non-static variable
2. Local Variable
3.static variable -- variable name should be unique so that JVM won't confuse
4.static method with Void and Returntype
5.non -static method  with  Void and Returntype
6.static block
===============================
 */