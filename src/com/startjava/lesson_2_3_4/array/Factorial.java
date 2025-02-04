package com.startjava.lesson_2_3_4.array;

public class Factorial {

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        long[] resultsEmpty = calculate(emptyArray);
        printMathExpressions(emptyArray, resultsEmpty);

        int[] nullArray = null;
        long[] resultsNull = calculate(nullArray);
        printMathExpressions(nullArray, resultsNull);

        int[] positiveNumbers = {8, 0, 9};
        long[] resultsPositive = calculate(positiveNumbers);
        printMathExpressions(positiveNumbers, resultsPositive);

        int[] mixedNumbers = {-3, 1, 7, 13};
        long[] resultsMixed = calculate(mixedNumbers);
        printMathExpressions(mixedNumbers, resultsMixed);

        int[] negativeNumbers = {-22, -0};
        long[] resultsNegative = calculate(negativeNumbers);
        printMathExpressions(negativeNumbers, resultsNegative);
    }

    private static long[] calculate(int... numbers) {
        if (numbers == null) {
            System.out.println("Массив является null.");
            return null;
        }
        if (numbers.length == 0) {
            System.out.println("Массив пустой.");
            return new long[0];
        }

        long[] factorials = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                System.out.println("Ошибка: факториал " + number + "! не определен.");
                continue;
            }
            factorials[i] = calculateFactorial(number);
        }
        return factorials;
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

    private static void printMathExpressions(int[] numbers, long[] factorials) {
        if (numbers == null || factorials == null) {
            return;
        }
        if (numbers.length == 0) {
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                continue;
            }
            long factorial = factorials[i];

            System.out.print(number + "! = ");
            System.out.print((number == 0 || number == 1) ? "1" : buildFactorialExpression(number));
            System.out.println(" = " + factorial);
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