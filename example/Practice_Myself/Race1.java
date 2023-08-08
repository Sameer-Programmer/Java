import java.util.ArrayList;
import java.util.function.Function;

 class Milk {
    int Fatmilk;
    int Nofatmilk;
Milk(int Fatmilk, int Nofatmilk){
this.Fatmilk = Fatmilk;
this.Nofatmilk = Nofatmilk;
}
}
public class Race1 {
    public static void main(String[] args) {
    
        ArrayList<Milk>list = new ArrayList<>();
        list.add(new Milk(23,20));


        Function <Milk,Integer> f1 = md -> {
            if(md.Fatmilk ==23){
                return (md.Fatmilk +3);
            } else{
                return null;
            }
        };

        Function <Milk,Integer> f2 = md -> {
            if(md.Nofatmilk ==20){
                return (md.Nofatmilk +2);
            } else{
                return null;
            }
        };

        for (Milk milk : list) {
            int result = f1.apply(milk);
            System.out.println(milk.Fatmilk);
            System.out.println(result);

        }

        for (Milk milk : list) {
            int result2 = f2.apply(milk);
            System.out.println(milk.Nofatmilk);
            System.out.println(result2);

        }








    }
}