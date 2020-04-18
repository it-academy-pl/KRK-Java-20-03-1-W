package pl.itacademy.java.lesson6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println(numbers.get(1));

        numbers.add(1, 20);
        System.out.println(numbers);

        numbers.set(1, 30);
        System.out.println(numbers);

        numbers.remove(0);
        System.out.println(numbers);

        List<Integer> anotherList = List.of(5, 10, 40, 100);
        System.out.println(anotherList);
        numbers.removeAll(anotherList);
        System.out.println(numbers);

        numbers.add(0, 20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(50);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println("Index of 30: " + numbers.indexOf(30));
        System.out.println("Index of last 30: " + numbers.lastIndexOf(30));
        System.out.println("Number contains 100? : " + numbers.contains(100));
        System.out.println("Number contains 50? : " + numbers.contains(50));

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        System.out.println(numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers);
    }
}
