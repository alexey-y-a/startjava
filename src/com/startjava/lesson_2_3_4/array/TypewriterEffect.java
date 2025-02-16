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

        for (String originalText : testStrings) {
            String processedText = typewriter.processText(originalText);
            typewriter.type(processedText);
            System.out.println();
        }
    }

    private String processText(String originalText) {
        if (originalText == null || originalText.isEmpty()) {
            return "пустая строка.";
        }

        String[] words = extractWords(originalText);
        if (words == null || words.length == 0) {
            return "Слова в тексте отсутствуют.";
        }

        String[] shortestAndLongest = findShortestAndLongestWord(words);
        String shortestWord = shortestAndLongest[0];
        String longestWord = shortestAndLongest[1];

        int startIndex = indexOfWord(words, shortestWord);
        int endIndex = indexOfWord(words, longestWord);

        if (startIndex > endIndex) {
            int temp = startIndex;
            startIndex = endIndex;
            endIndex = temp;
        }

        String[] parts = originalText.split(
                "(?<=\\S)(?=\\s)|(?<=\\s)(?=\\S)|(?<=\\p{Punct})(?=\\S)|(?<=\\S)(?=\\p{Punct})");
        StringBuilder modifiedText = new StringBuilder();
        int currentWordIndex = 0;
        for (String part : parts) {
            if (part.trim().isEmpty() || isPunctuation(part)) {
                modifiedText.append(part);
            } else {
                if (currentWordIndex >= startIndex && currentWordIndex <= endIndex) {
                    modifiedText.append(words[currentWordIndex].toUpperCase());
                } else {
                    modifiedText.append(words[currentWordIndex]);
                }
                currentWordIndex++;
            }
        }
        return modifiedText.toString();
    }

    private void type(String text) {
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

    private String[] extractWords(String text) {
        return text.replaceAll("[\\p{Punct}\\s]+", " ").trim().split("\\s+");
    }

    private String[] findShortestAndLongestWord(String[] words) {
        String shortest = words[0];
        String longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
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