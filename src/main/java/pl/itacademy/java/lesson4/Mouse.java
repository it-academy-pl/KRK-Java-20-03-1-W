package pl.itacademy.java.lesson4;

public class Mouse {
    private static int numberOfMouseInHouse = 0;
    private static int numberOfStolenFood = 0;

    private final String name;

    public Mouse(String name) {
        this.name = name;
        numberOfMouseInHouse++;
    }

    public void stealFood(String food) {
        System.out.println(name + " steal " + food);
        numberOfStolenFood++;
    }

    public static int getNumberOfMouseInHouse() {
        return numberOfMouseInHouse;
    }

    public static int getNumberOfStolenFood() {
        return numberOfStolenFood;
    }
}
