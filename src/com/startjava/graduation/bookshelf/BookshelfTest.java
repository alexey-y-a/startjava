package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу 'Книжный шкаф'!");
        Bookshelf bookshelf = new Bookshelf();

        while (true) {
            displayMenu();
            int choice = getValidMenuChoice();

            if (!handleMenuChoice(choice, bookshelf)) {
                break;
            }

            System.out.println("Для продолжения работы нажмите клавишу <Enter>");
            scanner.nextLine();
            System.out.println(bookshelf.display());
        }
        scanner.close();
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

    private static int getValidMenuChoice() {
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

    private static boolean handleMenuChoice(int choice, Bookshelf bookshelf) {
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
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
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
        String title = getBookTitle();
        if (bookshelf.deleteBook(title)) {
            System.out.println("Книга успешно удалена.");
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void findBook(Bookshelf bookshelf) {
        String title = getBookTitle();
        Book book = bookshelf.findBook(title);
        if (book != null) {
            System.out.println("Книга найдена: " + book);
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static String getBookTitle() {
        System.out.println("Введите название книги:");
        return scanner.nextLine();
    }
}