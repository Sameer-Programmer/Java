class Enterprise {
    int a;               //Instance Variable
    public void m1(){
        System.out.println("from m1");
    }
    Enterprise (){             //Constructor
        System.out.println("Enterprise");
    }
}
class Showroom extends Enterprise {
    public void m2(){
       System.out.println(super.a); 
       super.m1();
    }
    
    Showroom (){
         super();
       System.out.println("showroom Construtor");  
       
    }
}

public class Test31 {
    public static void main(String[] args) {
          Showroom showroom = new Showroom();
        showroom.m2();
    }
}
