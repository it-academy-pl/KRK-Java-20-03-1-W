package pl.itacademy.java.lesson9;

import java.io.*;

public class EnumDemo {
    public static final String MONDAY = "MON";
    public static final String TUESDAY = "TUE";
    public static final String WEDNESDAY = "WEDNESDAY";
    public static final String SATURDAY = "SATURDAY";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String today = SATURDAY;

        printDayName(MONDAY);
        printDayName(TUESDAY);


        printDayName("asdfafasdfawefae");

        System.out.println(isMonday("MONDAY"));

        System.out.println(Month.MAY);
        printMonth(Month.JAN);
        printMonth(Month.JUN);

        for (Month value : Month.values()) {
            System.out.println(value);
        }

        Month month = Month.valueOf("DEC");
        printMonth(month);

        System.out.println(month.compareTo(Month.JAN));
        System.out.println(month.ordinal());


        System.out.println(Planet.VENUS.getRadius());
        System.out.println(Planet.EARTH.equatorLength());
        System.out.println(Planet.MARS.equatorLength());

        Planet p = Planet.valueOf("EARTH");
        System.out.println(p);

        p = Planet.fromPolishName("Ziemia");
        System.out.println(p);
        System.out.println(p.name());
//        p = Planet.fromPolishName("Saturn");
//        System.out.println(p);

        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(Planet.EARTH);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/tmp/test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o.getClass());
        if (o instanceof Planet) {
            Planet planetFromFile = (Planet) o;
            System.out.println(planetFromFile);
            System.out.println(planetFromFile.equatorLength());
            System.out.println(planetFromFile.equals(Planet.EARTH));
            System.out.println(planetFromFile == Planet.EARTH);
        }

    }

    public static void printDayName(String dayName) {
        System.out.println(dayName);
    }

    public static boolean isMonday(String dayName) {
        return MONDAY.equals(dayName);
    }

    public static void printMonth(Month month) {
        System.out.println(month);
    }

    private enum Test {
        ONE, ANOTHER
    }

    private class NestedClass {

    }
}
