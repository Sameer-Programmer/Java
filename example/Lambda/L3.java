package Lambda;

interface GreenUber {
   public void driver(String source , String destination);
}

public class L3 {
    public static void main(String[] args) {
        GreenUber greenUber = (source, destination)-> System.out.println(source+" to "+destination);
        greenUber.driver("Hyderabad" ," Bengalore");

    }
}
