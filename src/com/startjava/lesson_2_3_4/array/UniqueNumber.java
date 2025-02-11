package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueNumber {
    public static void main(String[] args) {
        UniqueNumber generator = new UniqueNumber();

        int[][] testCases = {
                {-30, -10, 23},
                {10, 50, 10},
                {-34, -34, 0},
                {-1, 2, -3},
                {5, -8, 2}
        };
        for (int[] testCase : testCases) {
            int leftBound = testCase[0];
            int rightBound = testCase[1];
            int numbersPerLine = testCase[2];

            System.out.printf("Генерация массива для границ (%d, %d):%n", leftBound, rightBound);
            int[] result = generator.generateUniqueNumbers(leftBound, rightBound);
            printFormattedArray(result, numbersPerLine);
            System.out.println();
        }
    }

    private int[] generateUniqueNumbers(int leftBound, int rightBound) {
        if (leftBound > rightBound) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n", leftBound, rightBound);
            return null;
        }

        int segmentLength = rightBound - leftBound + 1;
        int arrayLength = (int) (segmentLength * 0.75);

        if (arrayLength <= 0) {
            System.out.printf("Ошибка: длина массива должна быть > 0 (%d)%n", arrayLength);
            return null;
        }

        Random random = new Random();
        int[] result = new int[arrayLength];
        int uniqueCount = 0;

        while (uniqueCount < arrayLength) {
            int randomNumber = leftBound + random.nextInt(segmentLength);

            boolean isUnique = true;
            for (int i = 0; i < uniqueCount; i++) {
                if (result[i] == randomNumber) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[uniqueCount++] = randomNumber;
            }
        }

        Arrays.sort(result);
        return result;
    }

    private static void printFormattedArray(int[] array, int numbersPerLine) {
        if (array == null) {
            return;
        }

        if (numbersPerLine < 1) {
            System.out.printf("Ошибка: количество чисел в строке не должно быть < 1 (%d)%n", numbersPerLine);
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}