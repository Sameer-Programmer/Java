abstract class Tiger{
    public abstract void eat();  
}
class BabyTiger extends Tiger{
    @Override
    public void eat() {
        System.out.println("Baby tiger");
    };
    }
public class Test24 {
    public static void main(String[] args) {
      BabyTiger babyTiger = new BabyTiger();
      babyTiger.eat();
    }
}
