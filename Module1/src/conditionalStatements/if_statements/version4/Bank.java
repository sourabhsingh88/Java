package conditionalStatements.if_statements.version4;


public class Bank {
    public static void main(String[] args) {
        double accBal = 10000 ;
        int amt = 4000 ;
        if (amt <= accBal) {
            if (amt % 100 == 0) {
                System.out.println("Withdrawl Success");
            }else {
                System.out.println("Please withdrwal amout in 100 , 500 :: invalid denomination ");
            }
        }else {
            System.out.println("Insufficemt Balance ");
        }
    }
}