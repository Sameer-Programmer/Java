package Sameer_Collection_Class;

import java.util.ArrayList;
import java.util.HashSet;

/* 1.Convert array into Array  List
2.convert  Array  List  into Hashset
3.convert Hashset into Array List
4.Convert Array List into Array
 */
public class Class4 {
    public static void main(String[] args) {
        int a [] = {1, 1,2, 3, 4, 5, 6,6, 7, 8, 9, 10}; // Array
        // length of the array
        int length = a.length;
        System.out.println(length); // Length Count Starts from 1
        for(int i =0; i<length; i++){
            System.out.println(a[i]);
        }

        // Convert array into ArrayList
        ArrayList list = new ArrayList<>();
        for(int i =0; i<length; i++){
            list.add (a[i]);         //Here we are adding array indexes to array List through method add
        }
        System.out.println(list+"            Arraylist");


        // Convert ArrayList  into  HashSet
        HashSet hs = new HashSet();
        hs.addAll(list);
        System.out.println(hs+"            Hashset");
    }
}
