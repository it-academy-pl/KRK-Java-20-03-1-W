package pl.itacademy.java.lesson7;

import java.util.Objects;

public class Flower {
    private String name;
    private String colour;

    public Flower(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) &&
                Objects.equals(colour, flower.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour);
    }
}
