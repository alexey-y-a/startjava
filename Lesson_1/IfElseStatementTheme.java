public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        String gender = "f";
        if (gender.equals("f")) {
            System.out.println("Это девушка");
        } else {
            System.out.println("Это парень");
        }

        int age = 10;
        if (age > 18) {
            System.out.println("Совершенно летний");
        } else {
            System.out.println("Несовершенно летний");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Среднего роста");
        } else {
            System.out.println("Высокого роста");
        }

        char nameFirstLetter = "Alexey".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Первая буква имени совпадает с буквой М");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Первая буква имени совпадает с буквой I");
        } else {
            System.out.println("Первая буква имени не совпала ни с одной буквой");
        }

        System.out.println("\n2. Поиск большего числа\n");

        int num1 = 35;
        int num2 = 36;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num1 + " меньше числа " + num2);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Проверка числа\n");

        int num = -10;
        if (num == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " является четным");
            } else {
                System.out.println(num + " является нечетным");
            }

            if (num > 0) {
                System.out.println(" и положительным");
            } else {
                System.out.println(" и отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int num3 = 123;
        int num4 = 223;

        int ones1 = num3 % 10;
        int tens1 = (num3 / 10) % 10;
        int hundreds1 = num3 / 100;

        int ones2 = num4 % 10;
        int tens2 = (num4 / 10) % 10;
        int hundreds2 = num4 / 100;

        if (ones1 == ones2 || tens1 == tens2 || hundreds1 == hundreds2) {
            System.out.println("Исходные числа: " + num3 + " и " + num4);
            if (ones1 == ones2) {
                System.out.println("Одинаковые цифры в единицах: " + ones1);
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковые цифры в десятках: " + tens2);
            }
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковые цифры в сотнях: " + hundreds1);
            }
        } else {
            System.out.println("Равных цифр в одних и тех же разрядах нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char symbol = '\u0057';
        if (Character.isUpperCase(symbol)) {
            System.out.println("'" + symbol + "' - большая буква");
        } else if (Character.isLowerCase(symbol)) {
            System.out.println("'" + symbol + "' - маленькая буква");
        } else if (Character.isDigit(symbol)) {
            System.out.println("'" + symbol + "' - цифра");
        } else {
            System.out.println("'" + symbol + "' - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %\n");

        double deposit = 321123.59;
        double percentRate = 0.10;
        if (deposit < 100000) {
            percentRate = 0.05;
        } else if (deposit <= 300000) {
            percentRate = 0.07;
        }
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленного %: " + (deposit * percentRate) + "руб");
        System.out.println("Итоговая сумма с %: " + ((deposit * percentRate) + deposit) + "руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        double historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }

        double programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (historyPercent > 91) {
            programmingGrade = 5;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний бал оценок по предметам: " + 
                ((historyGrade + programmingGrade) / 2.0));
        System.out.println("Средний % по предметам: " + 
                ((historyPercent + programmingPercent) / 2.0));

        System.out.println("\n8. Расчет годовой прибыли\n");

        double monthIncome = 13025.233;
        double monthRent = 5123.018;
        double monthCost = 9001.729;
        double profit = (monthIncome - monthRent - monthCost) * 12;
        if (profit > 0) {
            System.out.printf("Прибыль за год: +%.2f руб.\n", profit);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.\n", profit);
        }
    }
}