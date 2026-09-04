package conditionalStatements.do_while;

public class SumOfDivisior {
        public static void main(String[] args) {
            int num = 50 ;
            int sum = 0 ;
            int a = 1 ;
            while(a <= num/2) {
                if (num % a  == 0) {
//                    System.out.println(a);
                    sum = sum + a ;
                }
                a++ ;
            }
            System.out.println("Sum " + sum);
        }

}
