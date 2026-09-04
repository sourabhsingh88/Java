package encapsulation.record;


//write once read many times
//sir asked for constructor
public record User(String email, int age) {
    // this validation is optional
    // Compact Canonical Constructor (Validation & Normalization)
    public User {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invlid Email");
        }
        if (age <= 18) {
            throw new IllegalArgumentException("age must be greater or equal to then 18 ");
        }
        // Normalization: Reassigning the local parameter before auto-assignment
        email = email.toLowerCase().trim();
//        age = age ;
    }

    //example of canonical constructor
//    A true canonical constructor must match the record components identically in n
//    User(String email , int age) {
//
//        this.email = email;
//     this.age =age ;
//    }
}
/*

public record User(String email , int age) {
}
--The getter methods are generated as email() and age(), completely omitting the JavaBean get prefix.
-- Every field is implicitly private and final.
-- The record is immutable (write once during new User(...), read many times via user.email() and user.age()).
-- this internally contains conical constructor (conatins same parameter as of the attribute name  and also ge methods as age() not getAge() ;
*/


