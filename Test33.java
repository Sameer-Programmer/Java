
class Rainbow {
    public double Property = 4.20;
    Rainbow(){
    }
}
class Antman extends Rainbow{
    Antman (){
        this.Property = 30.80;
        double TotalProperty = (this.Property + super.Property);
        System.out.println(TotalProperty);
    }
}

public class Test33 {
    public static void main(String[] args){
        Antman ab = new Antman();
    }
}