package strings;

// Return the char from the perticular index

public class CharAT {
    static void main(String[] args) {

//        used to access the string using the index value

        String str = "Developer";
        System.out.println(str.charAt(5)); // o
        System.out.println(str.charAt(2)); // v
        System.out.println(str.charAt(6)); // p
        System.out.println(str.charAt(12)); // StringIndexOutOfBoundsIndex
    }
}
