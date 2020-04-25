package pl.itacademy.java.lesson7;

public class Car implements Cloneable {
    private Engine engine;
    private String colour;

    public Car(Engine engine, String colour) {
        this.engine = engine;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car clone = (Car) super.clone();
        clone.engine = this.engine.clone();
        return clone;
    }
}
