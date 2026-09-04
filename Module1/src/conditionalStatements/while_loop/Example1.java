package conditionalStatements.while_loop;

public class Example1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {

            System.out.println("JAVA");
            i++;
        }
    }
}


class JSpiders {
    public static void main(String[] args) {
        int x = 5;
        while (x >= 1) {
            System.out.println("Jspiders");
            x--;
        }
    }
}

class Series {
    public static void main(String[] args) {
        int a = 1, b = 5;
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}

class Series1 {
    public static void main(String[] args) {
        int a = 1, b = 5;
        while (a <= b) {
            System.out.println(b);
            b--;
        }
    }
}

class Series2 {
    public static void main(String[] args) {
        int a = 1, b = 10;
        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}

class Series3 {
    public static void main(String[] args) {
        int a = 1, b = 10;
        while (a <= b) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b--;
        }
    }
}


class Sum {
    public static void main(String[] args) {
        int a = 1, b = 10;
        int sum = 0;
        while (a <= b) {
            if (a % 2 != 0) {
                sum = sum + a;
            }
//      sum += a ;  Short circult or short hand operator
            a++;
        }
        System.out.println(sum);
    }
}

class Table {
    public static void main(String[] args) {
        int n = 4, a = 1, b = 10;
        while (a <= b) {
            int prod = 4 * a;
            System.out.println(n + " * " + a + " = " + prod);
//            System.out.println(a);
            a++;
        }
    }
}


class Factorial {
    public static void main(String[] args) {
        int a = 1, b = 5, fac = 1;
//        3628800 for 10
        while (a <= b) {
//         fac = fac * b ;
            fac *= b;
            b--;
        }
        System.out.println(fac);
    }
}


//  1. write a java program to add to number a , b without using "+" operator  ;
// 2 .write a java program to check if a number is divisible by 7 wihtout using "%" operator ;

class Sum1 {
    public static void main(String[] args) {
        int a = 1, b = 4 ;

        while (b != 0) {
            a ++ ;
            b -- ;
         }
        System.out.println(a);
    }
}


 class Divide {
     public static void main(String[] args) {
         int num = 71 ;
         int n = 7 ;
         while (num > 0) {
             if (num - n == 0) {
                 System.out.println(true);
             }
             if (num < n) {
                 System.out.println(false);
             }
             num = num - n ;
         }
     }
 }