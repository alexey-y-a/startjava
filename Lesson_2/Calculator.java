public class Calculator {

    public static int calculate(int num1, char operator, int num2) {
        int result = 0;
        if ((operator == '/' || operator == '%') && isDivisionZero(num2)) {
            System.out.println("Ошибка: деление на ноль");
            return Integer.MIN_VALUE;
        }
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
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
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                return Integer.MIN_VALUE;
            }
        }
        return result;
    }
    
    private static boolean isDivisionZero(int num) {
        return num == 0;
    }
}