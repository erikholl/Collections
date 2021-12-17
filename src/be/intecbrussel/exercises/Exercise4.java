package be.intecbrussel.exercises;

import java.util.*;

public class Exercise4 {

    public static void main(String[] args) {
        stringList();
    }

    private static void stringList() {
       SortedSet<String> wordList = new TreeSet<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("give me a sentence");

        String word;

        do {
            word = userInput.next();
            wordList.add(word);

        } while (!word.endsWith("."));

        wordList.forEach(System.out::println);

        System.out.println(wordList.first());
        System.out.println(wordList.last());
    }
}
