package Practice_Myself;
// Abstraction - Super class - do not produce Objects - Sub class Will produce Objects

abstract class NaSameer {
    abstract void  m1 ();
    void m2(){
        System.out.println("walking");
    }

}
class BTImran extends NaSameer{
void m1(){
    System.out.println("Run");
}
}

public class Test11 {
    public static void main(String[] args) {
        BTImran btImran = new BTImran();
        btImran.m1();
        btImran.m2();
    }
}
