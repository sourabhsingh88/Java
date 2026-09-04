package factoryMethod.watch;

public class Fastrack extends Watch {
    public Fastrack(String s, String c, double p) {
        super(s, c , p);
    }

    public void fastrackDetails() {
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }
}
