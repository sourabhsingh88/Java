package strings;

import java.util.Arrays;


// Split is used to cut a large string into smaller string values
//and also it create a array of string


public class Split {
    public static void main(String[] args) {
        String str = "i Am";
        String s = Arrays.toString(str.split(" "));
        String[] ch = str.split(" ");
        System.out.println(s); // [i, Am]

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
