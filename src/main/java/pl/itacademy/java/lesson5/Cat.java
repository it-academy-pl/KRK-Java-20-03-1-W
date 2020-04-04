package pl.itacademy.java.lesson5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, new MakeMeuBehaviour());
        System.out.println("New cat has been born");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        this.setHungry(true);
    }

    @Override
    public void move() {
        System.out.println("Cat is walking around");
    }

    public void sleepAllTheDay() {
        System.out.println("Cat sleeping all the day out");
    }

}
