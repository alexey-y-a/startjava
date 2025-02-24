package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", author, title, publicationYear);
    }
}