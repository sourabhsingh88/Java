package org.jspider.strings;

public class ToCharArray {
    static void main(String[] args) {
        String str = "Tiger";
        char ch [] = str.toCharArray() ;
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}

//to char method will internall create  a equivelent character  array based on the charcters present in the current string value

// it will not convert string into str , the string will remain as string