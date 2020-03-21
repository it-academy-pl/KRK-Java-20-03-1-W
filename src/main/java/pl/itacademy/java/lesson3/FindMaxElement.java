package pl.itacademy.java.lesson3;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 10, -2, 20, 15};
        int maxNumber = numbers[0];
        for (int currentNumber : numbers) {
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        System.out.println(maxNumber);
    }
}
