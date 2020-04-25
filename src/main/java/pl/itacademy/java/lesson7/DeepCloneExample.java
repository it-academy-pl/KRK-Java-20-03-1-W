package pl.itacademy.java.lesson7;

public class DeepCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine("SuperPuper", 1000);
        Car superCar = new Car(engine, "red");

        System.out.println("==ORIGINAL==");
        System.out.println(superCar);
        System.out.println("==CLONE==");
        Car clone = superCar.clone();
        System.out.println(clone);

        engine.setPower(2000);

        System.out.println("==ORIGINAL==");
        System.out.println(superCar);
        System.out.println("==CLONE==");
        System.out.println(clone);
    }
}
