package org.jspider.strings;

public class IndexOf {
    static void main(String[] args) {
        String str = "Unknown";
        System.out.println(str.indexOf('U'));
        System.out.println(str.indexOf('n'));
        System.out.println(str.indexOf('k'));
        System.out.println(str.indexOf('a'));       // If not available it will return -1
        int a = str.indexOf('a');                 // first occurance
        int b  = str.indexOf('a' + a+1)  ;       //  Used to find the second occurance
        int c  = str.indexOf('a' + b+1) ;       //  Used to find the thirsd occurance
    }
}
