public class MethodInvoker {

    public void invokeNonBooleanMethods() {
        NonBooleanMethods instance = new NonBooleanMethods();
        instance.findLongestWord();
        instance.selectMenuOption();
        instance.calculateAverageGrade();
        instance.countUniqueWords();
        instance.showErrorMessage();
        instance.synchronizeWithCloud();
        instance.restoreBackup();
        instance.pauseFileDownload();
        instance.resetSettings();
        instance.saveFile();
        instance.convertTemperature();
        instance.inputMathExpression();
        instance.determineWinner();
        instance.findBookAuthor();
    }

    public void invokeBooleanMethods() {
        BooleanMethods instance = new BooleanMethods();
        System.out.println(instance.isProgramContinuing());
        System.out.println(instance.isFileDeleted());
        System.out.println(instance.hasUniqueDigit());
        System.out.println(instance.isInputLetter());
        System.out.println(instance.hasEqualDigits());
        System.out.println(instance.hasMarioAttemptsLeft());
        System.out.println(instance.isInputEmpty());
        System.out.println(instance.isDiceRollEven());
        System.out.println(instance.isFilePathValid());
        System.out.println(instance.doesFileExist());
    }
}