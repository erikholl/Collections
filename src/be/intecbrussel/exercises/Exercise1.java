package be.intecbrussel.exercises;

import java.util.*;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Exercise1 {

    public static void main(String[] args) {
//        part2();
        part1();

    }


    private static void part2() {
        List<String> wordList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("give me a sentence");

        String word;

        do {
             word = userInput.next();
            wordList.add(word);

        } while (!word.endsWith("."));

        wordList.forEach(System.out::println);

        Collections.reverse(wordList);

        System.out.println(wordList.size());

        String sentence = wordList.stream().reduce("",
                                                   (acc, e) -> acc + " " + e);
        System.out.println(sentence);

    }

    private static void part1() {
        List<Integer> myList = new LinkedList<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter 5 numbers");

        for (int i = 0; i < 5; i++) {
            myList.add(userInput.nextInt());
        }

        myList.forEach(System.out::println);
        userInput.close();

        int sum = myList.stream()
                .mapToInt(number -> number)
                .sum();
        System.out.println(sum);

        OptionalDouble optionalDouble = myList.stream()
                .mapToInt(number -> number)
                .average();

        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }
    }

}
