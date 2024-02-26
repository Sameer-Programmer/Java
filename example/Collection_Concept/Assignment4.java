package Collection_Concept;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Number");
        int a  =scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /*if(a>b&& a>c) {
            System.out.println(" a is the Largest Number ");
        }
        if(b>a&& b>c) {
            System.out.println(" b is the Largest Number ");
        }
        if(c>a&& c>b) {
            System.out.println(" c is the Largest Number ");
        }*/

        /*int max = a;
        if(b>a){
            max=b;
        }
        if(c>b){
            max=c;
        }
        System.out.println(max);*/

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
