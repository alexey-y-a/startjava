public class NonBooleanMethods {
    
    public void findLongestWord() {
        System.out.println(getCurrentMethodName() + "() -> найти самое длинное слово " +
                "в предложении из книги по Java\n");
    }

    public void selectMenuOption() {
        System.out.println(getCurrentMethodName() + "() -> выбрать пункт меню " +
                "в текстовом редакторе на macOS\n");
    }

    public void calculateAverageGrade() {
        System.out.println(getCurrentMethodName() + "() -> вычислить среднее значение " +
                "оценок в школе №1234\n");
    }

    public void countUniqueWords() {
        System.out.println(getCurrentMethodName() + "() -> подсчитать количество уникальных " +
                "слов в \"Война и Мир\"\n");
    }

    public void showErrorMessage() {
        System.out.println(getCurrentMethodName() + "() -> вывести сообщение об ошибке\n");
    }

    public void synchronizeWithCloud() {
        System.out.println(getCurrentMethodName() + "() -> синхронизировать данные " +
                "с облачным хранилищем\n");
    }

    public void restoreBackup() {
        System.out.println(getCurrentMethodName() + "() -> восстановить данные из " +
                "резервной копии от 11.03.2024\n");
    }

    public void pauseFileDownload() {
        System.out.println(getCurrentMethodName() + "() -> приостановить загрузку " +
                "mp3-файла группы \"Ария\"\n");
    }

    public void resetSettings() {
        System.out.println(getCurrentMethodName() + "() -> сбросить настройки до " +
                "заводских для пылесоса Mi\n");
    }

    public void saveFile() {
        System.out.println(getCurrentMethodName() + "() -> записать содержимое в файл " +
                "по указанному пути на флешку\n");
    }

    public void convertTemperature() {
        System.out.println(getCurrentMethodName() + "() -> преобразовать температуру " +
                "из Цельсия в Фаренгейт\n");
    }

    public void inputMathExpression() {
        System.out.println(getCurrentMethodName() + "() -> ввести математическое " +
                "выражение с тремя аргументами\n");
    }

    public void determineWinner() {
        System.out.println(getCurrentMethodName() + "() -> выявить победителя среди " +
                "гонщиков игры \"Need For Speed\"\n");
    }

    public void findBookAuthor() {
        System.out.println(getCurrentMethodName() + "() -> найти книгу по имени писателя\n");
    }

    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}