package methodOverriding.FatherSon;

public class Father {
    //    int money= 97855 ;
//    String car = "Rolls-Royce" ;
//    String girlfriend = "Mastani" ;
    void drink() {
        System.out.println("Coffee");
    }
}

class Son extends Father {
    //    String girlfriend = "Rose" ;
//    String car = "BMW" ;
    @Override
    void drink() {
        System.out.println("Old-Monk");
    }

//    void longRide() {
//        System.out.println("long ride with " + super.girlfriend +  " and " +  girlfriend);
//        System.out.println("in the car " + car);
//    }
}

class Daughter extends Father {

    @Override
    void drink() {
        System.out.println("Horlics");
    }
}
