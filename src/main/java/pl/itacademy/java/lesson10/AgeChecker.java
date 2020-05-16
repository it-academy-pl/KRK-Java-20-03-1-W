package pl.itacademy.java.lesson10;

import java.time.LocalDate;

public class AgeChecker implements PersonChecker {
    @Override
    public boolean check(Person person) {
        return person.getBirthDay()
                .isBefore(LocalDate.now().minusYears(18));
    }
}
