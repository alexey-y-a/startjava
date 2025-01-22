import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            int num1 = inputNumber("Введите первое число: ", scanner);
            char operator = inputOperator("Введите знак операции (+, -, *, /, ^, %): ", scanner);
            int num2 = inputNumber("Введите второе число", scanner);
            int result = Calculator.calculate(num1, operator, num2);
            printResult(num1, operator, num2, result);
            response = inputResponse("Хотите продолжить вычисления? [yes/no]: ", scanner);
        } while (response.equals("yes"));
        System.out.println("Программа завершена");
        scanner.close();
    }

    private static int inputNumber(String message, Scanner scanner) {
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое число");
            System.out.print(message);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static char inputOperator(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            String input = scanner.next();
            if (input.length() == 1) {
                char operator = input.charAt(0);
                if ("+-*/^%".indexOf(operator) != -1) {
                    return operator;
                }
            }
            System.out.println("Ошибка: введите корректный оператор (+, -, *, /, ^, %)");
        }
    }

    private static String inputResponse(String message, Scanner scanner) {
        String response;
        do {
            System.out.print(message);
            response = scanner.next().toLowerCase();
            if (!response.equals("yes") && !response.equals("no")) {
                System.out.println("Ошибка: введите 'yes' или 'no'");
            }
        } while (!response.equals("yes") && !response.equals("no"));
        return response;
    }

    private static void printResult(int num1, char operator, int num2, int result) {
        if (result != Integer.MIN_VALUE) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}