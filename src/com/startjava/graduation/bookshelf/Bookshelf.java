package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int MAX_BOOKS = 10;
    private final Book[] books = new Book[MAX_BOOKS];
    private int bookCount;

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, bookCount);
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - bookCount;
    }

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
}