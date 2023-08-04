package Self_Java_Practice;

class Test37 {
    public static void main(String[] args) {
        //agenda to convert variables into Objects and Objects into Variables 
        int a = 22;
        Integer in = new Integer(22);
        System.out.println(in +"            converted to object ");
        int j = Integer.valueOf(a);
        System.out.println(j+"                 Converted into varuiable");

    }
}