package pl.itacademy.java.lesson8;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            feedADog();
        } catch (DogNotHungryException e) {
            System.out.println(e.getMessage());
            System.out.println("Dog name is: " + e.getDogName());
        }
    }

    public static boolean foundACat() throws CatNotFoundException {
        throw new CatNotFoundException("We cant find any cats");
    }

    public static boolean feedADog() {
        throw new DogNotHungryException("Dog is not hungry!", "Spike");
    }
}
