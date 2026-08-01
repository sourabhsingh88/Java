package org.jspider.methods.passingAndReturning;

public class Example {
    public static void main(String[] args) {
        System.out.println(verify(10));
        System.out.println(verify(11));
    }
    public static boolean verify (int a) {
        if (a % 2 ==0) {
            return true ;
        }
        else
            return false ;
    }
}
