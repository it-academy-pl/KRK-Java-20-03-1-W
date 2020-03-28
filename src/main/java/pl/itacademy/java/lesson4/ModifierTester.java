package pl.itacademy.java.lesson4;

public class ModifierTester {
    public static void main(String[] args) {
        final Mouse jerry = new Mouse("Jerry");
        jerry.stealFood("cheese");
        jerry.stealFood("bread");

        System.out.println("There was steal: " + Mouse.getNumberOfStolenFood() + " food");

        System.out.println(Mouse.getNumberOfMouseInHouse());
        System.out.println(jerry.getNumberOfMouseInHouse());

        Mouse mikey = new Mouse("Mikey");
        System.out.println(Mouse.getNumberOfMouseInHouse());
        System.out.println(jerry.getNumberOfMouseInHouse());

        Mouse minnie = new Mouse("Minnie");
        System.out.println(Mouse.getNumberOfMouseInHouse());
        System.out.println(jerry.getNumberOfMouseInHouse());
        System.out.println(mikey.getNumberOfMouseInHouse());
        System.out.println(minnie.getNumberOfMouseInHouse());
    }
}
