package pl.itacademy.java.lesson5;

public class NoSoundBehaviour extends MakeSoundBehaviour {
    @Override
    public void makeSound() {
        System.out.println("This animal can't say anything");
    }
}
