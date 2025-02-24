package com.startjava.graduation.bookshelf;

public class Bookshelf {
    private static final int MAX_BOOKS = 10;
    private final Book[] books = new Book[MAX_BOOKS];
    private int bookCount = 0;

    public boolean addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount++] = book;
            return true;
        }
        return false;
    }

    public boolean deleteBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                books[--bookCount] = null;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < bookCount; i++) {
            books[i] = null;
        }
        bookCount = 0;
    }

    public Book[] getAllBooks() {
        return java.util.Arrays.copyOf(books, bookCount);
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - bookCount;
    }

    public void display() {
        if (bookCount == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
            return;
        }

        System.out.printf("В шкафу книг - %d, свободно полок - %d%n", bookCount, getFreeShelves());
        String separator = "|--------------------------------------------|";

        for (int i = 0; i < MAX_BOOKS; i++) {
            System.out.println(separator);
            if (i < bookCount) {
                System.out.printf("| %-40s |%n", books[i]);
            } else {
                System.out.printf("| %-40s |%n", "");
            }
        }
        System.out.println(separator);
    }
}