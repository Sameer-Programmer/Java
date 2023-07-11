<<<<<<< HEAD
package ArraysConcept;

public class Test7 {
    public static void main(String[] args) {
        int a[] = { 9,6,3,1,0,11,3,22,11,22,1,};
        int n = a.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1;j<n; j++){
                if(a[i] == a[j]){
                    System.out.println(" found duplicates " + a[i]);
                }
            }

        }
    }
}
=======
package ArraysConcept;
import java.util.Arrays;
public class Test7 {
    public static void main(String[] args) {
        int a[] = {11,9,8,8,7,6,6,5,4,4,3,3,1,2,2,6,1};
        int rd = 0;
        for(int i = 1; i<a.length-1; i++){
            if(a[rd]!=a[i]){
                rd++;
                a[rd]= a[i];
            }
        }
       //int result []= {}
    }
}
>>>>>>> f720dec6f496a0d39560ab1ca0362d3628db5a16
