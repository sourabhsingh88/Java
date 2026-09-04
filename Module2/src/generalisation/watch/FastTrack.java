package generalisation.watch;

public class FastTrack extends Watch{

    FastTrack(String m , String c, double p ){
        super(m,c,p) ;
    }
    void display() {
//        System.out.println("Fasttrack Disply");
        super.display() ;
    }
    void fasttrackDetails() {
//        System.out.println("FastTrack Details");
        System.out.println(model + " " + color + " " + price);
    }


}
