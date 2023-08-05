package Self_Java_Practice;

public class Test23 {
    int a =10;
    int b = 30;
    Test23 (){
        this.a = 23;
        this.b = 24;
        int sum = a+b;
        System.out.println(sum +"             from constructor ");
        }
        public static void main(String[] args) {
            Test23 test23 = new Test23();
    }
}

