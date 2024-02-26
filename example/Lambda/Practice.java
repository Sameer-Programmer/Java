package Lambda;
interface Mobile {
    public String Iqz6(); // Abstract method
}

public class Practice {
    public static void main(String[] args) {
      Mobile mobile = ()-> {
          System.out.println("8 gb ram ");
          return ("price is 17000 INR");
      };
        System.out.println(mobile.Iqz6());

    }
}
