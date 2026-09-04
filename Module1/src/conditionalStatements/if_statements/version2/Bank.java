package conditionalStatements.if_statements.version2;

public class Bank {
    public static void main(String[] args) {
        double bal = 10000 ;
        int amt = 4000 ;
        if (amt <= bal) {
            System.out.println("Withdrawl Successfull of : "  + amt);
            bal = bal - amt ;
        }else {
            System.out.println("insufficent balance");
        }
        System.out.println("Remaining Balance is : " + bal);
    }
}
