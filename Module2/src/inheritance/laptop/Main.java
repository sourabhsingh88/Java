package inheritance.laptop;

public class Main {
    public static void main(String[] args) {
        Hp h1 = new Hp("Pavilion", 75000, "Silver", "I7");
        Dell d1 = new Dell("Insporon", 85000, "Silver", "I7");
        Lenovo l1 = new Lenovo("Yoga", 65000, "Silver", "R5");

        h1.disp(); l1.disp(); d1.disp();
    }
}
