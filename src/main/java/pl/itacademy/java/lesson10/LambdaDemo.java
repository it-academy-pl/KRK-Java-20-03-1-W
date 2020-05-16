package pl.itacademy.java.lesson10;

import java.time.LocalDate;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski",
                LocalDate.of(1990, 1, 1));

        Person ola = new Person("Ola", "Nowak",
                LocalDate.of(2010, 2, 2));

        boolean checkResult = checkPerson(jan, new AgeChecker());
        System.out.println(checkResult);

        checkResult = checkPerson(ola, new AgeChecker());
        System.out.println(checkResult);

        PersonChecker checker = new PersonChecker() {
            @Override
            public boolean check(Person person) {
                return person.getBirthDay()
                        .isBefore(LocalDate.now().minusYears(18));
            }
        };
        checkResult = checkPerson(jan, checker);
        System.out.println(checkResult);

        checkResult = checkPerson(jan, new PersonChecker() {
            @Override
            public boolean check(Person person) {
                return person.getBirthDay()
                        .isBefore(LocalDate.now().minusYears(18));
            }
        });
        System.out.println(checkResult);

        checkResult = checkPerson(jan, (Person person) -> {
            return person.getBirthDay()
                    .isBefore(LocalDate.now().minusYears(18));
        });
        System.out.println(checkResult);

        checkResult = checkPerson(ola, (person) -> {
            return person.getBirthDay()
                    .isBefore(LocalDate.now().minusYears(18));
        });
        System.out.println(checkResult);

        checkResult = checkPerson(ola, person -> {
            return person.getBirthDay().isBefore(LocalDate.now().minusYears(18));
        });
        System.out.println(checkResult);

        checkResult = checkPerson(jan, person -> person.getBirthDay().isBefore(LocalDate.now().minusYears(18)));
        System.out.println(checkResult);

        checkResult = checkPerson(jan, person -> person.getBirthDay().isBefore(LocalDate.now().minusYears(21)));
        System.out.println(checkResult);

        checkResult = checkPerson(jan, person -> person.getLastName().charAt(0) == 'N');
        System.out.println(checkResult);
        checkResult = checkPerson(ola, person -> person.getLastName().charAt(0) == 'N');
        System.out.println(checkResult);

        String fullName = getTextFromPerson(jan, p -> p.getLastName() + ", " + p.getFirstName());
        System.out.println(fullName);

        String lastName = getTextFromPerson(ola, p -> p.getLastName());
        System.out.println(lastName);

        lastName = getTextFromPerson(jan, Person::getLastName);
        System.out.println(lastName);

        String firstName = getTextFromPerson(ola, Person::getFirstName);
        System.out.println(firstName);

        Person createdPerson = createPerson(() -> new Person("Andrzej", "Duda", LocalDate.now()));
        System.out.println(createdPerson);

        createdPerson = createPerson(() -> new Person());
        System.out.println(createdPerson);

        createdPerson = createPerson(Person::new);
        System.out.println(createdPerson);

        createdPerson = clonePerson(jan, (fn, ln, bd) -> new Person(fn, ln, bd));
        System.out.println(createdPerson);

        createdPerson = clonePerson(jan, Person::new);
        System.out.println(createdPerson);


        checkResult = testPerson(jan, person -> person.getBirthDay().isBefore(LocalDate.now().minusYears(18)));
        System.out.println(checkResult);

        checkResult = checkValue(1.0, v -> v > 0);
        System.out.println(checkResult);

        createdPerson = createWithSupplier(() -> new Person("Andrzej", "Duda", LocalDate.now()));
        System.out.println(createdPerson);

        fullName = extractTextFromPerson(jan, p -> p.getLastName() + ", " + p.getFirstName());
        System.out.println(fullName);
    }

    private static boolean checkPerson(Person person, PersonChecker checker) {
        return checker.check(person);
    }

    private static boolean testPerson(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    private static boolean checkValue(double value, DoublePredicate predicate) {
        return predicate.test(value);
    }

    private static String getTextFromPerson(Person person, PersonTextExtractor extractor) {
        return extractor.extractText(person);
    }

    private static String extractTextFromPerson(Person person, Function<Person, String> extractor) {
        return extractor.apply(person);
    }

    private static Person createPerson(PersonCreator creator) {
        return creator.create();
    }

    private static Person createWithSupplier(Supplier<Person> supplier) {
        return supplier.get();
    }

    private static Person clonePerson(Person toClone, NonDefaultPersonCreator creator) {
        return creator.create(toClone.getFirstName(),
                toClone.getLastName(),
                toClone.getBirthDay());
    }
}
