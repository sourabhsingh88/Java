package org.jspider.recursion;

public class Factorial {
    static void main() {
        fact(5 ,1);

    }
    static void fact(int n , int factorial) {
        factorial = n * factorial ;
       if (n > 1) {
           n -- ;
           fact(n , factorial);
           System.out.println( n + " " + factorial);
       }

       else
       System.out.println("final factorial "+factorial);

    }
}
