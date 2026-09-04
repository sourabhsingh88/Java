package Abstraction.Animal;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("dog eating");
    }

    @Override
    void sound() {
        System.out.println("dog making sound ");

    }

    @Override
    void lifespan() {
        System.out.println("dog 15 years");

    }
}
