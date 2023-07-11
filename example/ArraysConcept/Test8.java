<<<<<<< HEAD
package ArraysConcept;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int a[] = { 3,4,5,6,7,8,1,2,1,4,5,6,7,8,8,8,9,9,9,10,10,10} ;
        int n = a.length;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println();
        // find duplicates
        for(int i = 0 ; i<n-1; i++){
            if(a[i]== a[i+1]){
                System.out.println("found duplicates        " +a[i]);
                i+=1;
            }
        }
        // for tripple
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = i+2; k<n; k++){
                    if(a[i]==a[j] && a[i]==a[k]){
                        System.out.println("found triple               " + a[i]);
                       i+=2;
                    }
                }

            }
        }
    }
}
=======
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
>>>>>>> f720dec6f496a0d39560ab1ca0362d3628db5a16
