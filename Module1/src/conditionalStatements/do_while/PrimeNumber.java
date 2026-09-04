package conditionalStatements.do_while;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 13;
        int a = 2 ;
        int count = 0;
        boolean isPrime = true ;
        while (a <= num/2) {
            if (num % a ==  0) {
                count ++ ;
                isPrime = false ;
                break ;

            }
            a++ ;
        }
        System.out.println(isPrime);
//        System.out.println(count == 0);
    }
}
