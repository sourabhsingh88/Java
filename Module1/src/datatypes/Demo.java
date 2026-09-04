package datatypes;

public class Demo {
    public static void main(String [] args) {

        int radius = 7 ;
        double area =3.14  * ( radius * radius ) ;

        System.out.println("area of circle with radius " + radius + " is " + area) ;
    }

}

class Traingle {
    public static void main(String [] args) {

        int height = 7 ;
        int base =  7 ;

        double area = 0.5 * base * height ;

        System.out.println("Area of triangle with height " + height + " and base " + base + " is " + area) ;
    }
}

class Percentage {
    public static void main(String [] args) {

        int maths = 50 ;
        int phy = 70 ;
        int chem = 55  ;
        int optional = 90 ;
int total_marks = maths + phy + chem + optional ;
        float percent = (total_marks* 100.0f  ) / 400  ;
System.out.println("Your total marks are "  + total_marks + " and percentgae are " + percent);
//System.out.println(total_marks);
    }

}

class Apple {
    public static void main (String [] args ){

        int cost = 325 ;
        int quantity = 4;
        float weight = 0.275f ;

        double total_price = quantity * weight * cost ;
        System.out.println(total_price) ;


    }
}