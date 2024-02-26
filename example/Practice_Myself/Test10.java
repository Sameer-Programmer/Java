package Practice_Myself;
class HDFCBANK {
    private  int Currency ;
   public void set(int Currency){
       this.Currency = Currency;
        System.out.println(Currency);
    }
}

public class Test10 {
    public static void main(String[] args) {
        HDFCBANK hdfcbank = new HDFCBANK();
        hdfcbank.set(2000);
    }
}
