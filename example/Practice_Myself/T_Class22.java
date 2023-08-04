package Practice_Myself;

import java.util.ArrayList;
import java.util.function.Predicate;

class TataMotors {
    String Car;
    String Colour;
    double Price;
    int Model;

    TataMotors(String Car,String Colour, double Price,int Model)
    {
    this.Car = Car;
    this.Colour = Colour;
    this. Price = Price;
    this.Model = Model;
    }
}

public class T_Class22 {
    public static void main(String[] args) {
        Predicate <TataMotors> predicate = items-> items.Model > 2020 && items.Price <11;
        ArrayList<TataMotors> list = new ArrayList<TataMotors>();
        list.add(new TataMotors("Nexon","Red",7.74,2023));
        list.add(new TataMotors("punch","white",8.74,2022));
        list.add(new TataMotors("Tiago","blue",22.74,2021));
        list.add(new TataMotors("Altroz","black",13.74,2023));
        for (TataMotors items :list) {
            if(predicate.test(items)) {
                System.out.println(items.Model +"     "+items.Price+"  "+items.Car);
            }

        }
    }
}