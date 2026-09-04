package conditionalStatements.switch_statements;

public class Language {
    public static void main(String[] args) {
        int option = 4 ;
        switch (option) {
            case 1 :
                System.out.println("ENGLISH");
                break ;
            case 2 :
                System.out.println("KANNADA");
                break ;
            case 3 :
                System.out.println("HINDI");
                break ;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
