package pl.itacademy.java.lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SuperSet<T> {

    List<T> items = new ArrayList<>();

    public void add(T item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public boolean contains(T item) {
        return items.contains(item);
    }

    public Collection<T> getAllItems() {
        return new ArrayList<>(items);
    }

    public T getFirst() {
        return items.get(0);
    }

}
