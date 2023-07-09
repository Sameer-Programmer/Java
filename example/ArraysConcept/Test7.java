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
