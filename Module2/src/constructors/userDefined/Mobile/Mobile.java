package constructors.userDefined.Mobile;

public class Mobile {
    String model ;
    double price ;

//    if we will take same paramantre as attribute then it will take deault values due to ambiguity
    Mobile(String m , double p) {
        model = m ;
        price = p ;
    }

    void disp() {
        System.out.println("model : " + model + " price : " + price);
    }
}
