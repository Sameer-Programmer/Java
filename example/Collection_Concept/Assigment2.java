package Collection_Concept;

import java.util.ArrayList;
import java.util.Arrays;

public class Assigment2 {
    public static void main(String[] args) {

        String a[] = {"Cat"," Dog", " Elephant","Lion"};
        System.out.println(" Printing Array ");
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
        // Lets Convert this above array into ArrayList
        ArrayList list = new ArrayList(Arrays.asList(a));
        System.out.println(list+"       successfully converted Arrays into Arraylist");

    }
}
