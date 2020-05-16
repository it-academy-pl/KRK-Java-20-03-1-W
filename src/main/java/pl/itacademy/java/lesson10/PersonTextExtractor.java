package pl.itacademy.java.lesson10;

@FunctionalInterface
public interface PersonTextExtractor {
    String extractText(Person person);
}
