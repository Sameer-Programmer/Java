package Arrays;

public class Test2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 12;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("found");
                return;      //return statement is used to exit the main method and terminate the program.
            }
        }
        System.out.println("not found");
    }
}
