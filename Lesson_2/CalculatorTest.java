import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            int num1;
            System.out.println("Введите первое число:");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка: введите целое число");
                System.out.print("Введите первое число: ");
                scanner.next();
            }
            num1 = scanner.nextInt();
            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число");
                System.out.print("Введите второе число: ");
                scanner.next();
            }
            int num2 = scanner.nextInt();
            int result = Calculator.calculate(num1, operator, num2);
            if (result != Integer.MIN_VALUE) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } 
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                response = scanner.next().toLowerCase();
                if (!response.equals("yes") && !response.equals("no")) {
                    System.out.println("Ошибка: введите 'yes' или 'no'");
                }
            } while (!response.equals("yes") && !response.equals("no"));
        } while (response.equals("yes"));
        System.out.println("Программа завершена");
        scanner.close();
    }
}