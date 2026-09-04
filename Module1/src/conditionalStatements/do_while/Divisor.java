package conditionalStatements.do_while;

public class Divisor {
    public static void main(String[] args) {
        int num = 10 ;
        int a = 1 ;
        int count = 0 ;
        while(a <= num/2) {
            if (num % a  == 0) {
                System.out.println(a);
                count ++ ;
            }
            a++ ;
        }
        System.out.println("Count of Divisor are " + count);
    }
}
