package conditionalStatements.switch_statements;

public class FeedBack {
    public static void main(String[] args) {
        int choice = 5;
        switch (choice) {
            case 1:
                System.out.println("Excellent ");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Poor");
                break;

            default:
                System.out.println("Skip FeedBack");

        }
    }
}

