package Sameer_Collection_Class;

import java.util.HashMap;
import java.util.Map;

public class Class8 {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<Integer,String >();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");
        map.put(4,"Apple");
        System.out.println(map);

        System.out.println( map.get(1));
        System.out.println(map.remove(1));
        System.out.println(map);
        map.containsKey(2);
        System.out.println(map.containsKey(2));
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("Orange"));
        System.out.println(map.size());
        map.replace(2,"hen");
        System.out.println(map);

        // Entry_ Methods

        /*1.	To print Key and Value line by line we will go with For loop
        // 1)map.entrySet() = Method
           2)entry = variable
           3) Map.Entry = Data _Type
           4)  :  represents in                         */

        for (Map.Entry entry: map.entrySet()){
            //Datatype  variable   MMethod
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        System.out.println("above  are from the Entry set Method");

        //map.clear();
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet()+"        all entries in set");



        HashMap ap = new HashMap();
        ap.putAll(map);
        System.out.println(ap);





    }
}
