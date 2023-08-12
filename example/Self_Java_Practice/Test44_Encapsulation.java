package Self_Java_Practice;
class Nagendra {
    private String girl;

    void m1 (String girl){
        this.girl = girl;
        System.out.println(girl);
    }
}
class Test44_Encapsulation {
    public static void main(String[] args) {
        Nagendra n = new Nagendra ();
        n.m1 ("rosy");
    }
}

