package Interface.Multple;

public class Main {
    public static void main(String[] args) {
        Instagram i1 = new Instagram() ;
        i1.creataePost();
        i1.deletePost();

        Facebook f1 = new Facebook() ;
        f1.creataePost();
        f1.deletePost();
    }
}
