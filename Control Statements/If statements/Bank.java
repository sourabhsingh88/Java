public class Bank {
    public static void main(String[] args) {
        double bal = 10000 ;
        int amount = 1000 ;
        if (amount <= bal) {
            System.out.println("Withdral successfully ");
            bal = bal - amount   ;
        }
        else{
            System.out.println("innsufficient balance");
        }
        System.out.println("Available Balance : "+ bal);
    }
}
