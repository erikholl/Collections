package be.intecbrussel;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {

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
