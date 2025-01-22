public class BooleanMethods {
    
    public boolean isProgramContinuing() {
        System.out.println(CurrentMethodName() + "() -> программа выполняется " +
                "далее или завершается?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println("\n" + CurrentMethodName() + "() -> удалился ли файл " +
                "на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println("\n" + CurrentMethodName() + "() -> последовательность " +
                "содержит уникальную цифру?");
        return true;
    }

    public boolean isInputLetter() {
        System.out.println("\n" + CurrentMethodName() + "() -> пользователь ввел " +
                "букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println("\n" + CurrentMethodName() + "() -> в проверяемых числах," +
                "есть равные цифры?");
        return false;
    }

    public boolean hasMarioAttemptsLeft() {
        System.out.println("\n" + CurrentMethodName() + "() -> в игре \"Марио\" " +
                "остались попытки?");
        return true;
    }

    public boolean isInputEmpty() {
        System.out.println("\n" + CurrentMethodName() + "() -> пользователь ввел пустую" +
                "строку или из одних пробелов?");
        return false;
    }

    public boolean isDiceRollEven() {
        System.out.println("\n" + CurrentMethodName() + "() -> на кубике, который бросил " +
                "компьютер, выпало четное число?");
        return true;
    }

    public boolean isFilePathValid() {
        System.out.println("\n" + CurrentMethodName() + "() -> путь до файла, который " +
                "вы ищите на ssd, действительный?");
        return true;
    }

    public boolean doesFileExist() {
        System.out.println("\n" + CurrentMethodName() + "() -> файл по " +
                "указанному адресу существует?");
        return false;
    }

    public static String CurrentMethodName() {
        return Thread.currentThread().StackTrace()[2].MethodName();
    }
}