package com.startjava.lesson_2_3_4.method.naming;

public class BooleanMethods {
    
    public boolean isProgramContinuing() {
        System.out.println(MethodNameHelper.current() + 
                "() -> программа выполняется далее или завершается?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> последовательность содержит уникальную цифру?");
        return true;
    }

    public boolean isLetterInput() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasAttemptsLeft() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> в игре \"Марио\" остались попытки?");
        return true;
    }

    public boolean isEmptyInput() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> пользователь ввел пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isDiceRollEven() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isFilePathValid() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println("\n" + MethodNameHelper.current() + 
                "() -> файл по указанному адресу существует?");
        return false;
    }
}