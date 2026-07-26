package org.jspider.conditionalStatements.if_statements.version3;

public class Discount_ticket {
    public static void main(String[] args) {
        int age  = 60 ;
        if (age <= 3  ) {
            System.out.println("Free tickit");
        } else if (age > 3 && age <= 10) {
            System.out.println("half ticket");
        }else if (age > 10 && age < 60) {
            System.out.println("Full ticket");
        } else  {
            System.out.println("Discount for senior citizen ");
        }

    }
}

