package org.example;

public class Test4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int largest ;

        if(a>b && a>c){
            largest = a;
        } else if (b>a && b>c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println(largest);






    }
}
