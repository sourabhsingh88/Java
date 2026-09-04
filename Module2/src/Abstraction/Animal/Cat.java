package Abstraction.Animal;

public class Cat extends Animal {


    @Override
    void eat() {
        System.out.println("cat eating");
    }

    @Override
    void sound() {
        System.out.println("cat making sound ");

    }

    @Override
    void lifespan() {
        System.out.println("cat 10 years");

    }

}
