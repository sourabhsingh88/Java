package org.jspider.arrays;

public class Test {
    public static void main(String[] args) {
        String watch[] = {"Titian", "Sonata", "Fasttract", "Fossil", "G-Shock"};
        int len = watch.length;
        for (int i = 0; i <= len - 1; i++) {
            System.out.println(watch[i]);
        }
        System.out.println("-------------------------");
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(watch[i]);

        }
    }
    }