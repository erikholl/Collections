package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/*
List is an interface which extends Collection (and therefore inherits its
methods). a List is ordered and sequential. positions in a list have an index.
duplicates are allowed.
note that list inherits add / remove from Collection, but also has its own
add / remove methods which are enabling adding / removing elements at
specific index positions. these add/ remove methods return void (the ones
from Collection return boolean).
 */
public class ListDemo {
    public static void main(String[] args) {

        List<String> myCollection = new ArrayList<>();
        // ArrayList is a concrete implementation of a List. very useful to
        // access elements on certain positions (index) - less useful for
        // adding / removing though, as the length of the Array laying behind
        // an ArrayList needs to be updated
        myCollection.add("Java");
        myCollection.add("Cobol");
        myCollection.add("Go");
        myCollection.add("Python");
        myCollection.add("Lisp");
        myCollection.add("Go");

//        System.out.println(myCollection.get(2)); // similar to myArray[2]

        myCollection.set(2, "JavaScript");

        myCollection.sort(Comparator.naturalOrder()); // .thenComparing gives
        // trouble after a natural order...

        myCollection.forEach(System.out::println);

    }
}
