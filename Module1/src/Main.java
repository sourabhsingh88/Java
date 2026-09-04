public class Main {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("Java");
        try {
            System.out.println(100 / 0);
        }catch (Exception e) {
            System.out.println("Hye what are you doing ");
        }
        try {
            System.out.println(500 / 0);
        }catch (Exception e) {
            System.out.println("Hye what are you doing ");
        }
    }
}