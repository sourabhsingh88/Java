package methods.passingAndReturning;

public class Adition {
    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.7, 10.5));

        System.out.println(sub(7, 10));
        System.out.println(sub(10.7, 5));
    }

    public static double add(double a, double b) {
        double sum = a + b;

        return sum;
    }

    public static double sub(double a, double b) {
        double res = a - b;
        return res;
    }


}
