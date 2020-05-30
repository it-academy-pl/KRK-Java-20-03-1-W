package pl.itacademy.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.setSecurityManager(new SecurityManager());
        //or add VM argument: -Djava.security.manager

        Address krakow = new Address("Kraków");
        Address wroclaw = new Address("Wrocław");
        Address katowice = new Address("Katowice");

        Person jan = new Person("Jan", "Kowalski", krakow);
        Person michal = new Person("Michał", "Nowak", wroclaw);
        Person andrzej = new Person("Andrzej", "Duda", katowice);
        Student olga = new Student("Olga", "Matejko", krakow, "Java Fundamentals");

        System.out.printf("Andrzej's hashCode(): %s%n", andrzej.hashCode());

        Map<Person, String> beerLovers = new HashMap<>();
        beerLovers.put(jan, "ciemne");
        beerLovers.put(michal, "jasne");
        beerLovers.put(andrzej, "bezalkoholowe");
        //beerLovers.put(olga, "ipa");

        System.out.println(beerLovers);

        System.out.printf("Person %s, like's beer %s%n", andrzej, beerLovers.get(andrzej));
        System.out.printf("Person %s, like's beer %s%n", jan, beerLovers.get(jan));

        System.out.println("========================================");
        //andrzej.setAddress(krakow);
        andrzej.getAddress().setCity("Katowice Forewer!");
        katowice.setCity("Katowice Forewer!");
        System.out.printf("Andrzej's hashCode(): %s%n", andrzej.hashCode());
        System.out.println(beerLovers);
        System.out.println("........................................");
        System.out.printf("Person %s, like's beer %s%n", andrzej, beerLovers.get(andrzej));
        System.out.printf("Person %s, like's beer %s%n", jan, beerLovers.get(jan));

        System.out.println("========================================");
        beerLovers.put(andrzej, "ciemne");
        beerLovers.put(jan, "jasne");
        System.out.println(beerLovers);

        System.out.println("========================================");
        olga.setCourse("Java Advanced");
        System.out.printf("Person %s, like's beer %s%n", olga, beerLovers.get(olga));

//        System.out.println("========================================");
//        Field lastNameField = andrzej.getClass().getDeclaredField("lastName");
//        lastNameField.setAccessible(true);
//        lastNameField.set(andrzej, "Kowalski");
//
//        System.out.println(beerLovers);
//        System.out.printf("Person %s, like's beer %s%n", andrzej, beerLovers.get(andrzej));

        System.out.println("========================================");
        List<Beer> menu = new ArrayList<>(List.of(new Beer("jasne"), new Beer("ciemne")));
        BeerMenu beerMenu = new BeerMenu(menu);
        System.out.println(beerMenu.hashCode());
        menu.add(new Beer("bezalkoholowe"));
        System.out.println(beerMenu.hashCode());
//        beerMenu.getMenu().add(new Beer("ipa"));
//        System.out.println(beerMenu.hashCode());
        Beer beer = beerMenu.getMenu().get(0);
        beer.setName("Kraftowe");
        System.out.println(beerMenu.hashCode());
    }
}
