package pl.itacademy.java.lesson8;

public class DogNotHungryException extends RuntimeException {
    private String dogName;

    public DogNotHungryException(String message, String dogName) {
        super(message);
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }
}
