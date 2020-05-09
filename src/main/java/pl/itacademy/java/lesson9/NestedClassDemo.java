package pl.itacademy.java.lesson9;

import java.io.*;

public class NestedClassDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        School school = new School();


        School.ClassRoom classRoom = new School.ClassRoom();

        AbstractAnimal animal = new AbstractAnimal() {
            @Override
            void eat(String food) {
                System.out.println("Animal eats " + food);
            }
        };

        animal.eat("corn");


        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(school);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/tmp/test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o.getClass());

    }
}
