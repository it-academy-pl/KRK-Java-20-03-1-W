package pl.itacademy.java.lesson3;

import java.util.concurrent.ThreadLocalRandom;

public class AnotherLoopDemo {
    public static void main(String[] args) {
        String[] listOfItemsToBuy = {"Makarony", "Papier toaletowy", "Mięso", "Parówki"};
        for (int i = 0; i < listOfItemsToBuy.length; i++) {
            System.out.println(listOfItemsToBuy[i]);
        }
        System.out.println("============ENHANCED FOR LOOP BELOW===============");
        for (String item : listOfItemsToBuy) {
            System.out.println(item);
        }

        int[][] numbers = {{1, 2, 3}, {4, 5}, {6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + ";");
            }
            System.out.println();
        }

        for (int[] internalArray : numbers) {
            for (int number : internalArray) {
                System.out.print(number + ",");
            }
            System.out.println();
        }

        while (true) {
            int number = ThreadLocalRandom.current().nextInt(1000);
            System.out.println(number);
            if (number > 500) {
                break;
            }
        }

        System.out.println("========THE SAME WITHOUT BREAK==========");

        int anotherNumber = 0;
        while (anotherNumber < 500) {
            anotherNumber = ThreadLocalRandom.current().nextInt(1000);
            System.out.println(anotherNumber);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + ";");
        }

        System.out.println();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ";");
            }
        }

    }
}
