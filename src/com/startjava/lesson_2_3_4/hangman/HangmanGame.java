package com.startjava.lesson_2_3_4.hangman;

import java.util.Random;
import java.util.Scanner;

class HangmanGame {
    private static final String[] WORDS = {"КОМПЬЮТЕР", "ТЕЛЕФОН", "ПРОГРАММА", "ИНТЕРНЕТ", "МОНИТОР"};
    private static final String[] HANGMAN = {
            "_______",
            "|     |",
            "|     @",
            "|    /|\\",
            "|    / \\",
            "| GAME OVER!"
    };
    private static final int MAX_ATTEMPTS = HANGMAN.length;

    private String wordToGuess;
    private char[] guessedWordMask;
    private boolean[] hangmanState;
    private StringBuilder wrongLetters;
    private int attemptsLeft;

    public HangmanGame() {
        this.wordToGuess = getRandomWord();
        this.guessedWordMask = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWordMask.length; i++) {
            guessedWordMask[i] = '_';
        }
        this.hangmanState = new boolean[HANGMAN.length];
        this.wrongLetters = new StringBuilder();
        this.attemptsLeft = MAX_ATTEMPTS;
    }

    public void startGame(Scanner scanner) {
        System.out.println("Добро пожаловать в игру 'Виселица'!");

        while (attemptsLeft > 0 && new String(guessedWordMask).contains("_")) {
            displayGameState();
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

            if (wordToGuess.indexOf(letter) >= 0) {
                updateGuessedWordMask(letter);
                if (attemptsLeft < MAX_ATTEMPTS) {
                    rollbackHangman();
                    attemptsLeft++;
                }
                System.out.printf("Буква '%s' есть в слове!%n", letter);
            } else {
                addWrongLetter(letter);
                attemptsLeft--;
                System.out.printf("Буквы '%s' нет в слове.%n", letter);
            }
        }

        if (new String(guessedWordMask).contains("_")) {
            System.out.println("Вы проиграли! Загаданное слово было: " + wordToGuess);
        } else {
            System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess);
        }
    }

    private void displayGameState() {
        System.out.println("\nТекущее состояние игры:");
        System.out.println("Загаданное слово: " + new String(guessedWordMask));
        System.out.println("Ошибочные буквы: " + wrongLetters);
        System.out.println("Количество попыток: " + attemptsLeft);
        System.out.println("Виселица:");
        for (int i = 0; i < hangmanState.length; i++) {
            System.out.println(hangmanState[i] ? HANGMAN[i] : "");
        }
    }

    private boolean isValidInput(String input) {
        return input.length() == 1 && Character.UnicodeBlock.of(input.charAt(0)) == Character.UnicodeBlock.CYRILLIC;
    }

    private boolean isLetterGuessed(char letter) {
        return new String(guessedWordMask).indexOf(letter) >= 0 || wrongLetters.indexOf(String.valueOf(letter)) >= 0;
    }

    private void updateGuessedWordMask(char letter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedWordMask[i] = letter;
            }
        }
    }

    private void addWrongLetter(char letter) {
        if (wrongLetters.indexOf(String.valueOf(letter)) < 0) {
            wrongLetters.append(letter).append(" ");
            hangmanState[MAX_ATTEMPTS - attemptsLeft] = true;
        }
    }

    private void rollbackHangman() {
        for (int i = hangmanState.length - 1; i >= 0; i--) {
            if (hangmanState[i]) {
                hangmanState[i] = false;
                break;
            }
        }
    }

    private String getRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}