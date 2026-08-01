package org.jspider.conditionalStatements.switch_statements;

public class ByChar {
    public static void main(String[] args) {
        char choice = 'c';
        switch (choice) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Ball");
                break;
            case 'C':
                System.out.println("Caat");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            default:
                System.out.println("Under Development");

        }
    }
}
