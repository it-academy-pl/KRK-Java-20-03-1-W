package pl.itacademy.java.lesson11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {

    public static void main(String[] args) {
        System.out.println(UtilClass.sum(BigDecimal.valueOf(1.1), BigDecimal.valueOf(1.1)));
        System.out.println(UtilClass.sum(BigDecimal.valueOf(1.2), BigDecimal.valueOf(1.1)));
        System.out.println(UtilClass.sum(BigDecimal.valueOf(1.3), BigDecimal.valueOf(1.1)));
        System.out.println(UtilClass.sum(BigDecimal.valueOf(1.4), BigDecimal.valueOf(1.1)));

        @SuppressWarnings("all")
        double sum = UtilClass.sum(1.0, 2.0);
        System.out.println(sum);

        @SuppressWarnings("unchecked")
        List<Integer> integers = new ArrayList();
        integers.add(1);
        System.out.println(integers);


        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(2);

        updateLists(integers, anotherList);


        System.out.println(integers);
        System.out.println(anotherList);
    }

    @SafeVarargs
    private static void updateLists(List<Integer>... arrayOfLists) {
        Object[] lists = arrayOfLists;

        List<Integer> integers = (List) lists[0];
        integers.add(2);

        List<String> strings = (List) lists[1];
        strings.add("test");
    }
}
