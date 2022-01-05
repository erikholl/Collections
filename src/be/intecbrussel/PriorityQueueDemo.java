package be.intecbrussel;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> names = new PriorityQueue<>();
        // PriorityQueue is a concrete implementation of the Queue
        // interface-class. elements are sorted according to natural order or
        // according to the algorithm of the comparator.
        // important note: see the example of Integers in a PriorityQueue
        // below - it does NOT return the elements in natural order when just
        // using a forEach on the PriorityQueue - it does return natural
        // order when using a construct like in the String PriorityQueue
        // example below - with peek and poll methods, checking and removing
        // the first item in the queue.
        // why that is, do not know
        // TODO: check why construct in ex1 is required to get natural order out

        // ex1
        names.offer("john");
        names.offer("John");
        names.offer("Wim");
        names.offer("Sonja");
        names.offer("Karel");

        String s = names.peek();
        while(s != null) {
            System.out.println("first in queue " + s);
            s = names.poll();
            System.out.println("processing " + s);
            s = names.peek();
        }

        System.out.println("-------------------------------------------------");

        // ex2 - does NOT return natural order!
        PriorityQueue<Integer> numbersPrioritized = new PriorityQueue<>();

        numbersPrioritized.offer(5);
        numbersPrioritized.offer(2);
        numbersPrioritized.offer(1);
        numbersPrioritized.offer(63);
        numbersPrioritized.add(-4);

        numbersPrioritized.forEach(System.out::println);
    }
}
