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
