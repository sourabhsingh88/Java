package generalisation.watch;

public class Titan extends Watch {

    Titan(String m, String c, double p) {
        super(m, c, p);
    }

    void display() {
//        System.out.println("Tital Displays");
        super.display();
    }
    void titanDetails() {
//        System.out.println("TitanDetails");
        System.out.println(model + " " + color + " " + price);
    }
}
