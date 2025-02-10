package com.startjava.lesson_2_3_4.array;

public class TrianglePrinter {
    public static void main(String[] args) {
        TrianglePrinter printer = new TrianglePrinter();

        char[]sortedChars = printer.generateSortedChars('0', '9', true);
        if (sortedChars != null) {
            printer.printTriangle(sortedChars);
        }

        sortedChars = printer.generateSortedChars('/', '!', false);
        if (sortedChars != null) {
            printer.printTriangle(sortedChars);
        }

        sortedChars = printer.generateSortedChars('A', 'J', false);
        if (sortedChars != null) {
            printer.printTriangle(sortedChars);
        }
    }

    private char[] generateSortedChars(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n", (int) start, (int) end);
            return null;
        }

        char[] chars = new char[end - start + 1];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (ascending ? start + i : end - i);
        }
        return chars;
    }

    private void printTriangle(char[] chars) {
        int maxWidth = chars.length * 2 - 1;
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            String line = String.valueOf(chars[i]).repeat(i * 2 + 1);
            triangle.append(" ".repeat((maxWidth - line.length()) / 2)).append(line).append("\n");
        }
        System.out.print(triangle);
    }
}