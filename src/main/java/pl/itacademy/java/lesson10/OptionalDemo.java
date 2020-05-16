package pl.itacademy.java.lesson10;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", LocalDate.of(2010, 1, 1));
        Person p2 = new Person("Ola", "Nowak", LocalDate.of(2012, 1, 1));
        Person p3 = new Person("Magda", "Duda", LocalDate.of(2013, 1, 1));
        Person p4 = new Person("Marcin", "Sereda", LocalDate.of(2011, 1, 1));
        Person p5 = new Person("Asia", "Trump", LocalDate.now());
        Person p6 = new Person("Kuba", "Balamut", LocalDate.now());

        List<Person> people = List.of(p1, p2, p3, p4, p5, p6);

//        Person found = find(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)));
//        if(found != null) {
//            System.out.println(found.getFirstName());
//        }

        Optional<Person> optionalPerson = optionalFind(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)));
        if (optionalPerson.isPresent()) {
            System.out.println(optionalPerson.get());
        }

        Person person = optionalFind(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)))
                .orElse(new Person("A", "B", LocalDate.now()));
        System.out.println(person.getFirstName());


        person = optionalFind(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)))
                .orElseGet(() -> new Person("A", "B", LocalDate.now()));
        System.out.println(person.getFirstName());


        String firstName = optionalFind(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)))
                .map(p -> p.getFirstName())
                .orElseGet(() -> "Default First Name");
        System.out.println(firstName);

        firstName = optionalFind(people, p -> p.getBirthDay().isBefore(LocalDate.now().minusYears(18)))
                .map(p -> p.getFirstName())
                .orElseThrow(() -> new RuntimeException("Person not found!!"));

    }

    private static Person find(Collection<Person> people, Predicate<Person> criteria) {
        for (Person person : people) {
            if (criteria.test(person)) {
                return person;
            }
        }
        return null;
    }

    private static Optional<Person> optionalFind(Collection<Person> people, Predicate<Person> criteria) {
        for (Person person : people) {
            if (criteria.test(person)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
