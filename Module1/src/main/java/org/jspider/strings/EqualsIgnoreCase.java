package org.jspider.strings;

public class EqualsIgnoreCase {
    static void main(String[] args) {
        String str = "j2ee" ;
        System.out.println(str.equalsIgnoreCase("j2ee")); // true
        System.out.println(str.equalsIgnoreCase("J2ee")); // true
        System.out.println(str.equalsIgnoreCase("B2ee")); // true
    }
}
