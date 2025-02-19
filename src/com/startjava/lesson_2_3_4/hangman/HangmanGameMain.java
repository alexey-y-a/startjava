package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";

        while (userChoice.equalsIgnoreCase("yes")) {
            HangmanGame hangman = new HangmanGame();
            hangman.startGame(scanner);
            userChoice = getUserInput(scanner,
                    "Хотите сыграть еще раз? Введите 'yes' для продолжения или 'no' для завершения:");
        }

        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }

    private static String getUserInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine().trim().toLowerCase();
        while (!input.equals("yes") && !input.equals("no")) {
            System.out.println("Некорректный ввод. Введите 'yes' или 'no':");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input;
    }
}