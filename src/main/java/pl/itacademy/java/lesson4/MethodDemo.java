package pl.itacademy.java.lesson4;

public class MethodDemo {
    public static void doSomething(int number) {
        System.out.println("Initial value: " + number);
        number = 0;
        System.out.println("Value after modification: " + number);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("a value: " + a);
        doSomething(a);
        System.out.println("a value: " + a);
    }
}
