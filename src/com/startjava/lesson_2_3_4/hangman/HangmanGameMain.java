package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        while (!"no".equals(option)) {
            if ("yes".equals(option)) {
                new HangmanGame().play(scanner);
                System.out.print("\nХотите продолжить игру? [yes / no]: ");
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }
            option = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}