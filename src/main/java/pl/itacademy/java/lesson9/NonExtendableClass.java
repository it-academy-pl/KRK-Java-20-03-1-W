package pl.itacademy.java.lesson9;

public class NonExtendableClass {
    private NonExtendableClass() {

    }

    private NonExtendableClass(String arg) {

    }

    public static NonExtendableClass createInstance(String arg) {
        return new NonExtendableClass(arg);
    }
}
