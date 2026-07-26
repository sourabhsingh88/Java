package org.jspider.methods.returnn;

public class Example {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
    }

    public static boolean isPrime(int num) {
        int a = 2;
        boolean isPrime = true;
        while (a <= num / 2) {
            if (num % a == 0) {
                isPrime = false;
                break;

            }
            a++;
        }
        return isPrime ;
    }
}
