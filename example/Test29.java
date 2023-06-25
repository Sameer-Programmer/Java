class Encapsulation {
    private  int currency;
    public void getcurrency(){
        System.out.println("getting Currency");
    }
    public int setcurrency(int currency){
        this.currency = currency;
        return currency; 
    }
}
    
public class Test29 {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.getcurrency();
        System.out.println(encapsulation.setcurrency(2000));
    }
}
