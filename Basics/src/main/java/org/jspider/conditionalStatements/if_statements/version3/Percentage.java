package org.jspider.conditionalStatements.if_statements.version3;

public class Percentage {

    public static void main(String[] args) {

        double percentage = 60.1 ;

        if (percentage >= 85) {

            System.out.println("Distinciton");

        } else if (percentage >= 60 && percentage < 85) {

            System.out.println("First Class");

        } else if (percentage >= 50 && percentage < 60) {

            System.out.println("Second Class");

        } else if (percentage >= 30 && percentage < 50) {

            System.out.println("Pass");

        } else {

            System.out.println("Fail");

        }
    }
}
