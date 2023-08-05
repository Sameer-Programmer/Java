package Self_Java_Practice;

class Encapsulation {
    private  int cash;
    public void getcash(){
        System.out.println("getting cash");
    }
    public int setcash(int cash){
        this.cash = cash;
        return cash; 
    }
}
    
public class Test29 {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.getcash();
        System.out.println(encapsulation.setcash(2000));
    }
}
