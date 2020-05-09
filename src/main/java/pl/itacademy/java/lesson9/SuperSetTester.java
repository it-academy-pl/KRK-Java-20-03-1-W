package pl.itacademy.java.lesson9;

import java.util.Collection;

public class SuperSetTester {
    public static void main(String[] args) {
        SuperSet<Integer> superSet = new SuperSet<>();
        superSet.add(42);

        System.out.println(superSet.contains(15));
        System.out.println(superSet.contains(42));

        Collection<Integer> allItems = superSet.getAllItems();
        System.out.println(allItems);

        Integer first = superSet.getFirst();
        System.out.println(first);

        SuperSet<String> stringSuperSet = new SuperSet<>();
        stringSuperSet.add("test");

        SuperSet<Integer> integerSuperSet = new SuperSet<>();
        integerSuperSet.add(21);
        boolean theSameFirstElement = UsefulTools.isTheSameFirstElement(superSet, integerSuperSet);
        System.out.println(theSameFirstElement);
    }
}
