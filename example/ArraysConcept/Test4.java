package ArraysConcept;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int a [] = {9,3,6,0,5,8,2,9};
        int n = a.length;
        for (int i =0; i<n-1 ; i++){
            for(int j = 0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[0] + "       smallest");
        System.out.println(a[n-1]+"             Biggest");

    }
}
