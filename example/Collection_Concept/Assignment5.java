package Collection_Concept;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String revName= "";

        for (int i=name.length()-1; i>=0;i--){
            revName = revName + name.charAt(i);
        }
        System.out.println(revName);

    }
}
