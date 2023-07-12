package Collection_Concept;

import java.util.LinkedList;

public class Assignment3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("welcome");
        list.add('@');
        list.add(1,"to");
        list.add(true);
        list.add(null);
        list.add(1);
        list.add(100);

        System.out.println( list.size()+ "              from 1");
        System.out.println(list+ "              from 2");
        list.remove(1);  // to
        list.remove("1");
        // It wont remove value of 1 -- as Linked List deleted only index not the Elements directly
        System.out.println(list+ "              from 3");
        list.get(1);
        System.out.println(list.get(1)+ "              from 4");
        list.set(1,"Indian");
        System.out.println(list+ "              from 5");
        System.out.println( list.contains("India"));
        System.out.println(list.isEmpty()+"                            from6");

        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
