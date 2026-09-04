package encapsulation.record;

public class main {
    public static void main(String ... args) {
        User u1 = new User("sourabh", 21);
        System.out.println(u1.age()) ;  // get age methods internalll in record as age()  only
        System.out.println(u1.email());
    }
}
