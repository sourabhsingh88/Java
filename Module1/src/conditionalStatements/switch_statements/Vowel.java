package conditionalStatements.switch_statements;

public class Vowel {
    public static void main(String[] args) {
        char ch = 'A' ;
        switch(ch) {
            case 'a' :
                System.out.println("Vowel");
                break ;
            case 'A' :
                System.out.println("Vowel");
                break ;
            case 'e' :
                System.out.println("Vowel");
                break ;
            case 'E' :
                System.out.println("Vowel");
                break ;
            case 'i' :
                System.out.println("Vowel");
                break ;
            case 'I' :
                System.out.println("Vowel");
                break ;
            case 'o' :
                System.out.println("Vowel");
                break ;
            case 'O' :
                System.out.println("Vowel");
                break ;
            case 'u' :
                System.out.println("Vowel");
                break ;
            case 'U' :
                System.out.println("Vowel");
                break ;
                default:
                    System.out.println("please enter valid character");
        }
    }
}

// Q2 create a simple calculator using switch case input will be 2 numbers and operators ;

class Calculator {
    public static void main(String[] args) {
        double a = 10 ;
        double b = 20 ;
        double result = 0 ;
        String operator  = "*" ;
        switch (operator) {
            case "+" :
                result = a + b ;
                System.out.println(result);
                break ;
            case "-" :
                result = a - b ;
                System.out.println(result);
                break ;
            case "*" :
                result = a * b ;
                System.out.println(result);
                break ;
            case "/" :
                result = a / b ;
                System.out.println(result);
                break ;
        }
    }
}
// Q3  Write a program that takes number and print wheather it is even or odd ;
class EvenOrOdd{
    public static void main(String[] args) {
        int num = 10 ;
        if (num % 2 == 0 ) {
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}

// Q4  write menu driven program using switch input one area of circle input 2 sqare of number input 3 cube of a number input 4 print exit
//one is operation and value


class operatios {
    public static void main(String[] args) {
        int choice = 1 ;
        int num = 10 ;
        double pi = 3.14 ;
        double r = 7 ;
        switch (choice) {
            case 1 :
                double area = pi * r *r ;
                System.out.println(area);
                break ;
            case 2 :
                System.out.println(num *num);
                break ;
            case 3 :
                System.out.println(num * num * num);
                break ;
            case 4 :
                System.out.println("Exit");
            break ;
            }
    }
}
//Q5 write a program that simulated basic basic atm menu 1 check balance 2 deposit 3 withdrawl  4 print exit
