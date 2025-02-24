package com.startjava.graduation.bookshelf;

import java.util.Arrays;

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
        Arrays.fill(books, 0, bookCount, null);
        bookCount = 0;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, bookCount);
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - bookCount;
    }

    public String display() {
        if (bookCount == 0) {
            return "Шкаф пуст. Вы можете добавить в него первую книгу.";
        }

        StringBuilder result = new StringBuilder();
        result.append(String.format("В шкафу книг - %d, свободно полок - %d%n", bookCount, getFreeShelves()));
        String separator = "|--------------------------------------------|";

        for (int i = 0; i < MAX_BOOKS; i++) {
            result.append(separator).append("\n");
            if (i < bookCount) {
                result.append(String.format("| %-40s |%n", books[i]));
            } else {
                System.out.printf("| %-40s |%n", "");
            }
        }
        result.append(separator).append("\n");
        return result.toString();
    }
}