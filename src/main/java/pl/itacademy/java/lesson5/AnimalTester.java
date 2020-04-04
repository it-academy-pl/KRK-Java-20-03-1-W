package pl.itacademy.java.lesson5;

public class AnimalTester {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        System.out.println(tom.isHungry());
        tom.eat("milk");
        System.out.println(tom.isHungry());

        tom.makeSound();

        Tiger tiger = new Tiger("Danger");
        tiger.makeSound();

        Fish goldenFish = new Fish();
        goldenFish.makeSound();


        System.out.println(tom.isHungry());
        tom.eat("kielbasa");
        System.out.println(tom.isHungry());
        tom.sleep(1);
        System.out.println(tom.isHungry());


        animalMakeSound(tom);
        animalMakeSound(tiger);
        animalMakeSound(goldenFish);


        Duck donald = new Duck();
        doSomething(donald);


        Animal buster = new Cat("Buster");
        Animal tt = new Tiger("Tt");
    }

    public static void animalMakeSound(Animal animal) {
        if (animal instanceof Cat) {
            //do something related only for cats
            Cat cat = (Cat) animal;
            cat.sleepAllTheDay();
        }
        animal.makeSound();
    }

    public static void doSomething(AnimalBehaviour animalBehaviour) {
        System.out.println("Do something with animal");
    }
}
