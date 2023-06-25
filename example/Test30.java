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
     obj1.setAyaan("Imran");
      System.out.println(obj1.setAyaan("Imran"));

   }
} 

