package Lambda;

//Normal way of using Interface
interface lmd {
    void m1(); // Abstract method -- No implementation --only Defination
        }
class Lmd1 {
    public void m1(){
        System.out.println("Here the Abstract method implementation is Done ");
    }
}

public class L1 {
    public static void main(String[] args) {
        Lmd1 lmd1 = new Lmd1();
        lmd1.m1();
    }
}
