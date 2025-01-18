public class Calculator {

    public static int calculate(int num1, char operator, int num2) {
        int result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    return Integer.MIN_VALUE;
                }
                result = num1 / num2;
            }
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
            case '%' -> {
                if (num2 == 0) {
                    return Integer.MIN_VALUE;
                }
                result = num1 % num2;
            }
            default -> {
                return Integer.MIN_VALUE;
            }
        }
        return result;
    }
}