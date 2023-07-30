package Lambda;
interface Maps{
    public String search(String source, String destination);
}
public class L4 {
    public static void main(String[] args) {
        Maps maps = (source, destination) ->{System.out.println(source+"      "+ "to    "+"      "+ destination);
            return ("price is 5000");
        }; // implementation of Abstract method
        // Here we have used flower brackets as we have two statements
        System.out.println(maps.search("hyd","bng"));
    }
}
