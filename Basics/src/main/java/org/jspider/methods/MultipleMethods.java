package org.jspider.methods;

public class MultipleMethods {
    static void help() {
        System.out.println("Executing Help() ... ");
    }
    static void disp() {
        System.out.println("Executing disp() ... ");
    }
    static void push() {
        System.out.println("Executing push() ... ");
    }

    public static void main(String args[]) {
        push();
        help();
        disp();

    }
}
