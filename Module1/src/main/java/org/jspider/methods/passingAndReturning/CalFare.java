package org.jspider.methods.passingAndReturning;

public class CalFare {
    public static void main(String[] args) {
        System.out.println(calFair(10 , 'B'));
    }
    public static double calFair(double dis, char mode) {
        double res =  0.0;
        switch (mode) {
            case 'A' : res = dis * 10 ;
                break ;
            case 'C' : res = dis * 15 ;
                break ;
            case 'B' : res = dis * 12 ;
                break ;
        }
        return res;
    }
}
