package com.startjava.lesson_1.final_;

import java.util.Random;

public class RpsGameFormatting {

    // Игра Камень-Ножницы-Бумага
    public static void main(String[] args) throws InterruptedException {
        String rock = "R";
        String scissors = "S";
        String paper = "P";

        // Ход первого игрока
        String firstPlayerName = "HEL";
        Random random = new Random();
        int firstPlayerChoice = random.nextInt(1, 100);
        String firstPlayerSign = rock;
        if (firstPlayerChoice > 66) {
            firstPlayerSign = paper;
        } else if (firstPlayerChoice > 33) {
            firstPlayerSign = scissors;
        }
        System.out.println("Ход " + firstPlayerName + ": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(firstPlayerSign);

        // Ход второго игрока
        String secondPlayerName = "WALLE";
        int secondPlayerChoice = random.nextInt(1, 100);
        String secondPlayerSign = rock;
        if (secondPlayerChoice > 66) {
            secondPlayerSign = paper;
        } else if (secondPlayerChoice > 33) {
            secondPlayerSign = scissors;
        }
        System.out.println("Ход " + secondPlayerName + ": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(secondPlayerSign);
        if (firstPlayerSign.equals(secondPlayerSign)) {
            System.out.println("Победила дружба!");
            return;
        }
        boolean isFirstPlayerWinner = (firstPlayerSign.equals(rock) && 
                secondPlayerSign.equals(scissors) || firstPlayerSign.equals(scissors) && 
                secondPlayerSign.equals(paper) || firstPlayerSign.equals(paper) && 
                secondPlayerSign.equals(rock));
        if (isFirstPlayerWinner) {
            System.out.println("\nПобедил - " + firstPlayerName);
        } else {
            System.out.println("\nПобедил - " + secondPlayerName);
        }
    }
}