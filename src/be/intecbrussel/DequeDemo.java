package be.intecbrussel;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {
        // Deque is an interface-class which extends the Queue interface
        // class. Deque stands for double-ended queue. Deque offers
        // possibility to add / remove elements at both the beginning and the
        // end of the queue. methods: offerFirst, peekFirst, pollFirst,
        // offerLast, peekLast, pollLast. Also: addFirst, getFirst,
        // removeFirst, addLast, getLast, removeLast. offer / poll / peek
        // return null when deque is empty; add / get / remove throw exception

        Deque<String> myDeque = new LinkedList<>();
        myDeque.add("Java");
        myDeque.add("Cobol");
        myDeque.add("Go");
        myDeque.add("Python");
        myDeque.add("Lisp");
        myDeque.add("Go");

        myDeque.remove("Java");
        System.out.println(myDeque);
    }
}
