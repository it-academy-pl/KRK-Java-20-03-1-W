package pl.itacademy.java.lesson4;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says WOOF-WOOF!!");
    }

    public void feed(String mealName) {
        System.out.println(name + " eats " + mealName);
    }

}
