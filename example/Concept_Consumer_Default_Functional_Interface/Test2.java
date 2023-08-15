package Concept_Consumer_Default_Functional_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
* 1. Caliculate the Bonus of the Employee
* 2.Verify bonus value is greater than 5000 or not
* 3. if Condition becomes true  print all the details of an Employee
* */
class LSR {
    String name;           int salary;        int Dob;
    LSR(String name, int salary, int Dob) { this.name = name; this.salary = salary; this.Dob = Dob;}
}

public class Test2 {
    public static void main(String[] args) {
        ArrayList<LSR>list = new ArrayList<>();
        list.add(new LSR("Nagendra",30000,1985));
        list.add(new LSR("seenu",20000,1989));
        list.add(new LSR("Praveen",30000,1986));
        list.add(new LSR("Shiva",20000,1990));
        list.add(new LSR("Sreekanth",25000,1987));
        list.add(new LSR("SameerBhai",10000,1995));
        list.add(new LSR("Riyaz",10000,1996));
        list.add(new LSR("Sanjeev",5000,1999));
        list.add(new LSR("Lakshman",5000,1998));
        list.add(new LSR("Rohit",50000,1994));

        Function <LSR , Integer> f1 = agent -> (agent.salary *10)/100;   // To caliculate Bonus
        Predicate <Integer> p1 = agent-> agent >2000;   // To verify bonus is greter than 200;
        Predicate <Integer>p2 = agent->  agent >1995;

        Consumer <LSR> c1  = agent -> {
            System.out.println(agent.name+"    "+agent.salary+"       "+agent.Dob);
        };

        for (LSR box :list){
            int bonus =  f1.apply(box);
            if(p1.test(bonus)){

                c1.accept(box);
            }
        }
        for (LSR box :list){
          if ( p2.test(box.Dob)) {
              c1.accept(box);
          }
        }
    }
}
