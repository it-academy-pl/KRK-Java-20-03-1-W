package pl.itacademy.java.lesson7;

import java.util.Comparator;

public class CatColourComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getColour().compareTo(cat2.getColour());
    }
}
