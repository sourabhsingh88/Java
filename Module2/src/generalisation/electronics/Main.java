package generalisation.electronics;

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Pixel 9", "White", 90200);
        Mobile m2 = new Mobile("Redmi 15", "Dimond", 52300);
        Mobile m3 = new Mobile("Oneplus 15R", "Pink", 60200);
        Mobile m4 = new Mobile("Vivo", "White", 45200);
        Mobile m5 = new Mobile("Vivo X200", "White", 145200);
        Mobile m6 = new Mobile("Iphone 16", "White", 65200);
        Laptop l1 = new Laptop("Hp pavallion", "Silver", 72000);
        Laptop l2 = new Laptop("dell Insp ", "Balck", 90000);
        Laptop l3 = new Laptop("Lenovo Yoga", "Gray", 85000);

        Eletronics ele[] = {m1, m2, m3, m4, m5, m6, l1, l2, l3}; // Generalizating (up-casting)
//    Generalizstion is process of adding all elemeent of child class in to a single container

        System.out.println("===================All Together =============");
        for (int i = 0; i < ele.length; i++) {
            ele[i].disp();
        }

        System.out.println("===================Only Mobile =============");
        for (int i = 0; i < ele.length; i++) {
//            if (ele[i].getClass() == Mobile.class ) {
            if (ele[i] instanceof Mobile) {
                ele[i].disp();

            }
        }
        System.out.println("===================Only Laptop =============");
        for (int i = 0; i < ele.length; i++) {
//            if (ele[i].getClass() == Laptop.class ) {
//            instanceOf = object of
            if (ele[i] instanceof Laptop) {
                ele[i].disp();
            }
        }
    }

}