package Lambda;
// Interace concept using Lambda Expresions
@FunctionalInterface
interface Wheeler {
   public void cart(); // Single Abstract Method
        }
public class L2 {
    public static void main(String[] args) {
       Wheeler wheeler = ()-> System.out.println("Bullock");
       wheeler.cart();
    }
}
