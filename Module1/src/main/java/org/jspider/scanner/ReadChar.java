package org.jspider.scanner;

import java.util.Scanner;

public class ReadChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Char");
        char ch =  sc.next().charAt(0) ;
        System.out.println(ch) ;

    }
}
// In above program we are reading string value and extracting first charcter