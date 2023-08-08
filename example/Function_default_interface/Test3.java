package Function_default_interface;

import java.util.ArrayList;
import java.util.function.Function;

class Nandini_Dairy{
    int Fatmilk;
    int NoFatMilk;
    Nandini_Dairy (int Fatmilk, int NoFatMilk){
      this.Fatmilk = Fatmilk;
      this.NoFatMilk = NoFatMilk;
    }
}

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Nandini_Dairy>list = new ArrayList<>();
        list.add(new Nandini_Dairy(23,20));

        Function <Nandini_Dairy, Integer> f1 = nd -> {
            if(nd.Fatmilk == 23){
                return (nd.Fatmilk +3);
            }
            else {
                return null;
            }
        };

        Function <Nandini_Dairy, Integer> f2 = nd -> {
            if(nd.NoFatMilk  == 20){
                return (nd.NoFatMilk  +2);
            }
            else {
                return null;
            }
        };

        for(Nandini_Dairy nd : list){
            int result = f1.apply(nd);
            System.out.println("Old price Fat Milk Price is  "  + "    "+nd.Fatmilk);
            System.out.println("Price Hike by       "+ (result -nd.Fatmilk));
            System.out.println("New price of FatMilk"+"     "+result);
        }

        for(Nandini_Dairy nd : list){
            int anser = f2.apply(nd);
            System.out.println("Old price NOFat Milk Price is + " + "   " +        +nd.NoFatMilk);
            System.out.println("Price Hike by       "+ (anser -nd.NoFatMilk));
            System.out.println("New price of FatMilk"+"     "+anser);
        }
    }
}
