package ArraysConcept;

import java.util.Arrays;

/* Agenda to implement
1.Declaration of Array
2. Find the Length of the Array
3. sorting of an Array
4. Print smallest and Biggest value in Array
5. sum and Product of Array
6. Find duplicates in a Array
7. Print with-out duplicates in a Array
*/
public class Test5 {
    public static void main(String[] args) {
        int a [] = { 9,7,7,5,4,2,9,0,2,21,66,88,5,8,2,1,6,9};
        int n = a.length;
        System.out.println("Length of the Array is "+n);
        int sum = 0;
        int product = 1;
        for (int i =0; i<n; i++){
            sum = sum +a[i];
            product = product *a[i];
        }
        System.out.println("sum of Arrays + "+ sum);
        System.out.println("Product of Arrays + "+ product);

        for (int i =0; i<n-1; i++){
            for (int j =0; j<n-1; j++){
                if(a[j] >a[j+1]){
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1]= c;
                }
            }
        }
        String s1 = Arrays.toString(a);
        System.out.println(s1);
        System.out.println("smallest Value in a Array is + "+ a[0]);
        System.out.println("Biggest Value in a Array is + "+ a[n-1]);

        // Let's find Duplicates in an Array

        for (int i = 0; i < (n - 1); i++) {
            if(a[i]==a[i+1]){
                System.out.println(" found Duplicates     "+ a[i]);
                i++;
            }
        }

        // Let's find triples in a Array
        for (int i = 0; i < n - 2; i++) {
            if(a[i]==a[i+1] && a[i]==a[i+2]){
                System.out.println(" found Triples     "+ a[i]);
                i+=2;
            }
        }


        int rd = 0;
        for (int i = 1; i<n-1; i++) {
            if(a[rd]!= a[i]){
               rd++;
               a[rd]=a[i];
            }
        }



    }
}

