package generalisation.electronics;

public class Eletronics {
    String model , color ;
    double price ;

    public Eletronics(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    void disp() {
        System.out.println("Mode = " + model + " Color = " + color + " Price = " + price);
    }
}
