public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        int currNumber = start;
        do {
            if (currNumber % 2 == 0) {
                evenSum += currNumber;
            } else {
                oddSum += currNumber;
            }
            currNumber++;
        } while (currNumber <= end);
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
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

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

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num5 = 3242592;
        int twosNumber = 0;
        while (num5 > 0) {
            int digit = num5 % 10;
            if (digit == 2) {
                twosNumber++;
            }
            num5 /= 10;
        }
        String twosEvenessStatus;
        if (twosNumber % 2 == 0) {
            twosEvenessStatus = "четное";
        } else {
            twosEvenessStatus = "нечетное";
        }
        System.out.println("В " + num5 + " " + twosEvenessStatus + 
                " (" + twosNumber + ") количество двоек");

        System.out.println("\n6. Вывод геометрических фигур\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int rows = 5;
        int currRow = 0;
        while (currRow < 5) {
            int symbol = rows - currRow;
            int count2 = 0;
            while (count2 < symbol) {
                System.out.print("#");
                count2++;
            }
            System.out.println();
            currRow++;
        }
        System.out.println();

        int height = 3;
        currRow = 1;
        do {
            int dollar = 1;
            while (dollar <= currRow) {
                System.out.print("$");
                dollar++;
            } 
            System.out.println();
            currRow++;
        } while (currRow <= height);
        currRow = height - 1;
        do {
            int dollar = 1;
            while (dollar <= currRow) {
                System.out.print("$");
                dollar++;
            }
            System.out.println();
            currRow--;
        } while (currRow >= 1);

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
        int num7Copy = num7;
        int reversed = 0;
        while (num7 > 0) {
            int digit = num7 % 10;
            reversed = reversed * 10 + digit;
            num7 /= 10;
        }
        if (num7Copy == reversed) {
            System.out.println("Число " + num7Copy + " - палиндром");
        } else {
            System.out.println("Число " + num7Copy + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым\n");

        int num8 = 123321;
        int firstHalf = num8 / 1000;
        int secondHalf = num8 % 1000;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        int tempFirst = firstHalf;
        int tempSecond = secondHalf;
        while (tempFirst > 0 || tempSecond > 0) {
            if (tempFirst > 0) {
                firstHalfSum += tempFirst % 10;
                tempFirst /= 10;
            }
            if (tempSecond > 0) {
                secondHalfSum += tempSecond % 10;
                tempSecond /= 10;
            }
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + num8 + " - счастливое");
        } else {
            System.out.println("Число " + num8 + " - несчастливое");
        }
        System.out.println("Сумма цифр " + firstHalf + " = " + firstHalfSum);
        System.out.println("Сумма " + secondHalf + " = " + secondHalfSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        System.out.println("    ТАБЛИЦА    ПИФАГОРА\n");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}