package pl.itacademy.maven;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Person {
    private String firstName;
    private String lastName;
}
