
//Agenda to implement in Method -Overiding - Run time Polymorphism
//Parent class reference variable refers to Object of child class

class Apollo {
   public double m1(){
        return 0;
    }
}
class YMG extends Apollo {
    public double m1(){
        return 1000;
    }
}
class AD extends Apollo {
    public double m1(){
        return 4000;
    }
}
class Kurnool extends Apollo {
    public double m1(){
        return 4000;
    }
}

public class Test40 {
    public static void main(String[] args) {
        Apollo ap;
        ap = new YMG();  System.out.println(ap.m1());
        ap = new AD();  System.out.println(ap.m1());
        ap = new Kurnool();  System.out.println(ap.m1());
    }
}
