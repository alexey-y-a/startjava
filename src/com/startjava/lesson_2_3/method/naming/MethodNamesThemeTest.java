package com.startjava.lesson_2_3.method.naming;

public class MethodNamesThemeTest {

    public static void main(String[] args) {
        MethodNamesThemeTest app = new MethodNamesThemeTest();

        System.out.println("\n Non-Boolean Methods \n");
        app.doNonBooleanMethods();

        System.out.println("\n Boolean Methods \n");
        app.doBooleanMethods();
    }

    private void doNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenuOption();
        nonBm.calculateAverageGrade();
        nonBm.countUniqueWords();
        nonBm.showErrorMessage();
        nonBm.syncWithCloud();
        nonBm.restoreBackup();
        nonBm.pauseFileDownload();
        nonBm.resetSettings();
        nonBm.saveFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.determineWinner();
        nonBm.findBookByAuthor();
    }

    private void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgramContinuing());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetterInput());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttemptsLeft());
        System.out.println(bm.isEmptyInput());
        System.out.println(bm.isDiceRollEven());
        System.out.println(bm.isFilePathValid());
        System.out.println(bm.isFileExist());
    }
}