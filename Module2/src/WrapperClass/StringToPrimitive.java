package WrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {
//        Byte =>
        String s1 = "10" ;
        String s2 = "123" ;
        System.out.println(s1 + s2 );  //10123 now we need to do conversion

        int i1 = Integer.parseInt(s1) ;
        int i2 = Integer.parseInt(s2) ;
        System.out.println(i1 + i2); // 133
        int i3 =Integer.parseInt("abhi") ; // number formatException
        // pareseBoolean will not throw any exception if true then true else always false
    }
}
