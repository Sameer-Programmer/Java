package Self_Java_Practice;

class Rainbow {
    public double Property = 4.20;
    Rainbow(){
    }
}
class Antman extends Rainbow{
    Antman (){
        double Property2 = 30.80;
        double TotalProperty = (Property2 + super.Property);
        System.out.println(TotalProperty);
    }
}

public class Test33 {
    public static void main(String[] args){
        Antman ab = new Antman();
    }
}