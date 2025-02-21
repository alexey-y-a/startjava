package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";
        while (!"no".equals(option)) {
            if ("yes".equals(option)) {
                System.out.println("Введите имя первого игрока:");
                Player player1 = new Player(scanner.nextLine());
                System.out.println("Введите имя второго игрока:");
                Player player2 = new Player(scanner.nextLine());
                new GuessNumber(player1, player2).start();
                System.out.print("Хотите продолжить игру? [yes/no]: ");
            } else {
                System.out.print("Введите корректный ответ [yes/no]: ");
            }
            option = scanner.nextLine().trim().toLowerCase();
        }
        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}