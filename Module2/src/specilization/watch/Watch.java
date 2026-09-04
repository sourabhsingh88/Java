package specilization.watch;

public class Watch {
    String model , color ; double price ;

    public Watch(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    void display() {
        System.out.println(model + " " + color + " " + price);
    }
}
