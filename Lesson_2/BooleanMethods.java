public class BooleanMethods {
    
    public boolean isProgramContinuing() {
        System.out.println(getCurrentMethodName() + "() -> программа выполняется " +
                "далее или завершается?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println("\n" + getCurrentMethodName() + "() -> удалился ли файл " +
                "на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println("\n" + getCurrentMethodName() + "() -> последовательность " +
                "содержит уникальную цифру?");
        return true;
    }

    public boolean isInputLetter() {
        System.out.println("\n" + getCurrentMethodName() + "() -> пользователь ввел " +
                "букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println("\n" + getCurrentMethodName() + "() -> в проверяемых числах," +
                "есть равные цифры?");
        return false;
    }

    public boolean hasMarioAttemptsLeft() {
        System.out.println("\n" + getCurrentMethodName() + "() -> в игре \"Марио\" " +
                "остались попытки?");
        return true;
    }

    public boolean isInputEmpty() {
        System.out.println("\n" + getCurrentMethodName() + "() -> пользователь ввел пустую" +
                "строку или из одних пробелов?");
        return false;
    }

    public boolean isDiceRollEven() {
        System.out.println("\n" + getCurrentMethodName() + "() -> на кубике, который бросил " +
                "компьютер, выпало четное число?");
        return true;
    }

    public boolean isFilePathValid() {
        System.out.println("\n" + getCurrentMethodName() + "() -> путь до файла, который " +
                "вы ищите на ssd, действительный?");
        return true;
    }

    public boolean doesFileExist() {
        System.out.println("\n" + getCurrentMethodName() + "() -> файл по " +
                "указанному адресу существует?");
        return false;
    }

    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}