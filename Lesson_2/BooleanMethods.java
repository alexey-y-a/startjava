public class BooleanMethods {
    
    public boolean isProgramContinuing() {
        System.out.println(MethodNameHelper.currentMethodName() + 
                "() -> программа выполняется далее или завершается?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> последовательность содержит уникальную цифру?");
        return true;
    }

    public boolean isInputLetter() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasMarioAttemptsLeft() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> в игре \"Марио\" остались попытки?");
        return true;
    }

    public boolean isInputEmpty() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> пользователь ввел пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isDiceRollEven() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isFilePathValid() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean doesFileExist() {
        System.out.println("\n" + MethodNameHelper.currentMethodName() + 
                "() -> файл по указанному адресу существует?");
        return false;
    }
}