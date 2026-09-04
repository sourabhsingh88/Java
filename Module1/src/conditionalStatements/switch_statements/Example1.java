package conditionalStatements.switch_statements;

public class Example1 {
    public static void main(String[] args) {

//             Q. ATM selecction sceniro if press
//                1. then withdrwal
//                2. for balance inquery
//                3. pin change
//                4. mini statement
//                5. invalid choice

        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("Cash Withdrawal ");
                break ;
            case 2:
                System.out.println("Balance inquery");
                break;
            case 3:
                System.out.println("Pin Change");
                break;
            case 4:
                System.out.println("Mini Statement");
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}
