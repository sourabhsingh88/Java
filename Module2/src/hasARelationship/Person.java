package hasARelationship;

public class Person {
    String name , dob ; char gender ; Address location ;

    public Person(String name, String dob, char gender, Address location) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.location = location;
    }

    void personDetails() {
        System.out.println(name + " " + dob + " " + gender + " "  );
        location.addressDetails() ;
    }
}
