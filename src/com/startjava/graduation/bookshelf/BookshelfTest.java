package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу 'Книжный шкаф'!");
        Bookshelf bookshelf = new Bookshelf();

        while (true) {
            displayMenu();
            int choice = selectAction();

            if (!execMenuChoice(choice, bookshelf)) {
                break;
            }

            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            scanner.nextLine();
            displayBookshelf(bookshelf);
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("""
                Меню:
                1 - сохранить книгу
                2 - удалить книгу
                3 - найти книгу
                4 - очистить шкаф
                5 - завершить
                """);
    }

    private static int selectAction() {
        while (true) {
            System.out.print("Введите номер пункта меню: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= 5) {
                    return choice;
                }
                System.out.println("Ошибка: введите номер из списка.");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    private static boolean execMenuChoice(int choice, Bookshelf bookshelf) {
        switch (choice) {
            case 1:
                saveBook(bookshelf);
                break;
            case 2:
                deleteBook(bookshelf);
                break;
            case 3:
                findBook(bookshelf);
                break;
            case 4:
                bookshelf.clear();
                System.out.println("Шкаф очищен.");
                break;
            case 5:
                System.out.println("Спасибо за использование программы! До свидания!");
                return false;
            default:
                System.out.println("Ошибка: введите номер из списка:");
        }
        return true;
    }

    private static void saveBook(Bookshelf bookshelf) {
        if (bookshelf.getFreeShelves() == 0) {
            System.out.println("Шкаф полон. Невозможно добавить новую книгу.");
            return;
        }

        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        String title = inputTitle();
        System.out.println("Введите год издания книги:");
        int year = Integer.parseInt(scanner.nextLine());

        Book book = new Book(author, title, year);
        if (bookshelf.addBook(book)) {
            System.out.println("Книга успешно добавлена.");
        } else {
            System.out.println("Не удалось добавить книгу.");
        }
    }

    private static void deleteBook(Bookshelf bookshelf) {
        String title = inputTitle();
        if (bookshelf.deleteBook(title)) {
            System.out.println("Книга успешно удалена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void findBook(Bookshelf bookshelf) {
        String title = inputTitle();
        Book book = bookshelf.findBook(title);
        if (book != null) {
            System.out.println("Книга найдена: " + book);
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static String inputTitle() {
        System.out.println("Введите название книги:");
        return scanner.nextLine();
    }

    public static void displayBookshelf(Bookshelf bookshelf) {
        if (bookshelf.getBookCount() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
            return;
        }

        System.out.printf("В шкафу книг - %d, свободно полок - %d%n",
                bookshelf.getBookCount(), bookshelf.getFreeShelves());
        String separator = "|--------------------------------------------|";

        for (int i = 0; i < 10; i++) {
            System.out.println(separator);
            if (i < bookshelf.getBookCount()) {
                System.out.printf("| %-40s |%n", bookshelf.getAllBooks()[i]);
            } else {
                System.out.printf("| %-40s |%n", "");
            }
        }
        System.out.println(separator);
    }
}