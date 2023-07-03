package Arrays;

public class Test1 {
    public static void main(String[] args) {
       int a[] = {1,2,3,4,5,6};          //single dimensional Array
       int length = a.length;            // Length of the array
        System.out.println(length);
        int sum = 0;
        int product = 1;

        for (int i =0; i<length; i++){
            sum = sum +a[i];          // Sum of the array
            product = product *a[i];  // Product of the array

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
