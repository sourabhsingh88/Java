package conditionalStatements.if_statements.version3;

public class Bgl_chn {
    public static void main(String[] args) {
        int a =13 ;
        if (a%2 == 0 && a %  3 == 0) {
            System.out.println("Banglore");
        } else if (a% 2 == 0) {
            System.out.println("Chennai");
        } else if (a % 3 == 0) {
            System.out.println("Hydrabad");
        }else {
            System.out.println("Kochi");
        }
    }
}
