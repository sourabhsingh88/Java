package factoryMethod.watch;

public class Titan extends Watch {
    public Titan(String m , String c , double p) {
        super(m , c ,p);
    }

    public void titanDetails() {
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);

    }
}
