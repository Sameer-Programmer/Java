package ArraysConcept;

public class Test8 {
    public static void main(String[] args) {
        int a[] = { 9,7,7,9,11,2,2,4,5,6,7,8,9,88,8,8,9};
        for(int i = 0; i<a.length-1; i++){
            if(a[i] != a[i+1]){
                System.out.println(a[i]);
            }
        }
    }
}
