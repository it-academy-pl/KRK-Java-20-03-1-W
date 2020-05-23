package pl.itacademy.maven;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class PersonTester {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski");

        String lastName = jan.getLastName();
        System.out.println(isBlank(lastName));
    }
}
