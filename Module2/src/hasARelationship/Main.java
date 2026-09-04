package hasARelationship;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Parsiddhi silks , 2nd main" , "BTM stage 2 " , 560076 , "Banglore "  , "Karnataka");
        Person p1 = new Person("Rahul" , "02-02-2026" , 'M' , a1);
        p1.personDetails();
    }
}
