package org.jspider.strings;

public class LastIndexOf {
    static void main(String[] args) {

        // works same as indexOf() but the change is it execute from right to left i.e returns the last index of the character

        String str = "Developer " ;

        System.out.println(str.lastIndexOf('D'));
        System.out.println(str.lastIndexOf('r'));
        System.out.println(str.lastIndexOf('a'));  // returns -1 of the character is  not present in the string

        int x  = str.lastIndexOf('e') ;                 // last occurance
        int y = str.lastIndexOf('e' , x -1)  ; // Last second occurance
        int z = str.lastIndexOf('e' ,  y-1)  ; // last third occurance
        System.out.println("first occ of e : " +  x  + " Second occ of e :  " + y + " Third occ of z " +  z);
    }
}
