package org.jspider.methods;

public class Example {
    static void test () {
        System.out.println("Executing test()...");
    }

//    <access-modifier>  <modifier> return-type methodName (<arguments>) --> Methods Declaration
//    <Optional> al are optional inside <>
    public static void main(String[] args) {
        System.out.println("Program start");
        test();
        test();
        test();
        System.out.println("Program end");
    }
}



class Example1 {
    static void play() {
        System.out.println("Executing play()...");
    }

    //    <access-modifier>  <modifier> return-type methodName (<arguments>) --> Methods Declaration
//    <Optional> al are optional inside <>
    public static void main(String[] args) {
        System.out.println("Program start");
        play();
        play();
        play();
        System.out.println("Program end");
    }
}
