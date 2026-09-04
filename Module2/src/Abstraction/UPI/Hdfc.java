package Abstraction.UPI;

public class Hdfc extends  Upi{

    int balance = 0;
    String name ;

    void deposit(int amount) {
        balance =  balance + amount ;
        System.out.println("HDFC Amount Credited");
        System.out.println("New Balance  : " + balance);
    }
    @Override
    void send(int amount) {
        if (amount <= balance) {
            balance = balance - amount ;
        }
        System.out.println("HDFC Amount debited  ");
        System.out.println(" : " + amount + " balance availble : " + balance);
    }
    @Override
    void checkBal() {
        System.out.println("HDFC Balance : " + balance);
    }
}
