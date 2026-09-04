package strings;

public class Length {
    static void main(String[] args) {
        String str = "Java";
        // .length() is used to find the number of character  from the string it will include blanck space and symbole every thing inside " double quote"
        int len = str.length();
        System.out.println(len); // 4
        String s2 = "Java_SE26";
        System.out.println(s2.length());
        String s3 = "Java Full Stack";
        System.out.println(s3.length());
    }
}
