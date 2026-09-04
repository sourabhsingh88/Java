package constructors.userDefined.laptop;

public class Laptop {
    String model , color ,processor ;
    int ram , ssd ;
    double price ;

    Laptop(String  m , String c , String p , int r , int s , double pr ) {
        model = m ; color = c ; processor = p ; ram = r ; ssd =s  ; price = pr ;
    }
    void disp() {
        System.out.println("Model : " + model + " Color : " + color  + "  Processor : " + processor + "Ram : " + ram + " SSD : " + ssd + "Price : " + price);
    }
}
