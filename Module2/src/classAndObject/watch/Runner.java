package classAndObject.watch;

public class Runner {
    public static void main(String[] args) {
        Watch w1 = new Watch();

        w1.brand = "Titin";
        w1.model = "ST-005";
        w1.type = "analog";
        w1.price = 18000;

        //classAndObject.watch.Watch@5f184fc6
        System.out.println(w1); // this will return UID (unique identification number )
        System.out.println(w1.brand + " " + w1.price + " " + w1.type + " " + w1.model);
        Watch w2 = new Watch();
        w2.brand = "Rolex";
        w2.model = "RX-7850";
        w2.price = 75000;
        w2.type = "Analog";
        System.out.println(w2.brand + " " + w2.price + " " + w2.type + " " + w2.model);
        // if we dont asign the values will be default according to datatype
    }
}
