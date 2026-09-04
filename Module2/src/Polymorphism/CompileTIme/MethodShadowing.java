package Polymorphism.CompileTIme;


// method binding is done based on reference type not object so change in object  will not lead in change in method binding
//hence it is static binding or method shadowinf


public class MethodShadowing {
    public static void main(String[] args) {
        Car c = CarFactory.getCar("safari");
        if (c != null) {
            c.topSpeed();
        }
    }
}

class Car {
    static void topSpeed() {
        System.out.println("Car 100 - 120 KMPH");
    }
}

class Fortuner extends Car {
    static void topSpeed() {
        System.out.println("Car 120 - 140 KMPH");
    }
}

class Safari extends Car {
    static void topSpeed() {
        System.out.println("Car 190 - 220 KMPH");
    }
}

class CarFactory {
    static Car getCar(String input) {
        if (input.equalsIgnoreCase("safari")) return new Safari();
        else if (input.equalsIgnoreCase("fortuner")) return new Fortuner();
        else return null;
    }
}
