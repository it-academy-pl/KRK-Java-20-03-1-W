package pl.itacademy.java.lesson5;

public class Duck extends Animal implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void move() {
        fly();
    }
}
