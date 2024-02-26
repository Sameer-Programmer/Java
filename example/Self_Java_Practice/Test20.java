package Self_Java_Practice;

interface DAD {
    void m1();  // Abstract method
}
interface Mom extends DAD{
    void m2();
}

class Child2 implements Mom {
    public void m1() {
        System.out.println("method from Self_Java_Practice.DAD");
    }
    public void m2() {
         System.out.println("method from Self_Java_Practice.Mom");
    }

}

public class Test20 {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.m1();
        child2.m2();
    }
    
}
