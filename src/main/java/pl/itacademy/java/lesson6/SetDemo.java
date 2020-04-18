package pl.itacademy.java.lesson6;

import pl.itacademy.java.lesson5.Cat;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");
        System.out.println(strings);
        strings.add("fifth");
        System.out.println(strings);
        strings.add("first");
        System.out.println(strings);

        System.out.println(strings.contains("second"));

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Tom"));
        cats.add(new Cat("Tom"));
        System.out.println(cats);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(-10);
        numbers.add(3);
        System.out.println(numbers);
    }
}
