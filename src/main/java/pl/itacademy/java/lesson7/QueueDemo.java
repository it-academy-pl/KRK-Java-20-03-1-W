package pl.itacademy.java.lesson7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Person jan = new Person("Jan");
        Person andrzej = new Person("Andrzej");
        Person kasia = new Person("Kasia");
        Person asia = new Person("Asia");

        Queue<Person> goodLoodQueue = new LinkedList<>();
        goodLoodQueue.add(jan);
        goodLoodQueue.add(kasia);
        goodLoodQueue.add(andrzej);
        goodLoodQueue.add(asia);

        System.out.println(goodLoodQueue);
        System.out.println(goodLoodQueue.peek());
        System.out.println(goodLoodQueue);
        System.out.println(goodLoodQueue.poll());
        System.out.println(goodLoodQueue);
        System.out.println(goodLoodQueue.poll());
        System.out.println(goodLoodQueue.poll());
        System.out.println(goodLoodQueue);

        Person ad = new Person("Andrzej Duda");
        Queue<Person> priorityQueue = new PriorityQueue<>();
        kasia.setPregnant(true);
        priorityQueue.add(ad);
        priorityQueue.add(jan);
        priorityQueue.add(kasia);
        priorityQueue.add(andrzej);
        priorityQueue.add(asia);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        Deque<Person> people = new LinkedList<>();
        people.add(kasia);
        people.add(asia);

        System.out.println(people);
        people.addFirst(ad);
        System.out.println(people);
        people.addLast(andrzej);
        people.addLast(jan);
        System.out.println(people);

        System.out.println(people.pollLast());
        System.out.println(people);
        System.out.println(people.pollFirst());
        System.out.println(people);
        System.out.println(people.pollLast());
        System.out.println(people.removeLast());
        System.out.println(people.pollLast());
        System.out.println(people.pollLast());
        //System.out.println(people.removeLast());
    }
}
