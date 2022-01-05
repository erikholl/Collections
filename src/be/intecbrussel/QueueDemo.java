package be.intecbrussel;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    // a Queue is an interface class which focuses on elements to be
    // requested and removed / handled 1-by-1. like 'queueing up' for something.
    // Queue has specific methods for handling elements like these are in a
    // queue, like offer: adds an element to the queue. LinkedList is a
    // concrete implementation of the Queue class (but also of the List class)

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Java");
        myQueue.add("Cobol");
        myQueue.offer("Go"); // the difference between add and offer is that
        // offer returns a false value when it fails to offer the element to
        // a size limited list - add will throw an IllegalStateException.
        myQueue.add("Python");
        myQueue.add("Lisp");
        myQueue.add("Go");

        while(myQueue.peek() != null) {
            String element = myQueue.poll(); // poll provides the 1st element
            // and removes it. difference with remove is that poll returns
            // null when the queue is empty; remove throws an exception.
            System.out.println(element);
        }

        System.out.println("---------------------------------------------");
        for (String e : myQueue) {
            System.out.println(e);
        } // as all elements have been polled in the lines above, nothing
        // should be printed anymore

        // .peek - peeks at .. does return null values
        // .poll - takes element out of queue. does return null values
        // .element - takes element from queue. throws exception if null
        // .remove - removes element from queue. throws exception if null
        // PriorityQueue will sort elements in the queue
    }
}
