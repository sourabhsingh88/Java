package org.jspider.methods.returnn;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(help());
    }
    static char check() {
        return 'A'  ;
    }
    static boolean help () {
        System.out.println("return value : " + check());
        return true ;
    }

}
