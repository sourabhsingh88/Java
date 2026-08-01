package org.jspider.methods.passing;

public class Example {
    public static void main(String[] args) {
//        play(7.5);
//        sum(15 , 10 );
            diplay(50 , 'M' , true);
    }
    static void help(char ch) {
        System.out.println(ch);
    }
    static  void play (double num) {
        System.out.println(num);
        help('J');
    }
    static void diplay(long a , char gender , boolean single) {
        System.out.println("Number " + a );
        System.out.println("Gender " + gender);
        System.out.println("Single " + single);
    }
    static void sum (int a , int b) {
        int sum = a+b  ;
        System.out.println(a + " + " + b + " = " + sum);
    }
}
