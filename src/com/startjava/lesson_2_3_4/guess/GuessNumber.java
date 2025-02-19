package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private static final int MAX_ATTEMPTS = 10;
    private final Player player1;
    private final Player player2;
    private final int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (Math.random() * 100) + 1;
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + MAX_ATTEMPTS + " попыток");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
            System.out.println("Попытка " + i);
            if (makeGuess(player1, scanner, i) || makeGuess(player1, scanner, i)) {
                displayResults();
                return;
            }
        }

        System.out.println("у " + player1.getName() + " закончились попытки!");
        System.out.println("у " + player2.getName() + " закончились попытки!");
        displayResults();
    }

    private boolean makeGuess(Player player, Scanner scanner, int attempt) {
        while (true) {
            try {
                System.out.println("Число вводит " + player.getName() + ": ");
                int number = Integer.parseInt(scanner.nextLine());
                player.addNumber(number);
                String message = number == secretNumber ? "равно" :
                        (number < secretNumber ? "меньше" : "больше");
                System.out.println("Число " + number + " " + message + " загаданного");
                if (number == secretNumber) {
                    System.out.println(player.getName() + " угадал число " +
                            secretNumber + " с " + attempt + "-й попытки!");
                    return true;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Попробуйте еще раз:");
            }
        }
        return false;
    }

    private void displayResults() {
        System.out.println("Числа игрока " + player1.getName() + ": " + Arrays.toString(player1.getNumbers()));
        System.out.println("Числа игрока " + player2.getName() + ": " + Arrays.toString(player2.getNumbers()));

        player1.clearNumbers();
        player2.clearNumbers();
    }
}