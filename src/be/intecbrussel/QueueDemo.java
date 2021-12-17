package be.intecbrussel;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Java");
        myQueue.add("Cobol");
        myQueue.add("Go");
        myQueue.add("Python");
        myQueue.add("Lisp");
        myQueue.add("Go");

        while(myQueue.peek() != null) {
            String element = myQueue.poll();
            System.out.println(element);
        }

        // .peek - peeks at .. does return null values
        // .poll - takes element out of queue. does return null values
        // .element - takes element from queue. throws exception if null
        // .remove - removes element from queue. throws exception if null
        // PriorityQueue will sort elements in the queue
        // Deque

//        String element = myQueue.poll();
//        System.out.println(element);
//        myQueue.forEach(System.out::println);

    }
}
