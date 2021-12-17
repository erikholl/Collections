package be.intecbrussel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo { // a set had only unique objects, duplicates are ignored

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Hello");
        set.add("Today");
        set.add("Is");
        set.add("A");
        set.add("Day");
        set.add("Good");
        set.add("Day"); // duplicate value

        set.forEach(System.out::println);

    }
}
