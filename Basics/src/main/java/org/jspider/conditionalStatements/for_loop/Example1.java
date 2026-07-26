package org.jspider.conditionalStatements.for_loop;

import java.sql.SQLOutput;

//------------------------1 TO 10 -------------------------------
public class Example1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("the number  ");
            System.out.println(i);
        }
    }
}

//-------------------------100 to 0 --------------------------------------
class example100_0 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

//---------------------------------Even number between 0 to 100 ------------------------------------------------
class EvenNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

//----------------------------------------ODD number between 0 to 100 and product  -----------------------------------------
class OddNumber {
    public static void main(String[] args) {
        long prodt = 1 ;
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
            prodt = prodt * i ;
        }
        System.out.println("prodt is "+ prodt);
    }
}

//-------------------------------------------Sum of even number 0 to 100 --------------------------------------------

class SumEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            sum = sum + i;
//            System.out.println(i);
        }
        System.out.println("Sum of even number between 0 to 100 is = " + sum);
    }
}


//-------------------------------------------Sum of odd number 0 to 100 --------------------------------------------

class SumOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            sum = sum + i;
//            System.out.println(i);
        }
        System.out.println("Sum of odd number between 0 to 100 is = " + sum);
    }
}

//-------------------------------------------Count of 2 digit number divisible by 3 --------------------------------------------

class Count3Digit {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i > 9) {
                if (i % 3 == 0) {
//                System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("count of  2 digit number divisible by 3 is = " + count);
    }
}