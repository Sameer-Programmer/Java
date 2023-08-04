package Self_Java_Practice;

//Agenda to implement Self_Java_Practice.Encapsulation
// Explanation ------- 1- First Self_Java_Practice.Encapsulation -achieving by making class or Instance variables Private
// 2. Calling in next class , by the getmethod
//3.setting the cash by setMethod and in the Self_Java_Practice.Test42 class
class ATM {
    private int Money;                //Encapsulated by assigning access_Modifier Private
    public void getMoney(){}          // To access the Private Variable providing getMethod

    public int setMoney(int Money) {   // SetMethod is provided to implement setting cash
      this .Money = Money;
      return Money;
    }
}

public class Test42 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getMoney();
        System.out.println(atm.setMoney(200));
    }
}
