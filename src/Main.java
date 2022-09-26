import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("Задание №1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println("\nЗадание №2");
        int doublenumbers = 2;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).equals(doublenumbers)) {
                System.out.print(nums.get(i) + " ");
                doublenumbers = doublenumbers + 2;
            }
        }
        System.out.println("\nЗадание №3");
        List<String> word = new ArrayList<>(List.of("Hello", "World", "zoo", "park", "linkin", "park"));
        Set<String> wordSet = new HashSet<>();
        wordSet.addAll(word);
        System.out.println(word);
        System.out.println(wordSet);

        System.out.println("Задание №4");
// тут не понел как делать я через счетчик пытаюсь но все равно не так
        int counter = 0;
        for (int i = 0; i < word.size(); i++) {
            if (word.contains(word.get(i))) {
                if (word.get(i).contains(word.get(i))) {

                } else {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
    }
}