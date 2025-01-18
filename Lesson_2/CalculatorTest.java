import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите выражение (например, 2 + 3): ");
            int num1 = scanner.nextInt();
            char operator = scanner.next().charAt(0);
            int num2 = scanner.nextInt();
            int result = Calculator.calculate(num1, operator, num2);
            if (result == Integer.MIN_VALUE) {
                System.out.println("Ошибка: некорректная операция или деление на ноль");
            } else {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                break;
            }
        }
        System.out.println("Программа завершена");
        scanner.close();
    }
}