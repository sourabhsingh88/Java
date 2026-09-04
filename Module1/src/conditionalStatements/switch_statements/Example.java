package conditionalStatements.switch_statements;

public class Example {
    public static void main(String[] args) {
        int choice =  1 ;
        switch (choice) {
            case 1 :
                System.out.println("COD");
                break;
            case  2 :
                System.out.println("UPI");
                break;
            case 3 :
                System.out.println("CARD");
                break ;
            case 4 :
                System.out.println("Net Banking");
                break ;
            default:
                System.out.println("net banking");
        }

    }
}
