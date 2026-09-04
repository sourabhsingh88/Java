package constructors.thisKeyword;

public class Bike
{

    String model ;
    double price;
    Bike(String model , double price) {
//        attribue = parameter

        this.model = model ;
        this.price = price ;
    }
}

// we use this to refere the current class object it is completely optional we use this when the attribute name is same as parameter name
