package inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike() ;
        b1.model = "Duke" ;
        b1.price = 245000 ;
        b1.color = "Orange" ;

        Car c1 = new Car() ;
        c1.model = "City" ;
        c1.color= "White" ;
        c1.price = 154500 ;

        Truck t1 = new Truck() ;
        t1.color = "Black" ;
        t1.model = "Eicher" ;
        t1.price = 2000000 ;


        t1.disp() ; c1.disp(); ; b1.disp();
    }
}
