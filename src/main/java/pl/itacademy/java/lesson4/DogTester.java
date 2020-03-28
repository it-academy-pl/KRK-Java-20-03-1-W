package pl.itacademy.java.lesson4;

public class DogTester {
    public static void main(String[] args) {
        Dog spike = new Dog("Spike");
        Dog killer = new Dog("Killer");

        spike.bark();
        killer.bark();
        spike.bark();

        spike.feed("Meat");
    }
}
