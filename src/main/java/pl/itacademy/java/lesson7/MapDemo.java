package pl.itacademy.java.lesson7;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Person> phoneBook = new HashMap<>();
        phoneBook.put(12345, new Person("Jan Kowalski"));
        phoneBook.put(4567, new Person("Asia Nowak"));

        System.out.println(phoneBook.get(4567));

        phoneBook.put(4567, new Person("Grazyna"));
        System.out.println(phoneBook.get(4567));
        System.out.println(phoneBook);

        phoneBook.remove(12345);
        System.out.println(phoneBook);

        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());
    }
}
