package pl.itacademy.java.lesson10;

import java.time.LocalDate;

public interface NonDefaultPersonCreator {
    Person create(String one, String another, LocalDate date);
}
