//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    public static void main(String ... args)
//public static final  void main(String... args)
    final public static void main(String... args) {
//        Integer a = 100, b = 100;
//        Integer c = 128, d = 128;
//        String e = new String( "name" ) ; String f = new String ("name") ;
//        String a = "name" ; String b = "name" ;
//        System.out.println(e.equals(f));
//        System.out.println(c == d);

//        int a=10 , b = 10 ;
//        System.out.println(a);

//        byte b = 10;
//        b = b + 1; error cant covert to int
//        b += 1; // performs implicit convertsion  b = (byte)(b + 1)


//        System.out.println(true ? 1 : 2.0); // 1.0  convert to dominant type double//

        int a = 011;
//    Java treats an integer literal starting with 0 as octal (base 8), so 011 = 1×8 + 1 = 9.
//    Octal uses only these digits:
//Decimal: No prefix → Base 10 → 11 = 11
//Octal: Starts with 0 → Base 8 → 011 = 9
//Binary: Starts with 0b/0B → Base 2 → 0b11 = 3
//Hexadecimal: Starts with 0x/0X → Base 16 → 0x11 = 17
//0 1 2 3 4 5 6 7
//    0   1   1
//    │   │   │
//    8²  8¹  8⁰
//    011₈
//= (0 × 8²) + (1 × 8¹) + (1 × 8⁰)
//= (0 × 64) + (1 × 8) + (1 × 1)
//= 0 + 8 + 1
//        = 9

        //, any integer literal that starts with a leading 0
        // (and is not hexadecimal 0x) is parsed as an Octal (Base-8) number.
        // $010_8 = (0 \times 8^2) + (1 \times 8^1) + (0 \times 8^0) = 8_{10}$.
        System.out.println(a);

//    System.out.println('A' + 'B'); // 113
//    int a = 11;      // Decimal (base 10)
//    int b = 011;     // Octal   (base 8)
//    int c = 0x11;    // Hex     (base 16)
//    int d = 0b11;    // Binary  (base 2)

//    0 → Octal
//    0b / 0B → Binary
//    0x / 0X → Hexadecimal
//    No prefix → Decimal
    }
}
