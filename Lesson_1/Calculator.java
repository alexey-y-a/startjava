public class Calculator {
    
    public static void main(String[] args) {
        System.out.println("\nКалькулятор\n");

        int num1 = 2;
        int num2 = 10;
        char operator = '^';
        if ((operator == '/' || operator == '%') && num2 == 0) {
            System.out.println("Ошибка: деление на ноль");
            return;
        }
        int result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> {
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
            }
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Ошибка: неподдерживаемая операция");
                return;
            }
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}