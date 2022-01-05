package be.intecbrussel;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


// about methods on how to compare and sort objects
public class SortedSetDemo {
    // a SortedSet and a NavigableSet are both interface-classes. SortedSet
    // extends Set; NavigableSet extends SortedSet. both are sorted and ordered
    // sets. a NavigableSet offers extra methods to perform checks on nearest
    // element

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        // a TreeSet is a concrete implementation of NavigableSet. a TreeSet
        // is an ordered and sorted collection; its elements are maintained
        // in a tree-structure. elements which are added to a TreeSet need to
        // be 'sortable' (like alphabetical).
        stringSet.add("Jean-Pierre");
        stringSet.add("Andre");
        stringSet.add("Marie-Jeanne");

        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------");

        Set<Box> boxes = new TreeSet<>(); // note here the Box objects, for
        // which we created a Box class, will need to be comparable (and
        // for that also sortable) - see the BoxComparator class which we
        // built because of that. There are other ways to enable
        // comparability, direct in here in the class itself:

        // 1.
//        Set<Box> boxes =
//                new TreeSet<>(Comparator.comparingInt(Box::getLength)
//                .thenComparingInt(Box::getWidth));
        // 2
//        Set<Box> boxes =
//                new TreeSet<>((box1, box2) -> box1.getHeight() - box2.getHeight()); // method 2 to sort

        boxes.add(new Box(100, 100, 100));
        boxes.add(new Box(50, 150, 200));
        boxes.add(new Box(150, 80, 100));

        Set<Box> streamedBoxes = boxes.stream()
                .filter(box -> box.getHeight() > 50)
                .filter(box -> box.getWidth() > 50)
                .collect(Collectors.toSet());

        streamedBoxes.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        boxes.forEach(System.out::println);
    }
}