package pl.itacademy.java.lesson5;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(max(5, 7));

        System.out.println("Is 2 an odd number: " + isOdd(2));
        System.out.println("Is 3 an odd number: " + isOdd(3));
        System.out.println("Is 1 an odd number: " + isOdd(1));
        System.out.println("Is 4 an odd number: " + isOdd(4));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static boolean isOdd(int number) {
        if (number == 1) {
            return true;
        }
        return !isOdd(number - 1);
    }

    private static boolean properIsOdd(int number) {
        return number % 2 == 0;
    }
}
