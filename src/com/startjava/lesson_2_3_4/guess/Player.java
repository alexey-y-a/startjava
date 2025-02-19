package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS];
    private int attemptCount;

    public Player(String name) {
        this.name = name;
        this.attemptCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) throws IllegalArgumentException {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Число должно входить в отрезок [1, 100]");
        }
        if (attemptCount < MAX_ATTEMPTS) {
            numbers[attemptCount++] = number;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptCount);
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attemptCount, 0);
        attemptCount = 0;
    }

    public int getAttemptCount() {
        return attemptCount;
    }
}