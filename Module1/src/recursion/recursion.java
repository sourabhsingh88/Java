package recursion;

public class recursion {
    static void main() {
        play(); ;
    }

    // Recursion with diff methods said to be method chaining
//    static void test() {
//        System.out.println("test");
//        disp();
//    }
//    static void disp() {
//        System.out.println("disp");
//        test();
//    }

    // Self Recursion
    static void play() {
        System.out.println("play");
        play();
    }
}
