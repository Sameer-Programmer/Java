package ConceptWrapper;

public class Test3 {
    public static void main(String[] args) {
        int age = 22;
        Integer sameer = new Integer(age);
        System.out.println(sameer+"               Boxing done Successfully");

        int imran = sameer.intValue();
        System.out.println(imran+"            unboxing");

        Integer Autoboxing = age;
        System.out.println(Autoboxing);
        int Auto_Unboxing = age;
        System.out.println(Auto_Unboxing);


        String s1 = "123456";

        int value = Integer.parseInt(s1);
        System.out.println(value);



    }
}
