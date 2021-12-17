package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;

public class ColllectionDemo {

    public static void main(String[] args) {

        Collection<String> myCollection = new ArrayList<>();
        myCollection.add("Java");
        myCollection.add("Cobol");
        myCollection.add("Go");
        myCollection.add("Python");
        myCollection.add("Lisp");
        myCollection.add("Go");


        while (myCollection.contains("Go")) {
            myCollection.remove("Go");
        }

//        myCollection.remove("Go"); // removes the 1st element it finds in
        // line with what is specified as object

//        myCollection.removeAll(/* takes a collection */)

        myCollection.forEach(System.out::println);

        myCollection.clear();

    }
}
