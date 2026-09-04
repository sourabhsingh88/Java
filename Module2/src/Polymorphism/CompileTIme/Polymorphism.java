package Polymorphism.CompileTIme;

public class Polymorphism {
    public static void main(String[] args) {
        Instagram.login("Email" , "12345admin");
        Instagram.login(975582629 , "12345admin");

    }
}
/*
in this program the method binding is done by compiler based on parameters and signatue this takes place while compilation so
it is said o compile time polymorphism
early binding overloading
 */
class Instagram{

    static void login (String email , String pwd){
        System.out.println("Email Login");
    }

    static  void login(long num , String pwd) {
        System.out.println("Phone Login");
    }
}
