package specilization.watch;

public class Sonata extends Watch {

    Sonata(String m , String c, double p ){
        super(m,c,p) ;
    }
    void display() {
//        System.out.println("Sonata Display");
        super.display() ;
    }
    void sonataDetails() {
//        System.out.println("SonataDetails");
        System.out.println(model + " " + color + " " + price);
    }
}


