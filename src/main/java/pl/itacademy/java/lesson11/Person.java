package pl.itacademy.java.lesson11;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
}
