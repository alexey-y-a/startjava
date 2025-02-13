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

        for (int i = startIndex; i <= endIndex; i++) {
            words[i] = words[i].toUpperCase();
        }

        String[] parts = extractParts(text);
        StringBuilder modifiedText = new StringBuilder();
        int wordIndex = 0;
        for (String part : parts) {
            if (part.equals("\n")) {
                modifiedText.append(part);
            } else {
                String[] partWords = part.split("\\s+");
                for (String word : partWords) {
                    modifiedText.append(words[wordIndex++]).append(" ");
                }
                modifiedText.setLength(modifiedText.length() - 1);
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

    private String[] extractParts(String text) {
        return text.split("(?<=\\n)|(?=\\n)");
    }

    private String[] extractWords(String text) {
        return text.replaceAll("\\n", " ").split("\\s+");
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
}