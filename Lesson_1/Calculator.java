public class Calculator {
    
    public static void main(String[] args) {
        System.out.println("\nКалькулятор\n");

        int num1 = 2;
        int num2 = 10;
        int result = 0;
        char operator = '^';
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else { 
                System.out.println("Ошибка: деление на ноль");
                return;
            }
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                System.out.println("Ошибка: деление на ноль");
                return;
            }
        } else {
            System.out.println("Ошибка: неподдерживаемая операция");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}