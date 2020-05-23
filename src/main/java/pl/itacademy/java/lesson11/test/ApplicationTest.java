package pl.itacademy.java.lesson11.test;

public class ApplicationTest {

    @Test(ignore = true)
    public static void checkSumMethod() {
        Application app = new Application();
        int sum = app.sum(1, 2);
        if (sum != 3) {
            throw new RuntimeException("Expected: " + 3 + " but get: " + sum);
        }
    }

    @Test
    public static void checkSumMethod2() {
        Application app = new Application();
        int sum = app.sum(5, 2);
        if (sum != 7) {
            throw new RuntimeException("Expected: " + 7 + " but get: " + sum);
        }
    }

    @Test
    public static void checkMultiplyMethod() {
        Application app = new Application();
        int multiply = app.multiply(1, 2);
        if (multiply != 2) {
            throw new RuntimeException("Expected: " + 2 + " but get: " + multiply);
        }
    }
}
