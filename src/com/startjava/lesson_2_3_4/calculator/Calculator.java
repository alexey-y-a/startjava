package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(int num1, char operator, int num2) {
        try {
            return switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> division(num1, num2);
                case '%' -> num1 % num2;
                case '^' -> Math.pow(num1, num2);
                default -> {
                    System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                    yield Double.NaN;
                }
            };
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return Double.NaN;
        }
    }

    private static double division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: деление на ноль");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }
}