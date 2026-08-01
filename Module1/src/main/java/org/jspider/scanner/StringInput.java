package org.jspider.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter String Value");
        String sub = sc.next() ; // reads only first word
        System.out.println(sub);
        System.out.println("Sorry can you please Enter String Value Again ");
        Scanner scn = new Scanner(System.in) ;
        // we need to create new object if we will not create
        // then it will take the remaing part of the first sub
        String subj = scn.nextLine() ;
        System.out.println(subj);
    }
}

//dont take string as input
// if using always prefere next()
// always use at end if need to use at first then use seprate method and make return type as String and return and use


