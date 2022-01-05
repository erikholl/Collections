package be.intecbrussel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    // a Set has only unique objects, duplicates are ignored. a Set is an
    // interface class, which inherits methods of Collection. elements in a
    // Set do NOT have an index (or, in other words, a fixed position). Set
    // does not have its own methods; it just inherits the ones from Collection

    public static void main(String[] args) {

        // a HashSet is an unsorted and unordered collection which maintains
        // its elements in a hashtable. the hashcode from an element is used
        // as index in the underlying table. when adding an element, the
        // hashcode of the element defines the index.
        // a HashSet is very efficient with searching, adding removing
        // elements

        Set<String> set = new HashSet<>(); // when changing HashSet into
        // LinkedHashSet, you can keep the order, as LinkedHashSet is an
        // ordered collection (but still with unique values only).

        // when we would write:
            // Collection<String> set = new HashSet
        // this would allow us to easily change the implementation to a List,
        // for instance an ArrayList - however! the downside is we do NOT
        // have the characteristic of uniqueness anymore in our HashSet as
        // this is a characteristic of a Set.

        set.add("Hello");
        set.add("Today");
        set.add("Is");
        set.add("A");
        set.add("Day");
        set.add("Good");
        set.add("Day"); // duplicate value
        // note that if we would add 2 times
            // set.add(new StringBuilder("Day"));
        // these would indeed be added 2 times to the Set! this is because
        // StringBuilder does NOT have implementations of hasCode() en equals
        // () (String does have its own implementation of these).

        set.forEach(System.out::println); // print it

        set.add("Not");
        set.add("Really");

        set.forEach(System.out::println); // print it again, but with values
        // added - you'll see the order changed - new values were added in
        // between
    }
}
