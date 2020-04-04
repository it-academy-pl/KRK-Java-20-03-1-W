package pl.itacademy.java.lesson5;

public class Fish extends Animal implements Swimable {
    @Override
    public void move() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
