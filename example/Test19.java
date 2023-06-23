// Agenda to implement Multiple Inheritance - 
// Two parents giving one child 
// using interface we will achive through Abstract methods - By default public and static 
interface ParentA {
    void m1();
}
class Child implements ParentA {
    public void m1(){
        System.out.println("Implementation done in child class Successfully ");
    }
}
public class Test19 {
    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
    }
}