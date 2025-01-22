public class Calculator {

    public static int calculate(int num1, char operator, int num2) {
        int result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/', '%' -> result = division(num1, operator, num2);
            case '^' -> {
                result = 1;
                int power = Math.abs(num2);
                for (int i = 0; i < power; i++) {
                    result *= num1;
                }
                if (num2 < 0) {
                    result = 1 / result;
                }
            }
            default -> {
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                return Integer.MIN_VALUE;
            }
        }
        return result;
    }

    private static int division(int num1, char operator, int num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: деление на ноль");
            return Integer.MIN_VALUE;
        }
        return operator == '/' ? num1 / num2 : num1 % num2;
    }
}