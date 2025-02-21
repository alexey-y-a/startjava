package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int MAX_ATTEMPTS = 10;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;

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

    public void addNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("Число должно входить в отрезок " +
                    "[\" + MIN_NUMBER + \", \" + MAX_NUMBER + \"]");
        }
        if (attemptCount < MAX_ATTEMPTS) {
            numbers[attemptCount++] = number;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptCount);
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attemptCount, 0);
        attemptCount = 0;
    }
}