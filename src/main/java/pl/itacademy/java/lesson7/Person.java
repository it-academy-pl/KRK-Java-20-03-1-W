package pl.itacademy.java.lesson7;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private boolean pregnant = false;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    @Override
    public int compareTo(Person another) {
        if (this.name.equals("Andrzej Duda")) {
            return Integer.MIN_VALUE;
        }
        if (another.name.equals("Andrzej Duda")) {
            return Integer.MAX_VALUE;
        }
        if (this.pregnant && another.pregnant) {
            return 0;
        }
        if (!this.pregnant && another.pregnant) {
            return 1;
        }
        return -1;
    }
}
