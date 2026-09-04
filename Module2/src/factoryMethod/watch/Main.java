package factoryMethod.watch;


public class Main {
    public static void main(String[] args) {
        Watch w1 = WatchFactory.getWatch("fastrack");

        if (w1 != null) {
            if (w1 instanceof Titan) {
                Titan t = (Titan) w1;
                t.titanDetails();
            } else if (w1 instanceof Fastrack) {
                Fastrack f = (Fastrack) w1;
                f.fastrackDetails();
            }
        }
    }
}
