package org.jspider.scanner;

import java.util.Scanner;

public class Programs {

    public static void main(String[] args) {
//        evenOdd();
//        add() ;
        about();
    }

    static void evenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number ");
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        double sum = a + b;
//        System.out.println(" sum is = " + a + b ); // sum is = 5.05.0 dont do like this in addition
        System.out.println(" sum is = " + sum);
    }

    public static void about() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        long mob = sc.nextLong();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Are you Single (true or false) ");
        boolean single = sc.nextBoolean();

        System.out.println("Mob : " + mob);
        System.out.println("Single : " + single);
        System.out.println("Age : " + age);
    }

}
