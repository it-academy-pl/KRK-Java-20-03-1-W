package pl.itacademy.java.lesson5;

public abstract class Animal {
    private String name;
    private boolean hungry;

    private MakeSoundBehaviour soundBehaviour;

    public Animal(String name, MakeSoundBehaviour soundBehaviour) {
        this.name = name;
        this.hungry = true;
        this.soundBehaviour = soundBehaviour;
    }

    public Animal() {
        this("", new NoSoundBehaviour());
    }

    public void makeSound() {
        soundBehaviour.makeSound();
    }

    public void eat(String food) {
        if (hungry) {
            System.out.println(name + " eats " + food);
            hungry = false;
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    protected void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void sleep(int hours) {
        System.out.println(name + " sleep " + hours + " hours");
        hungry = true;
    }

    public abstract void move();
}
