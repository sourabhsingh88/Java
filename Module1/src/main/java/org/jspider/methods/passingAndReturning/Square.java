package org.jspider.methods.passingAndReturning;

public class Square {
    public static void main(String[] args) {
        for (int i = 1; i <= 15 ; i++) {
            System.out.println(i + " Square is " + square(i) );
        }
    }
    public static int square(int a) {
        int sq = a * a ;
        return sq ;
    }
}
