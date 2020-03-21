package pl.itacademy.java.lesson2;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 42;
        numbers[1] = 7;
        int sum = numbers[0] + numbers[1];
        System.out.println("Sum of two numbers: " + sum);

        System.out.println(numbers.length);
    }
}
