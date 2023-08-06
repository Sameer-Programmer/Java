package ConceptWrapper;

public class Test1 {
    public static void main(String[] args) {
        int i = 10; // Primitive Data type
        Integer n = new Integer(i);  // Object // Boxing // Primitive data type Stored in Object
        Integer value = i; // AutoBoxing

        System.out.println(n+"              Boxing");  // Printing Object






        int j = n.intValue();  // Unboxing
        int k = value ;// Auto Unboxing
        //intValue() is a Method to Unbox --------- Primitive Data type
        System.out.println(j+"              unboxing");

        String s1 = "123";
        int number = Integer.parseInt(s1);
        System.out.println(number);

    }
}
