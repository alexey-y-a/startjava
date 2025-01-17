import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            String result = Calculator.calculate(num1, num2, operator);
            System.out.println(result);
            String response;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                response = scanner.next().toLowerCase();
            } while (!response.equals("yes") && !response.equals("no"));
            if (response.equals("no")) {
                break;
            }
        }
        System.out.println("Программа завершена");
        scanner.close();
    }
}