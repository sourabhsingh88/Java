package methodOverloading.payment;

public class Flipcart {
    void payment() {
        System.out.println("COD");
    }
    void payment(String upiId , int pin ) {
        System.out.println("UPI");
    }
    void payment(String cusId , String pwd) {
        System.out.println("NetBanking-1");
    }
    void payment(int cusId , String pwd) {
        System.out.println("Netbanking-2");
    }
    void payment(String name  , long cardNo , int cvv , String expDate) {
        System.out.println("Debit / Credit Card");
    }

}
