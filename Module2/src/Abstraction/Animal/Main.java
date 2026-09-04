package Abstraction.Animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.lifespan();
        c.sound();


        Dog d = new Dog();
        d.eat();
        d.lifespan();
        d.sound();
    }
}
