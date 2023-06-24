interface Testmatch {
    void m1();
}
abstract class  Floor implements Testmatch {
    public void m1(){
        System.out.println(" from -m1");
        
    }
}
class Dance extends Floor {
    public void m2(){
        System.out.println(" from - m2");
    }
}
public class Test25 {
    public static void main(String[] args) {
        
        Dance d = new Dance();
        d.m1();
       d.m2();
    }
}