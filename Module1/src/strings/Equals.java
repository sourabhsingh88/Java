package strings;

public class Equals {
    static void main(String[] args) {
        String str = "j2ee" ;

        System.out.println(str.equals("j2ee")); // true
        System.out.println(str.equals("J2ee")); // false as equals is case sensitive

    }
}
