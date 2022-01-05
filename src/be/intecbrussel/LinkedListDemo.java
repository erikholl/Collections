package be.intecbrussel;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {
    // LinkedList is a concrete implementation of a List. an element knows its
    // neighbor elements (L and R). this enables going through the list in 2
    // directions.

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C#");
        list.add("Python");

        list.forEach(System.out::println);
    }
}
