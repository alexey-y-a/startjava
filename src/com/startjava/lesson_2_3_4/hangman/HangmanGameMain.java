package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueGame = "yes";

        while (continueGame.equalsIgnoreCase("yes")) {
            HangmanGame hangman = new HangmanGame();
            hangman.startGame(scanner);

            System.out.println("Хотите сыграть еще раз? Введите 'yes' для продолжения или 'no' для завершения:");
            continueGame = scanner.nextLine().trim().toLowerCase();

            if (!continueGame.equals("yes") && !continueGame.equals("no")) {
                System.out.println("Некорректный ввод. Введите 'yes' или 'no':");
                continueGame = scanner.nextLine().trim().toLowerCase();
            }
        }
        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}