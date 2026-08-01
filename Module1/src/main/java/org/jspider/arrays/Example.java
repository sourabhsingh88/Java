package org.jspider.arrays;

public class Example {
    public static void main(String[] args) {
        String bike[];
        bike = new String[4];
        bike[0] = "DUKE";
        bike[1] = "Splendor";
        bike[3] = "Z900";
        int size = bike.length;
        int lastIndex = bike.length - 1;
        System.out.println(bike[0]);
        System.out.println(bike[1]);
        System.out.println(bike[2]);
        System.out.println(bike[3]);

    }
}
