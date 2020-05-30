package pl.itacademy.junit;

public class Util {

    public static Number max(Number a, Number b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    public static boolean isPositive(Number number) {
        return number.doubleValue() > 0;
    }

    public static Number sum(Number... numbers) {
        double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
