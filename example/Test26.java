interface Wife {
    void m1();
}

interface Hus {
    void m2();
}

class Children implements Wife , Hus {
    @Override
    public void m1() {
        System.out.println("Wife Qualities");
    }

    @Override
    public void m2() {
    System.out.println("Hus Qualities");
    }
}
public class Test26{
    public static void main(String[] args) {
        Children child = new Children();
        child.m1();
        child.m2();
    }
}








