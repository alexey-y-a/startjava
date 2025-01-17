public class Calculator {

    public static String calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    return "Ошибка: деление на ноль запрещено";
                }
                result = num1 / num2;
            }
            case '^' -> {
                result = 1;
                if (num2 < 0) {
                    for (int i = 0; i < -num2; i++) {
                        result *= num1;
                    }
                    result = 1 / result;
                } else {
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                }
            }
            case '%' -> {
                if (num2 == 0) {
                    return "Ошибка: деление на ноль запрещено";
                }
                result = num1 % num2;
            }
            default -> {
                return "Ошибка: операция '" + operator + "'не поддерживается";
            }
        }
        return num1 + " " + operator + " " + num2 + " = " + result;
    }
}