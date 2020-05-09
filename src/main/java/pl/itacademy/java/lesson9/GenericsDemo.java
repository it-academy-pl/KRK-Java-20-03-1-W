package pl.itacademy.java.lesson9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        //BEFORE JAVA 5
        List items = new ArrayList();
        items.add(5);
        items.add("text");
        items.add(true);
        for (Object item : items) {
            if (item instanceof Integer) {
                Integer intItem = (Integer) item;
                intItem += 5;
                System.out.println("Integer item: " + item);
            }
            if (item instanceof String) {
                System.out.println("String item: " + item);
            }
        }

        //JAVA 5 AND LATER
        List<String> list = new ArrayList<>();
        list.add("new Object()");
        list.add("test");
        for (String s : list) {
            System.out.println("Always String item: " + s);
        }


        System.out.println(UsefulTools.getByteValue(42));
        System.out.println(UsefulTools.getByteValue(42.1));
        System.out.println(UsefulTools.getByteValue(BigDecimal.valueOf(123.45)));

        List<String> strings = List.of("one", "two", "three");
        List<Integer> nums = List.of(1, 2, 3);
        UsefulTools.printElements(strings);
        UsefulTools.printElements(nums);

        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        List<Number> numbers = List.of(1.1, 2.2, 3);
        System.out.println(UsefulTools.sum(nums));
        System.out.println(UsefulTools.sum(doubles));
        System.out.println(UsefulTools.sum(numbers));

        List<Number> ints = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        UsefulTools.fillList(ints, 1, 2, 3, 4, 5);
        UsefulTools.fillList(objects, 6, 7, 8, 9, 10);

        System.out.println(ints);
        System.out.println(objects);
    }
}
