package org.jspider.conditionalStatements.for_loop;

public class Even2Digit {
    public static void main(String[] args) {
        int count = 0 ;
        for (int i = 2; i < 100; i = i + 2) {
            if (i > 9) {
                count ++ ;
            }
            System.out.println(i);
        }
        System.out.println("count of 2 digit even number is "  +  count);
    }
}
