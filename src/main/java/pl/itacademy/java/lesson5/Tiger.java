package pl.itacademy.java.lesson5;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name, new MakeRoarBehaviour());
    }

    @Override
    public void move() {
        System.out.println("Tiger is moving");
    }
}
