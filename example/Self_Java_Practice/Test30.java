package Self_Java_Practice;

class Firstfloor {
    private String Ayaan;

    // calling Ayan through getmethod 
    public void  getAyaan(){
        System.out.println("getting ayyan "); }
        
    public String setAyaan(String Ayaan){
        this.Ayaan = Ayaan;
        return Ayaan;
    }

}

public class Test30 {
   public static void main(String[] args){
    Firstfloor obj1=new Firstfloor();
       obj1.getAyaan();
     obj1.setAyaan("Self_Java_Practice.Imran");
      System.out.println(obj1.setAyaan("Self_Java_Practice.Imran"));

   }
} 

