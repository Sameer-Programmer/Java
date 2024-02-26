package Self_Java_Practice;

class ISV {
    double Property = 4.20;
}

class Ak extends ISV {
    public void m1(double Property){

        System.out.println(Property +super.Property+"   TOTAL AK Property            ");
    }
}

class MBD extends  Ak {

}

public class Test43 {
    public static void main(String[] args) {
       MBD mb = new MBD();
       mb.m1(30.80);
    }
}
