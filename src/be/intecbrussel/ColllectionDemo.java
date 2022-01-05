package be.intecbrussel;

import java.util.ArrayList;
import java.util.Collection;

// Collection is the main superinterface for 'collections'. It defines
// the main methods the collection classes have (overridden or asis)

// a collection takes elements from generic type <E> which you can set when
// declaring, initialising the collection.

// to iterate over a collection, the method Iterable<E> iterator can be
// used. which requires proper usage of hasNext method in it in order to
// avoid NoSuchElementException
// also forEach can be used to iterate over the collection.

// note on the add and remove methods - these return booleans - the
// reason for that is to indicate if add / remove changed the collection.
// this is useful for collections like Set<T>, which does not change if
// the element added was already available in the Set.

// when using Collection and its subclasses (interfaces and object-classes),
// a rule of thumb for declaring is to declare with an interface type which
// is as high as possible in the hierarchy (Collection is at the top). this
// keeps possibilities for concrete implementation open: for instance:
/*
Collection<String> names = new LinkedList<>();
    can easily be changed into:
Collection<String> names = new HashSet<>();
    while this could not be changed if we declared:
List<String> names = new LinkedList<>();
    as a HashSet is NOT an implementation of a List
 */
// however, declaring it with type Collection means also that the method of
// List will NOT be available - so define as high as possible in hierarchy,
// but based on the methods that will be used

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
