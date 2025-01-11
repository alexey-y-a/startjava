public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        int currentNumber = start;
        do {
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
            currentNumber++;
        } while (currentNumber <= end);
        System.out.println("В отрезке [" + start + ", " + end + 
                "] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        for (int i = max; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 1234;
        int sum = 0;
        while (num4 > 0) {
            int digit = num4 % 10;
            System.out.print(digit);
            sum += digit;
            num4 /= 10;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        start = 1;
        end = 24;
        int numbersPerLine = 5;
        int count = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                count++;
                if (count == numbersPerLine) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        if (count > 0) {
            for (int i = count; i < numbersPerLine; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println();
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num5 = 3242592;
        int numberTwos = 0;
        while (num5 > 0) {
            int digit1 = num5 % 10;
            if (digit1 == 2) {
                numberTwos++;
            }
            num5 /= 10;
        }
        if (numberTwos % 2 == 0) {
            System.out.println("В " + num5 + " четное " + "(" + 
                    numberTwos + ")" + " количество двоек");
        } else {
            System.out.println("В " + num5 + " нечетное " + "(" + 
                    numberTwos + ")" + " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур\n");

        String asterisk = "**********";
        for (int i = 1; i <= 5; i++) {
            System.out.println(asterisk);
        }
        System.out.println();

        int rows = 5;
        int currentRow = 0;
        while (currentRow < 5) {
            int symbol = rows - currentRow;
            int count2 = 0;
            while (count2 < symbol) {
                System.out.print("#");
                count2++;
            }
            System.out.println();
            currentRow++;
        }
        System.out.println();

        int height = 3;
        int currentRow1 = 1;
        do {
            int dollar = 1;
            do {
                System.out.print("$");
                dollar++;
            } while (dollar <= currentRow1);
            System.out.println();
            currentRow1++;
        } while (currentRow1 <= height);
        currentRow1 = height - 1;
        do {
            int dollar = 1;
            do {
                System.out.print("$");
                dollar++;
            } while (dollar <= currentRow1);
            System.out.println();
            currentRow1--;
        } while (currentRow1 >= 1);

        System.out.println("\n7. Вывод ASCII-символов\n");

        System.out.printf("%10s %10s %12s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%8d %8c           %s%n", i, (char) i, Character.getName(i));
            } 
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%8d %8c           %s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int num7 = 1234321;
        int original = num7;
        int reversed = 0;
        while (num7 > 0) {
            int digit2 = num7 % 10;
            reversed = reversed * 10 + digit2;
            num7 /= 10;
        }
        if (original == reversed) {
            System.out.println("Число " + original + " - палиндром");
        } else {
            System.out.println("Число " + original + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        int num8 = 123321;
        int firstHalf = num8 / 1000;
        int secondHalf = num8 % 1000;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        while (firstHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10; 
        }
        while (secondHalf > 0) {
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + num8 + " - счастливое");
        } else {
            System.out.println("Число " + num8 + " - несчастливое");
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + sumFirstHalf);
        System.out.println("Сумма " + secondHalf + " = " + sumSecondHalf);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        System.out.println("    ТАБЛИЦА    ПИФАГОРА\n");
        System.out.print("   |");
        for (int k = 2; k <= 9; k++) {
            System.out.printf("%3d", k);
        }
        System.out.println();
        System.out.println("----------------------------");
        for (int k = 2; k <= 9; k++) {
            System.out.printf("%2d |", k);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", k * j);
            }
            System.out.println();
        }
    }
}