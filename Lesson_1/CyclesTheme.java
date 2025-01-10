public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int i = start;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= end);
        System.out.println("В отрезке [" + start + ", " + end + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

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
        for (int j = max; j > min; j--) {
            System.out.println(j + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 1234;
        int digits = 0;
        int sum = 0;
        System.out.print("Числа поразрядно начиная с единиц: ");
        while (num4 > 0) {
            digits = num4 % 10;
            System.out.print(digits + " ");
            sum += digits;
            num4 = (num4 % 10) / 10;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int startRange = 1;
        int endRange = 24;
        int numbersPerLine = 5;
        int count = 0;
        for (int k = startRange; k < endRange; k++) {
            if (k % 2 != 0) {
                System.out.printf("%2d ", i);
                count++;
                if (count == numbersPerLine) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        if (count > 0) {
            for (int k = count; k < numbersPerLine; k++) {
                System.out.printf("%2d ", 0);
            }
        }
        System.out.println();

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num5 = 3242592;
        int count1 = 0;
        int digit = 0;
        while (num5 > 0) {
            digit = num5 % 10;
            if (digit == 2) {
                count1++;
            }
            num5 = (num5 % 10) / 10;
        }
        if (count1 % 2 == 0) {
            System.out.println("В 3242592 четное " + "(" + count1 + ")" + " количество двоек");
        } else {
            System.out.println("В 3242592 нечетное " + "(" + count1 + ")" + " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур\n");

        String asterisk = "**********";
        for (int k = 1; k <= 5; k++) {
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
        for (int k = 33; k < 48; k++) {
            if (k % 2 != 0) {
                System.out.printf("%8d %8c           %s%n", k, (char) k, Character.getName(k));
            } 
        }
        for (int k = 97; k <= 122; k++) {
            if (k % 2 == 0) {
                System.out.printf("%8d %8c           %s%n", k, (char) k, Character.getName(k));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int num7 = 1234321;
        int original = num7;
        int reversed = 0;
        while (num7 > 0) {
            int digit2 = num7 % 10;
            reversed = reversed * 10 + digit2;
            num7 = (num7 % 10) / 10;
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
            firstHalf = (firstHalf % 10) / 10; 
        }
        while (secondHalf > 0) {
            sumSecondHalf += secondHalf % 10;
            secondHalf = (secondHalf % 10) / 10;
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