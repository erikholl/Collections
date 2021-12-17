package be.intecbrussel.exercises;

import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {

        Set<Integer> bot;
        Set<Integer> gen;
        Set<Integer> overlap;

        long startTime = System.currentTimeMillis();
        int count = 0;

        do {
            bot  = botLotto();
            gen = genLotto();
//            overlap = bot.retainAll(gen); // why is this not possible?
            overlap = new HashSet<>(bot);
            overlap.retainAll(gen);
//            System.out.println(overlap);
            count++;
        } while (overlap.size() < 6);

        long endTime = System.currentTimeMillis();

        System.out.println("The bot generated: " + bot);
        System.out.println("The machine generated: " + gen);

        System.out.println(overlap);
        System.out.println("To reach 6 corresponding random numbers " +
                                   "between 1-45 from both bot and " +
                                   "the lotto-machine took " + (endTime - startTime) + " " +
                                   "milliseconds; " + count + " iterations.");

//        Set<Integer> botNumbers = botLotto();
//        Set<Integer> winningNumbers = genLotto();
//        Set<Integer> overlap = new HashSet<>(botNumbers);
//        overlap.retainAll(winningNumbers);
//
//        System.out.println("your numbers: " + botNumbers);
//        System.out.println("winning numbers: " + winningNumbers);
//        System.out.println("matching numbers: " + overlap);

    }

    private static void integerList() {
        Collection<Integer> myList = new HashSet<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter 5 numbers");

        for (int i = 0; i < 5; i++) {
            myList.add(userInput.nextInt());
        }

        myList.forEach(System.out::println);
        userInput.close();
    }

    private static void stringList() {
        Collection<String> wordList = new HashSet<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("give me a sentence");

        String word;

        do {
            word = userInput.next();
            wordList.add(word);

        } while (!word.endsWith("."));

        wordList.forEach(System.out::println);
    }

    private static Set<Integer> userLotto() {
        Set<Integer> userLotto = new HashSet<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter 6 numbers");

        do {
            int lottoNumber = userInput.nextInt();
            if (lottoNumber >= 1 && lottoNumber <= 45) {
                userLotto.add(lottoNumber);
            }
        } while (userLotto.size() < 6);

//        userLotto.forEach(System.out::println);
        return userLotto;

    }

    private static Set<Integer> botLotto() {
        Set<Integer> botLotto = new HashSet<>();

        Random random = new Random();
        do {
            int lottoNumber = random.nextInt(45) + 1;
            botLotto.add(lottoNumber);
        } while (botLotto.size() < 6);

        return botLotto;
    }

    private static Set<Integer> genLotto() {
        Set<Integer> genLotto = new HashSet<>();

        Random random = new Random();
        do {
            int lottoNumber = random.nextInt(45) + 1;
            genLotto.add(lottoNumber);
        } while (genLotto.size() < 6);

//        genLotto.forEach(System.out::println);
        return genLotto;
    }

}
