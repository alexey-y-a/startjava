package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println("Введите имя первого игрока:");
            Player player1 = new Player(scanner.nextLine());
            System.out.println("Введите имя второго игрока:");
            Player player2 = new Player(scanner.nextLine());
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            response = inputResponse(scanner);
        } while (response.equals("yes"));
        System.out.println("Игра завершена!");
        scanner.close();
    }

    private static String inputResponse(Scanner scanner) {
        String response;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes") && !response.equals("no")) {
                System.out.println("Ошибка: введите 'yes' или 'no'");
            }
        } while (!response.equals("yes") && !response.equals("no"));
        return response;
    }
}