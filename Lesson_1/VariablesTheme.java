public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");
        byte numberOfCores = 4;
        short cpuFrequency = 2200;
        int ramSize = 16;
        long storageSize = 500000000000L;
        float screenSize = 15.4f;
        double price = 35000.99;
        char cpuBrand = 'I';
        boolean isLaptop = true;
        System.out.println("Количество ядер процессора: " + numberOfCores);
        System.out.println("Частота процессора: " + cpuFrequency + " МГц");
        System.out.println("Объем оперативной памяти: " + ramSize + " Гб");
        System.out.println("Объем хранилища " + storageSize + "байт");
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Цена ноутбука в рублях: " + price);
        System.out.println("Бренд процессора: " + cpuBrand);
        System.out.println("Является ли устройство ноутбуком: " + isLaptop + "\n");
        
        System.out.println("2. Расчет стоимости товара со скидкой\n");
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;
        double totalPrice = penPrice + bookPrice;
        double discountAmount = totalPrice * discount;
        double finalPrice = totalPrice - discountAmount;
        System.out.printf("Стоимость товаров без скидки: %.2f руб.\n ", totalPrice);
        System.out.printf("Сумма скидки: %.2f\n", discountAmount);
        System.out.printf("Стоимость товаров со скидкой: %.2f руб.\n\n", finalPrice);

        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte byteMax = 127;
        System.out.println("Первоначальное значение: " + byteMax);
        System.out.println("Значение после инкремента на единицу: " + ++byteMax);
        System.out.println("Значение после декремента на единицу " + --byteMax + "\n");

        short shortMax = 32767;
        System.out.println("Первоначальное значение: " + shortMax);
        System.out.println("Значение после инкремента на единицу: " + ++shortMax);
        System.out.println("Значение после декремента на единицу " + --shortMax + "\n");

        int intMax = 2147483647;
        System.out.println("Первоначальное значение: " + intMax);
        System.out.println("Значение после инкремента на единицу: " + ++intMax);
        System.out.println("Значение после декремента на единицу " + --intMax + "\n");

        long longMax = 9223372036854775807L;
        System.out.println("Первоначальное значение: " + longMax);
        System.out.println("Значение после инкремента на единицу: " + ++longMax);
        System.out.println("Значение после декремента на единицу " + --longMax + "\n");

        char charMax = 65535;
        System.out.println("Первоначальное значение: " + (int) charMax);
        System.out.println("Значение после инкремента на единицу: " + (int) ++charMax);
        System.out.println("Значение после декремента на единицу " + (int) --charMax + "\n");

        System.out.println("5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных: num1 = " + num1 + 
                ", num2 = " + num2 + "\n");

        // С помощью третьей переменной
        System.out.println("С помощью третьей переменной");
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2 + "\n");

        // С помощью арифметических операций
        System.out.println("С помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2 + "\n");

        // С помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2 + "\n");

        System.out.println("6. Вывод символов и их кодов\n");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа: " + (int) dollar + " Символ: " + dollar);
        System.out.println("Код символа: " + (int) asterisk + " Символ: " + asterisk);
        System.out.println("Код символа: " + (int) atSign + " Символ: " + atSign);
        System.out.println("Код символа: " + (int) verticalBar + " Символ: " + verticalBar);
        System.out.println("Код символа: " + (int) tilde + " Символ: " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + 
                rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа\n");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + hundreds + tens + ones);
        System.out.println("Произведение разрядов = " + hundreds * tens + ones + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды\n");
        int totalSeconds = 86399;
        int hh = totalSeconds / (60 * 60);
        int mm = (totalSeconds % (60 * 60)) / 60;
        int ss = totalSeconds % 60;
        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
    }
}