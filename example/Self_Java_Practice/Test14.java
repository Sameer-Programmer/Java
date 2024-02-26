package Self_Java_Practice;

public class Test14 {

    public void m1(){
        // Local Variable inside the Method
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Test14 test14 = new Test14();
        test14.m1();
    }
}
