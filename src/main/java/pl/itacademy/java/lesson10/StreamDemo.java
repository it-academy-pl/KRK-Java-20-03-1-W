package pl.itacademy.java.lesson10;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", LocalDate.now());
        Person p2 = new Person("Ola", "Nowak", LocalDate.now());
        Person p3 = new Person("Magda", "Duda", LocalDate.now());
        Person p4 = new Person("Marcin", "Sereda", LocalDate.now());
        Person p5 = new Person("Asia", "Trump", LocalDate.now());
        Person p6 = new Person("Kuba", "Balamut", LocalDate.now());

        List<Person> people = List.of(p1, p2, p3, p4, p5, p6);

        List<Integer> persons = people.stream()
                .peek(p -> System.out.println(p))
                .filter(p -> p.getFirstName().contains("i")) // stream of Person
                .peek(p -> System.out.println(p))
                .map(p -> p.getLastName()) // stream of String
                .peek(s -> System.out.println(s))
                .map(s -> s.length()) // stream of Integer
                .collect(Collectors.toList());

        System.out.println(persons);

        Optional<Integer> max = people.stream()
                .filter(p -> p.getLastName().contains("qq"))
                .peek(System.out::println)
                .map(p -> p.getFirstName())
                .peek(System.out::println)
                .map(firstName -> firstName.length())
                .peek(System.out::println)
                .max(Comparator.naturalOrder());

        System.out.println(max);

        people.stream()
                .filter(person -> person.getFirstName().contains("n"))
                .forEach(person -> System.out.println(person.getFirstName()));

//        Stream<Person> stream = people.stream();
//        List<LocalDate> dates = stream
//                .map(p -> p.getBirthDay())
//                .collect(Collectors.toList());
//
//        stream.forEach(System.out::println);

    }


}
