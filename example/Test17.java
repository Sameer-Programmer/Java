//Example of Multi-level-Inheritance 

class Swim {
    public void water() {
        System.out.println("I can swimm in Water");     
    }
}
class Walk extends Swim {
    public String moving(){
        String size = "  small";
        System.out.println(" I can walk on earth");
        return size;
    }
}
class Hopping extends Walk {
    public void jump() {
        System.out.println("I can jump");
    }
}

public class Test17 {
    public static void main(String[] args) {
        Hopping hopping = new Hopping();
        hopping.water();
        hopping.moving();
        hopping.jump();
        System.out.println("My name is Frog"); 
        // printing the returning method to print the data inside the returing method.
        System.out.println(hopping.moving());     
    }
    
}
