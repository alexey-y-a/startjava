package com.startjava.lesson_2_3_4.array;

public class Factorial {

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        long[] resultsEmpty = calculateFactorials(emptyArray);
        printFactorials(emptyArray, resultsEmpty);

        int[] nullArray = null;
        long[] resultsNull = calculateFactorials(nullArray);
        printFactorials(nullArray, resultsNull);

        int[] positiveNumbers = {8, 0, 9};
        long[] resultsPositive = calculateFactorials(positiveNumbers);
        printFactorials(positiveNumbers, resultsPositive);

        int[] mixedNumbers = {-3, 1, 7, 13};
        long[] resultsMixed = calculateFactorials(mixedNumbers);
        printFactorials(mixedNumbers, resultsMixed);

        int[] negativeNumbers = {-22, -0};
        long[] resultsNegative = calculateFactorials(negativeNumbers);
        printFactorials(negativeNumbers, resultsNegative);
    }

    private static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Массив является null.");
            return null;
        }
        if (numbers.length == 0) {
            System.out.println("Массив пустой.");
            return new long[0];
        }

        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен.");
                results[i] = -1;
            } else {
                results[i] = calculateFactorial(number);
            }
        }
        return results;
    }

    private static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static void printFactorials(int[] numbers, long[] results) {
        if (numbers == null || results == null) {
            return;
        }
        if (numbers.length == 0) {
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            long result = results[i];
            if (result == -1) {
                continue;
            }

            System.out.print(number + "! = ");
            System.out.print((number == 0) ? "1" : buildFactorialExpression(number));
            System.out.println(" = " + result);
        }
    }

    private static String buildFactorialExpression(int number) {
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            expression.append(i);
            if (i < number) {
                expression.append(" * ");
            }
        }
        return expression.toString();
    }
}