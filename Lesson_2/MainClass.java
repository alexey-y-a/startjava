public class MainClass {

    public static void main(String[] args) {
        MainClass app = new MainClass();

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
        nonBm.synchronizeWithCloud();
        nonBm.restoreBackup();
        nonBm.pauseFileDownload();
        nonBm.resetSettings();
        nonBm.saveFile();
        nonBm.convertTemperature();
        nonBm.inputMathExpression();
        nonBm.determineWinner();
        nonBm.findBookAuthor();
    }

    private void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgramContinuing());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isInputLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasMarioAttemptsLeft());
        System.out.println(bm.isInputEmpty());
        System.out.println(bm.isDiceRollEven());
        System.out.println(bm.isFilePathValid());
        System.out.println(bm.doesFileExist());
    }
}