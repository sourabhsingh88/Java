package classAndObject.headphone;

public class Runner {
    public static void main(String[] args) {
        HeadPhone h1 = new HeadPhone() ;
        h1.name = "Boat" ; h1.price = 7850.25;
        h1.madeIn =  "USA" ;

        HeadPhone h2 = new HeadPhone() ;
        h2.name = "Hammer" ; h2.price= 1500 ;

        HeadPhone h3 = new HeadPhone() ;
        h3.name = "Noise" ; h3.price = 750.0;


        System.out.println("Done");
        h1.disp();
        h2.disp();
        h3.disp();
    }
}
