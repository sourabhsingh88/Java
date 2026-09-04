package conditionalStatements.if_statements.version4;

public class example {
    public static void main(String[] args) {
        int n = 10;
        if (n % 2 == 0) {
            if (n < 10 ){
                System.out.println("Pani Puri");
            }else {
                System.out.println("Bhel Puri");
            }
        }else {
            if (n < 10 ) {
                System.out.println("Masala Puri");
            }else {
                System.out.println("Dhai Puri");
            }
        }
    }
}
