package pl.itacademy.java.lesson7;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private String colour;

    @Override
    public int compareTo(Cat another) {
        int result = Integer.compare(this.age, another.age);
        if (result == 0) {
            result = this.colour.compareTo(another.colour);
        }
        if (result == 0) {
            result = this.name.compareTo(another.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }
}
