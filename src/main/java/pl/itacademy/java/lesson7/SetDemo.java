package pl.itacademy.java.lesson7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", "Red");
        Flower tulip = new Flower("Tulip", "Yellow");

        Set<Flower> flowers = new HashSet<>();
        flowers.add(rose);
        flowers.add(tulip);

        System.out.println(flowers);

        Set<Flower> linkedFlowers = new LinkedHashSet<>();
        linkedFlowers.add(rose);
        linkedFlowers.add(tulip);
        linkedFlowers.add(rose);

        System.out.println(linkedFlowers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(-1);
        System.out.println(numbers);

        System.out.println(numbers.ceiling(6));
        System.out.println(numbers.floor(6));
        System.out.println(numbers.tailSet(2, false));
        System.out.println(numbers.headSet(2, true));
        System.out.println(numbers.first());
        System.out.println(numbers.last());
    }
}
