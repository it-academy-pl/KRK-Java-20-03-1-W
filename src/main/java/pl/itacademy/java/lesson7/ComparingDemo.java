package pl.itacademy.java.lesson7;

import java.util.*;

public class ComparingDemo {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<>();
        Cat tom = new Cat("Tom", 3, "black");
        cats.add(tom);
        Cat rudolf = new Cat("Rudolf", 5, "brown");
        cats.add(rudolf);
        Cat tiger = new Cat("Tiger", 3, "ginger");
        cats.add(tiger);
        Cat mufasa = new Cat("Mufasa", 7, "yellow");
        cats.add(mufasa);

        System.out.println(cats);

        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(rudolf);
        listOfCats.add(tom);
        listOfCats.add(mufasa);
        listOfCats.add(tiger);
        System.out.println(listOfCats);
        listOfCats.sort(new CatColourComparator());
        System.out.println(listOfCats);

        listOfCats.sort(new CatColourComparator().reversed());
        System.out.println("===========Natural Order comparator===========");
        listOfCats.sort(Comparator.naturalOrder());
        System.out.println(listOfCats);
        System.out.println("===========Reverse Order comparator===========");
        listOfCats.sort(Comparator.reverseOrder());
        System.out.println(listOfCats);

        listOfCats.add(null);
        System.out.println(listOfCats);
        listOfCats.sort(Comparator.nullsFirst(new CatColourComparator()));
        System.out.println(listOfCats);
    }
}
