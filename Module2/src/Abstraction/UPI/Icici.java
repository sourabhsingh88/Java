package Abstraction.UPI;

public class Icici extends Upi {

    int balance = 0;
    String name ;

    void deposit(int amount) {
        balance =  balance + amount ;
        System.out.println("ICICI Amount Credited");
        System.out.println("New Balance  : " + balance);
    }
    @Override
    void send(int amount) {
        if (amount <= balance) {
            balance = balance - amount ;
        }
        System.out.println("ICICI Amount debited  ");
        System.out.println(" : " + amount + " balance availble : " + balance);
    }
    @Override
    void checkBal() {
        System.out.println("ICICI Balance : " + balance);
    }

}
