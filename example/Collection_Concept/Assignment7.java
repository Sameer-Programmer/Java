package Collection_Concept;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int count = 0;
        for(int i=0; i<name.length();i++) {
            char c = name.charAt(i);
            if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ){
                count++;
                System.out.print(c + " ");
            }

        }
        System.out.println(count);
    }
}
