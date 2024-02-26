package Self_Java_Practice;

class Bank {
    private int currency;

    public void getcurrency(){
        System.out.println("from getter");
    }
    public int  seta(int currency){
        return currency;
    }
}

public class Test28 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getcurrency();
        System.out.println(b.seta(200));
    }

}
