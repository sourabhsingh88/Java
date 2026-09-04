package WrapperClass;

public class Main {
    public static void main(String[] args) {
        byte b = 10 ;
//        Byte b1 = new Byte(b) ; explicit conversion
        short s = 25 ;
//        Short s1 = new Short(s) ;
        int i = 34 ;
        long l = 123l;
        float f = 10.5f ;
        double d = 33.3 ;
        char c ='C' ;
        boolean z = true ;

        // we are able to store all toether due to autoboxing (wrapper class) we cant store primitive together
        Object x [] = {b , s , i ,l , f , c , z } ;

        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
        }
    }

}
