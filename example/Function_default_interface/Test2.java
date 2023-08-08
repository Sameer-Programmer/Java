package Function_default_interface;

import java.util.ArrayList;
import java.util.function.Function;

class MRF {
    String name;
    int Salary;

    MRF(String name,int Salary) {
      this.name = name;
      this.Salary = Salary;
    }
}
public class Test2 {
    public static void main(String[] args) {

        ArrayList <MRF> list = new ArrayList<MRF>();

        list.add(new MRF("small Size",20));
        list.add(new MRF("Medium Size",40));
        list.add(new MRF("Large  Size",60));

        Function <MRF, Integer> f1 = mrf ->{
         if( mrf.Salary >=20 && mrf.Salary <=30)
             return (mrf.Salary*10/100);
         else{
             return (mrf.Salary*20/100);
         }
        } ;
        for(MRF mrf : list){
           int result = f1.apply(mrf);
            System.out.println(mrf.Salary+"     "+mrf.name);
            System.out.println(result);
            System.out.println("Now Total Salary we have to pay is " +"    "+(result+ mrf.Salary));
        }



    }
}
// Foreach Loop -- we can use only for collection
// Printing will be only in Serial Order but not in Reverse Order