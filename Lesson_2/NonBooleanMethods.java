public class NonBooleanMethods {
    
    public void findLongestWord() {
        System.out.println(CurrentMethodName() + "() -> найти самое длинное слово " +
                "в предложении из книги по Java\n");
    }

    public void selectMenuOption() {
        System.out.println(CurrentMethodName() + "() -> выбрать пункт меню " +
                "в текстовом редакторе на macOS\n");
    }

    public void calculateAverageGrade() {
        System.out.println(CurrentMethodName() + "() -> вычислить среднее значение " +
                "оценок в школе №1234\n");
    }

    public void countUniqueWords() {
        System.out.println(CurrentMethodName() + "() -> подсчитать количество уникальных " +
                "слов в \"Война и Мир\"\n");
    }

    public void showErrorMessage() {
        System.out.println(CurrentMethodName() + "() -> вывести сообщение об ошибке\n");
    }

    public void synchronizeWithCloud() {
        System.out.println(CurrentMethodName() + "() -> синхронизировать данные " +
                "с облачным хранилищем\n");
    }

    public void restoreBackup() {
        System.out.println(CurrentMethodName() + "() -> восстановить данные из " +
                "резервной копии от 11.03.2024\n");
    }

    public void pauseFileDownload() {
        System.out.println(CurrentMethodName() + "() -> приостановить загрузку " +
                "mp3-файла группы \"Ария\"\n");
    }

    public void resetSettings() {
        System.out.println(CurrentMethodName() + "() -> сбросить настройки до " +
                "заводских для пылесоса Mi\n");
    }

    public void saveFile() {
        System.out.println(CurrentMethodName() + "() -> записать содержимое в файл " +
                "по указанному пути на флешку\n");
    }

    public void convertTemperature() {
        System.out.println(CurrentMethodName() + "() -> преобразовать температуру " +
                "из Цельсия в Фаренгейт\n");
    }

    public void inputMathExpression() {
        System.out.println(CurrentMethodName() + "() -> ввести математическое " +
                "выражение с тремя аргументами\n");
    }

    public void determineWinner() {
        System.out.println(CurrentMethodName() + "() -> выявить победителя среди " +
                "гонщиков игры \"Need For Speed\"\n");
    }

    public void findBookAuthor() {
        System.out.println(CurrentMethodName() + "() -> найти книгу по имени писателя\n");
    }

    public static String CurrentMethodName() {
        return Thread.currentThread().StackTrace()[2].MethodName();
    }
}