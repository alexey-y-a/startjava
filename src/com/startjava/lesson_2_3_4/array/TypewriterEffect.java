package com.startjava.lesson_2_3_4.array;

import java.util.ArrayList;
import java.util.List;

public class TypewriterEffect {
    public static void main(String[] args) {
        TypewriterEffect typewriter = new TypewriterEffect();

        String[] testStrings = {
                "Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin",
                "null",
                ""
        };

        for (String text : testStrings) {
            typewriter.printWithTypewriterEffect(text);
            System.out.println();
        }
    }

    private void printWithTypewriterEffect(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("пустая строка.");
            return;
        }

        List<String> words = extractWords(text);

        if (words.isEmpty()) {
            System.out.println("Слова в тексте отсутствуют.");
            return;
        }

        String shortestWord =
                words.stream().min((w1, w2) -> Integer.compare(w1.length(), w2.length())).orElse("");
        String longestWord =
                words.stream().max((w1, w2) -> Integer.compare(w1.length(), w2.length())).orElse("");

        int startIndex = words.indexOf(shortestWord);
        int endIndex = words.indexOf(longestWord);

        if (startIndex > endIndex) {
            int temp = startIndex;
            startIndex = endIndex;
            endIndex = temp;
        }

        System.out.print("Слова между самым коротким и самым длинным (включительно): ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(words.get(i).toUpperCase() + " ");
        }
        System.out.println("\n");

        System.out.println("Текст с эффектом пишущей машинки:");
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка при выводе текста: " + e.getMessage());
        }
        System.out.println();
    }

    private List<String> extractWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder wordBuilder = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                wordBuilder.append(c);
            } else if (wordBuilder.length() > 0) {
                words.add(wordBuilder.toString());
                wordBuilder.setLength(0);
            }
        }

        if (wordBuilder.length() > 0) {
            words.add(wordBuilder.toString());
        }

        return words;
    }
}