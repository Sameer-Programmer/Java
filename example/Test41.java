abstract class HumanBeing {
    abstract void sympton ();
}
class Sameer extends HumanBeing {
    public void sympton (){
        System.out.println(" i am  feeling Hungry ");
    }
}
class Imran extends HumanBeing {
    public void sympton (){
        System.out.println(" I am Healthy by the Gods Grace ");
    }
}
public class Test41 {
    public static void main(String[] args) {
       Sameer sameer = new Sameer();
       sameer.sympton();

       Imran imran = new Imran();
       imran.sympton();


    }
}
