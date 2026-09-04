package methods;

public class MethodsCallFromOtherMethod {
    static void test() {
        System.out.println("help starts ");
        disp() ;
        System.out.println("help ends ");
    }
    static void disp() {
        System.out.println("disp starts ");

        System.out.println("disp ends");
    }
    public static void main(String[] args) {
        System.out.println("Main method starts");
        disp();
        System.out.println("Main method ends");
    }
}
