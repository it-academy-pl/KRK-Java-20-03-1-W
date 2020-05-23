package pl.itacademy.java.lesson11;

public class AnnotatedAnimals {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog");

        Class<? extends Animal> aClass = dog.getClass();
        if (aClass.isAnnotationPresent(Mammal.class)) {
            System.out.println("Class Animal annotated with @Mammal");
        }

        Cat cat = new Cat("Tom");
        Class<? extends Cat> catClass = cat.getClass();
        if (catClass.isAnnotationPresent(Mammal.class)) {
            System.out.println("Class Cat annotated with @Mammal");
        }
    }
}
