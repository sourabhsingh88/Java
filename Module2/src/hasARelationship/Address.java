package hasARelationship;

public class Address {
    String stree ;
    String area ;
    int pinCode ;
    String city ; String state ;

    public Address(String stree, String area, int pinCode, String city, String state) {
        this.stree = stree;
        this.area = area;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    void addressDetails() {
        System.out.println(stree + " " + area + " " + pinCode + " " + city + " " + state );
    }
}
