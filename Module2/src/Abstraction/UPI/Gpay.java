package Abstraction.UPI;

public class Gpay {
    public static void main(String[] args) {
        Hdfc h1  = new Hdfc() ;
        h1.deposit(25000);
        h1.send(1000) ;
        h1.checkBal();

        System.out.println("+* +* +* + *+ *+*+ *+* +*+ *+ *+");

        Sbi s1  = new Sbi() ;
        s1.deposit(25000);
        s1.send(1000) ;
        s1.checkBal();

    }
}
