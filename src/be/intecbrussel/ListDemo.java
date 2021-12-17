package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Cobol");
        myCollection.add("Go");
        myCollection.add("Python");
        myCollection.add("Lisp");
        myCollection.add("Go");

        System.out.println(myCollection.get(2)); // similar to myArray[2]

        myCollection.set(2, "JavaScript");

        myCollection.forEach(System.out::println);

    }
}
