package org.jspider.conditionalStatements.if_statements.version4;

public class Metrimonial {
    public static void main(String[] args) {


    char gender = 'F' ;
    int age = 17 ;
    if (gender == 'M' ) {
        if (age >= 21) {
            System.out.println("Eligible Bachleor");
        }else {
            System.out.println("Under age boy");
        }
    }else if (gender == 'F') {
        if (age >=18) {
            System.out.println("Eligible Spinster");
        }else {
            System.out.println("under age girl");
        }
    }
    else {
        System.out.println("invalid gender");
    }
    }
}
