package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(String expression) {
        String[] parts = expression.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Ошибка: выражение должно состоять из трех частей (число оператор число)");
            return Double.NaN;
        }

        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите корректные числа");
            return Double.NaN;
        }

        char operator = parts[1].charAt(0);

        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> division(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> Math.pow(num1, num2);
            default -> {
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                yield Double.NaN;
            }
        };
    }

    private static double division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: деление на ноль");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }
}