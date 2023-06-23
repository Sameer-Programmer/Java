//Hierarchial-Inheritance   --- 
class Fly {
    public void m1() {
       System.out.println("from m1+       Fly");
    }
}

class Aeroplane extends Fly {
    public void m2() {
      System.out.println("from m2+     calling Aeroplane");  
    }
}

class Helicofter extends Fly {
    public void m3() {
     System.out.println("from m3+     calling Helicofter");    
    }
}

public class Test18 {
    public static void main(String[] args) {
      Aeroplane aeroplane = new Aeroplane();
       aeroplane.m1();
      aeroplane.m2();
     
      Helicofter helicofter = new Helicofter();
      helicofter.m1();
      helicofter.m3();
        
    }
}
