package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private final int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (Math.random() * Player.MAX_NUMBER) + Player.MIN_NUMBER;
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + Player.MAX_ATTEMPTS + " попыток");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Player.MAX_ATTEMPTS; i++) {
            System.out.println("Попытка " + i);
            boolean player1Guessed = makeGuess(player1, scanner, i);
            if (player1Guessed) {
                displayResults();
                return;
            }
            boolean player2Guessed = makeGuess(player2, scanner, i);
            if (player2Guessed) {
                displayResults();
                return;
            }
        }

        if (player1.getAttemptCount() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + player1.getName() + " закончились попытки!");
        }
        if (player2.getAttemptCount() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + player2.getName() + " закончились попытки!");
        }

        displayResults();
    }

    private int inputNumber(Player player, Scanner scanner) {
        while (true) {
            try {
                System.out.print("Число вводит " + player.getName() + ": ");
                int number = Integer.parseInt(scanner.nextLine());
                player.addNumber(number);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Попробуйте еще раз:");
            }
        }
    }

    private boolean checkNumber(Player player, int number, int attempt) {
        String message;
        if (number == secretNumber) {
            message = "равно";
        } else if (number < secretNumber) {
            message = "меньше";
        } else {
            message = "больше";
        }

        System.out.println("Число " + number + " " + message + " загаданного");

        if (number == secretNumber) {
            System.out.println(player.getName() + " угадал число " +
                    secretNumber + " с " + attempt + "-й попытки!");
            return true;
        }
        return false;
    }

    private boolean makeGuess(Player player, Scanner scanner, int attempt) {
        int number = inputNumber(player, scanner);
        return checkNumber(player, number, attempt);
    }

    private void displayResults() {
        System.out.println("Числа игрока " + player1.getName() + ": " + Arrays.toString(player1.getNumbers()));
        System.out.println("Числа игрока " + player2.getName() + ": " + Arrays.toString(player2.getNumbers()));
        player1.clear();
        player2.clear();
    }
}