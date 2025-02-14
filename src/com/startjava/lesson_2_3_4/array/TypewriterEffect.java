package com.startjava.lesson_2_3_4.array;

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

        String[] words = extractWords(text);
        if (words == null || words.length == 0) {
            System.out.println("Слова в тексте отсутствуют.");
            return;
        }

        String shortestWord = findShortestWord(words);
        String longestWord = findLongestWord(words);

        int startIndex = indexOfWord(words, shortestWord);
        int endIndex = indexOfWord(words, longestWord);

        if (startIndex > endIndex) {
            int temp = startIndex;
            startIndex = endIndex;
            endIndex = temp;
        }

        String[] parts = text.split("(?<=\\s)|(?=\\s)|(?<=\\p{Punct})|(?=\\p{Punct})");
        StringBuilder modifiedText = new StringBuilder();
        int wordIndex = 0;
        for (String part : parts) {
            if (part.trim().isEmpty() || part.equals("\n") || isPunctuation(part)) {
                modifiedText.append(part);
            } else {
                if (wordIndex >= startIndex && wordIndex <= endIndex) {
                    modifiedText.append(part.toUpperCase());
                } else {
                    modifiedText.append(part);
                }
                wordIndex++;
            }
        }

        System.out.println("Текст с эффектом пишущей машинки:");
        try {
            for (char c : modifiedText.toString().toCharArray()) {
                System.out.print(c);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка при выводе текста: " + e.getMessage());
        }
        System.out.println();
    }

    private String[] extractWords(String text) {
        return text.replaceAll("\\p{Punct}", "").split("\\s+");
    }

    private String findShortestWord(String[] words) {
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    private String findLongestWord(String[] words) {
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    private int indexOfWord(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isPunctuation(String str) {
        return str.matches("\\p{Punct}");
    }
}