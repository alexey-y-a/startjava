package com.startjava.lesson_2_3_4.hangman;

import java.util.Random;
import java.util.Scanner;

class HangmanGame {
    private final String[] words = {"КОМПЬЮТЕР", "ТЕЛЕФОН", "ПРОГРАММА", "ИНТЕРНЕТ", "МОНИТОР"};
    private final String[] gallows = {
            "_______",
            "|     |",
            "|     @",
            "|    /|\\",
            "|    / \\",
            "| GAME OVER!"
    };
    private static final int MAX_ATTEMPTS = 6;
    private final String wordToGuess;
    private final StringBuilder guessedWordMask;
    private final StringBuilder wrongLetters;
    private int attemptsLeft;

    public HangmanGame() {
        wordToGuess = chooseGuessingWord();
        guessedWordMask = new StringBuilder("_".repeat(wordToGuess.length()));
        wrongLetters = new StringBuilder();
        attemptsLeft = MAX_ATTEMPTS;
    }

    private String chooseGuessingWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    public void startGame(Scanner scanner) {
        System.out.println("Добро пожаловать в игру 'Виселица'!");

        while (attemptsLeft > 0 && guessedWordMask.indexOf("_") != -1) {
            displayGameState();
            char letter = getValidLetter(scanner);
            if (wordToGuess.indexOf(letter) >= 0) {
                updateGuessedWordMask(letter);
                System.out.printf("Буква '%s' есть в слове!%n", letter);
            } else {
                addWrongLetter(letter);
                attemptsLeft--;
                System.out.printf("Буквы '%s' нет в слове.%n", letter);
            }
        }
        if (String.valueOf(guessedWordMask).contains("_")) {
            System.out.println("Вы проиграли! Загаданное слово было: " + wordToGuess);
        } else {
            System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess);
        }
    }

    private char getValidLetter(Scanner scanner) {
        while (true) {
            System.out.println("Введите букву (кириллица):");
            String input = scanner.nextLine().trim().toUpperCase();
            if (!isValidInput(input)) {
                System.out.println("Некорректный ввод. Пожалуйста, введите одну кириллическую букву.");
                continue;
            }
            char letter = input.charAt(0);
            if (isLetterGuessed(letter)) {
                System.out.println("Эта буква уже была введена ранее.");
                continue;
            }
            return letter;
        }
    }

    private boolean isValidInput(String input) {
        return input.length() == 1 && input.matches("[А-Я]");
    }

    private boolean isLetterGuessed(char letter) {
        return guessedWordMask.indexOf(String.valueOf(letter)) != -1 ||
                wrongLetters.indexOf(String.valueOf(letter)) != -1;
    }

    private void updateGuessedWordMask(char letter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedWordMask.setCharAt(i, letter);
            }
        }
    }

    private void addWrongLetter(char letter) {
        if (wrongLetters.indexOf(String.valueOf(letter)) < 0) {
            wrongLetters.append(letter).append(" ");
        }
    }

    private void displayGameState() {
        System.out.println("\nТекущее состояние игры:");
        System.out.println("Загаданное слово: " + new String(guessedWordMask));
        System.out.println("Ошибочные буквы: " + wrongLetters);
        System.out.println("Количество попыток: " + attemptsLeft);
        System.out.println("Виселица:");
        for (int i = 0; i < MAX_ATTEMPTS - attemptsLeft; i++) {
            System.out.println(gallows[i]);
        }
    }
}