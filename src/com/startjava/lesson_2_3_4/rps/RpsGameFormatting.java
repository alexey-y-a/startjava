package com.startjava.lesson_2_3_4.rps;

import java.util.Random;
import java.util.Scanner;

// Игра Камень-Ножницы-Бумага
public class RpsGameFormatting {

    private static final String ROCK = "R";
    private static final String SCISSORS = "S";
    private static final String PAPER = "P";

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        String name1 = inputName(console);
        String name2 = inputName(console);

        // Ход первого игрока
        int position = generatePosition(name1, random);
        String sign1 = determineSign(position);
        showSigns(sign1);

        // Ход второго игрока
        position = generatePosition(name2, random);
        String sign2 = determineSign(position);
        showSigns(sign2);

        determineWinner(name1, sign1, name2, sign2);

        console.close();
    }

    private static String inputName(Scanner console) {
        System.out.print("Введите имя игрока: ");
        return console.nextLine();
    }

    private static int generatePosition(String name, Random random) {
        System.out.println("Ход " + name + ": ");
        return random.nextInt(100) + 1;
    }

    private static String determineSign(int position) {
        if (position > 66) return ROCK;
        if (position > 33) return SCISSORS;
        return PAPER;
    }

    private static void showSigns(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(100);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(100);
            System.out.print(PAPER + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign);
    }

    private static void determineWinner(String name1, String sign1, String name2, String sign2) {
        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }

        boolean isWinner1 = sign1.equals(ROCK) && sign2.equals(SCISSORS) ||
                sign1.equals(SCISSORS) && sign2.equals(PAPER) ||
                sign1.equals(PAPER) && sign2.equals(ROCK);
        if (isWinner1) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }
}