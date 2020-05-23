package pl.itacademy.java.lesson11;

import java.time.LocalDate;

public class LombokDemo {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski", LocalDate.now());
        System.out.println(jan);
    }
}
