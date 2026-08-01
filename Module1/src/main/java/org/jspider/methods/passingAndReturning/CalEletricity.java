package org.jspider.methods.passingAndReturning;

public class CalEletricity {
    public static void main(String[] args) {
        System.out.println("total due of darbar house " + cal(200));
        System.out.println("total due of Ramm house " + cal(101));

    }
    public static double cal(int units){
        double totalDue  ;
        if (units <= 100 ) {
            return 0.0;
        }else {
            totalDue = units * 5 ;
        }
        totalDue = totalDue + (totalDue * 0.18) ;
        return totalDue ;
    }
}
