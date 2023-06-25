class Elephant {
    int weight =1000;
    Elephant () {
        System.out.println("elephant is not a wildlife Animal ");
    }

}
class Animal extends Elephant {
    public  void eat() {
        System.out.println(super.weight);
    }
    Animal (){
        super();
        System.out.println("All Animals have four legs");
    }

}
class Forest extends Animal {
    public void green() {
        super.eat();
       System.out.println("forest is Green"); 
    }
}

public class Test32 {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.green();
             
    }
 }

