package Sameer_Collection_Class;
// Hash Table Example
import java.util.Hashtable;
import java.util.Map;

public class Class9 {
    public static void main(String[] args) {
      //  Hashtable hashtable = new Hashtable<>(); // Declaration -- All Data types
        Hashtable <Integer,String>hashtable = new Hashtable<Integer,String>();
        // key = Integer , Value = String
        hashtable.put(1,"sameer");
        hashtable.put(2,"ameer");
        hashtable.put(3,"Zameer");
        hashtable.put(4,"Ranveer");
        hashtable.put(5,"peter");
        hashtable.put(6,"Alexander");
        System.out.println(hashtable); // Out put Order will not be same as Given Order
        System.out.println(hashtable.get(11)); //here -- 11 is Not there
        // It will get the value of Particular Key-- if the value is not there it will through NULL
        // hash table don,t allowes Nulls for Key and values - It throws Exception
        System.out.println(hashtable.containsKey(1)); // key
        System.out.println(hashtable.contains(1)); // value
        System.out.println(hashtable.isEmpty());
        System.out.println(hashtable.keySet()); // All keys
        System.out.println(hashtable.values());
        System.out.println(hashtable.keys());

        // Let's Print through for Loop - Using Method EntrySet()
         /*1.To print Key and Value line by line we will go with For loop
        // 1)map.entrySet() = Method
           2)entry = variable
           3) Map.Entry = Data _Type
           4)  :  represents in */
        for(Map.Entry entry:hashtable.entrySet()){
            //Datatype  variable   Method
            System.out.println(entry.getKey()+"         "+entry.getValue());
        }
        hashtable.put(7,"Dog");
        System.out.println(hashtable);

    }
}
