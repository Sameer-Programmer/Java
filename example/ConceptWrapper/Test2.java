package ConceptWrapper;

public class Test2 {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("Primitive _Datatype"+"      "+i);

        Integer value = new Integer(i);
        System.out.println(value+" Primitive Data Type Stored in Object - Boxing");

        //Lets Unbox it

        int j = value.intValue();
        System.out.println(j+"value  is Pulled from the Object   and Stored to j - Primitive data Type -Unboxing");



        // Lets Write Auto Unboxing and Auto Boxing


        int donkey = 20;
        System.out.println("Primitive Data Type                       "+donkey);

        Integer Zeebra = donkey; // AutoBoxing
        System.out.println(Zeebra+"                            Auto_Boxing     ");

        int Grass = Zeebra; // Auto Unboxing
        System.out.println(Grass+"                                 Auto Unboxing");


        String s1 = "12345";
        int n1 = Integer.parseInt(s1);      // parseInt is a static method , to access that we have to call Class name




    }
}
