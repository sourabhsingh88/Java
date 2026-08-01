package org.jspider.conditionalStatements.do_while;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 24 ;
        int a = 1 ;
        int sum = 0 ;
        while (a <= num/2) {
            if (num % a == 0 ) {
                sum = sum + a ;
            }
            a ++ ;
        }
        System.out.println(num == sum );
    }
}
