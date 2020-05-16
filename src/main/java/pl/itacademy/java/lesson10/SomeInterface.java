package pl.itacademy.java.lesson10;

public interface SomeInterface {
    private static boolean someCheck() {
        return false;
    }

    void someImportantMethod();

    default void stream() {

    }
}
