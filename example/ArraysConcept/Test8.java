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
