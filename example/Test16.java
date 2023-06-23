//Single Level Inheritance 

class yemmiganur {
    public void m1(){
        System.out.println("from class yemmmiganur m1()");
    }
}
class AndhraPradesh extends yemmiganur{
    public int m2(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum  + "      sum from AndhraPradeshm2()");
        return sum;
    }
}

public class Test16 {
    public static void main(String[] args) {
        AndhraPradesh andhraPradesh = new AndhraPradesh();
        andhraPradesh.m1();
        andhraPradesh.m2();
    } 
}
