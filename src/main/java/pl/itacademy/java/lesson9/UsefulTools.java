package pl.itacademy.java.lesson9;

import java.util.Collection;
import java.util.List;

public class UsefulTools {
    public static <T> boolean isTheSameFirstElement(SuperSet<T> one, SuperSet<T> another) {
        T firstFromOne = one.getFirst();
        T firstFromAnother = another.getFirst();
        return firstFromOne.equals(firstFromAnother);
    }

    public static <T extends Number> byte getByteValue(T number) {
        return number.byteValue();
    }

    public static void printElements(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    public static Double sum(Collection<? extends Number> collection) {
        Double result = 0.0;
        for (Number number : collection) {
            result += number.doubleValue();
        }
        return result;
    }

    public static void fillList(List<? super Number> list, Number... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
    }
}
