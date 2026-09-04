package inheritance.ConstructorChaining.Person;

public class Person {
    String name ;
    String dob ;
    char gender ;

    Person(String name  , String dob , char gender) {
        this.name = name ;
        this.dob = dob ;
        this.gender = gender ;
    }

    void disp() {
        System.out.println("Name = " + name );
        System.out.println("Dob = " + dob );
        System.out.println("Gender = " + gender );
    }
}
