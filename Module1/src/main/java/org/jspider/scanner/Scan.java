package org.jspider.scanner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int val = 10  ; // HardCodded
        Scanner sc = new Scanner(System.in) ; // User input
//        sc.nextInt() ; // used to ask for value as per datatype
        System.out.println("Please Enter the value");
        int num = sc.nextInt() ;
        System.out.println(num);
    }
}
