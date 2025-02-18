package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.print("Введите выражение из трех аргументов, например, 2 ^ 10: ");
            String expression = scanner.nextLine().trim();
            double result = Calculator.calculate(expression);
            printResult(expression, result);
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
                return response;
            }
            System.out.println("Введите корректный ответ [yes / no]:");
        }
    }

    private static void printResult(String expression, double result) {
        if (!Double.isNaN(result)) {
            DecimalFormat df = new DecimalFormat("#.###");
            String formattedResult = df.format(result).replace(',', '.');
            System.out.println(expression + " = " + formattedResult);
        }
    }
}