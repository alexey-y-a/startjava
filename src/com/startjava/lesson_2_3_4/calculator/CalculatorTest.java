package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        do {
            System.out.print("Введите выражение из трех аргументов, например, 2 ^ 10: ");
            String expression = scanner.nextLine().trim();
            String[] parts = expression.split("\\s+");

            if (parts.length != 3) {
                System.out.println("Ошибка: выражение должно состоять из трех частей (число оператор число)");
                continue;
            }

            try {
                int num1 = Integer.parseInt(parts[0]);
                char operator = parts[1].charAt(0);
                int num2 = Integer.parseInt(parts[2]);
                double result = Calculator.calculate(num1, operator, num2);
                if (!Double.isNaN(result)) {
                    printResult(num1, operator, num2, result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректные числа");
            }
            response = inputResponse(scanner);
        } while (response.equals("yes"));
        System.out.println("Программа завершена");
        scanner.close();
    }

    private static String inputResponse(Scanner scanner) {
        String response;
        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            response = scanner.next().toLowerCase();
            scanner.nextLine();
            if (response.equals("yes") || response.equals("no")) {
                break;
            }
            System.out.println("Введите корректный ответ [yes / no]:");
        }
        return response;
    }

    private static void printResult(int num1, char operator, int num2, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        String formatedResult = df.format(result).replace(',', '.');
        System.out.println(num1 + " " + operator + " " + num2 + " = " + formatedResult);
    }
}