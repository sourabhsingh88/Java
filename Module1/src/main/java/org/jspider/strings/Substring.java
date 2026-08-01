package org.jspider.strings;

public class Substring {
    static void main(String[] args) {
        String str = "Developer" ;
        String str1 = "0123456789" ;
        System.out.println(str.substring(0 , 5));
        System.out.println(str1.substring(0 , 5));

        System.out.println(str.substring(0 , 10));  // StringIndexOutOfBoundException
        System.out.println(str1.substring(0 , 10)); // StringIndexOutOfBoundException


        System.out.println(str.substring(1));
        System.out.println(str1.substring(1 ));

        //ending index is not included
    }
}
