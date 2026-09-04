package methodOverloading.instagram;

public class Instagram {
    void login(String email , String pwd) {
        System.out.println("Email login");
    }
    void login(long num , String pwd) {
        System.out.println("Phone login");
    }
}
