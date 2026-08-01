package org.jspider.methods.passingAndReturning;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i <=  10; i++) {
            System.out.println("Factorial of " + i + " is " + fact(i));
        }
    }
    public static int fact(int num ) {
        int res = 1 ;
        while(num >= 1) {
            res = num * res;
            num--;
        }
        return res;
    }
}
