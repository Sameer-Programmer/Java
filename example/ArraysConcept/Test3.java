package ArraysConcept;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int a [] = { 1,3,4,6,7,8,0,2,4,};
        int n = a.length;
        for(int i =0 ; i<n-1; i++){   // outer iteration
            for(int j = 0; j<n-1; j++){  // inner iteration
                if (a[j]>a[j+1]){
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1]= c;
                }
            }
        }
        System.out.println(a);//, it will display the memory address of the array object, rather than its contents.
        System.out.println(Arrays.toString(a));
    }
}
