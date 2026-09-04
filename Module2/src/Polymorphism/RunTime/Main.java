package Polymorphism.RunTime;


// run time polymorphism is achieved thrpoug method overriddgn with respect to this program the method binding is done by jvm based on object during runtime
//  and hence its is runtime polymorphism / late binding
//change in object will lead to chnage in method binding there also called as dynamic binding or dynamic method dispacter

public class Main {
    public static void main(String[] args) {
        Car1 c = CarFactory1.getCar("safari1");
        if (c != null) {
            c.topSpeed();
        }
    }
}

class Car1 {
     void topSpeed() {
        System.out.println("Car 100 - 120 KMPH");
    }
}

class Fortuner1 extends Car1 {
     void topSpeed() {
        System.out.println("Car 120 - 140 KMPH");
    }
}

class Safari1 extends Car1 {

     void topSpeed() {
        System.out.println("Car 190 - 220 KMPH");
    }
}

class CarFactory1 {
    static Car1 getCar(String input) {
        if (input.equalsIgnoreCase("safari1")) return new Safari1();
        else if (input.equalsIgnoreCase("fortuner1")) return new Fortuner1();
        else return null;
    }
}
