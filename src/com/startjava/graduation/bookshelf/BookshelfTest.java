package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу 'Книжный шкаф'!");
        Bookshelf bookshelf = new Bookshelf();

        while (true) {
            displayMenu();
            String choice = SCANNER.nextLine().trim().toLowerCase();

            switch (choice) {
                case "save":
                    saveBook(bookshelf);
                    break;
                case "delete":
                    deleteBook(bookshelf);
                    break;
                case "find":
                    findBook(bookshelf);
                    break;
                case "clear":
                    bookshelf.clear();
                    System.out.println("Шкаф очищен.");
                    break;
                case "exit":
                    System.out.println("Спасибо за использование программы! До свидания!");
                    SCANNER.close();
                    return;
                default:
                    System.out.println("Ошибка: введите номер из списка:");
            }

            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            SCANNER.nextLine();
            bookshelf.display();
        }
    }

    private static void displayMenu() {
        System.out.println("""
                Меню:
                save - сохранить книгу
                delete - удалить книгу
                find - найти книгу
                clear - очистить шкаф
                exit - завершить
                """);
    }

    private static void saveBook(Bookshelf bookshelf) {
        if (bookshelf.getFreeShelves() == 0) {
            System.out.println("Шкаф полон. Невозможно добавить новую книгу.");
            return;
        }

        System.out.println("Введите автора книги:");
        String author = SCANNER.nextLine();
        System.out.println("Введите название книги:");
        String title = SCANNER.nextLine();
        System.out.println("Введите год издания книги:");
        int year = Integer.parseInt(SCANNER.nextLine());

        Book book = new Book(author, title, year);
        if (bookshelf.addBook(book)) {
            System.out.println("Книга успешно добавлена.");
        } else {
            System.out.println("Не удалось добавить книгу.");
        }
    }

    private static void deleteBook(Bookshelf bookshelf) {
        System.out.println("Введите название книги для удаления:");
        String title = SCANNER.nextLine();

        if (bookshelf.deleteBook(title)) {
            System.out.println("Книга успешно удалена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void findBook(Bookshelf bookshelf) {
        System.out.println("Введите название книги для поиска:");
        String title = SCANNER.nextLine();

        Book book = bookshelf.findBook(title);
        if (book != null) {
            System.out.println("Книга найдена: " + book);
        } else {
            System.out.println("Книга не найдена.");
        }
    }
}