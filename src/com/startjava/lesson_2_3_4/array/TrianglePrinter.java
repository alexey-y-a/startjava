package com.startjava.lesson_2_3_4.array;

public class TrianglePrinter {
    public static void main(String[] args) {
        TrianglePrinter printer = new TrianglePrinter();
        char[] sortedChars;

        sortedChars = printer.generateSortedChars('0', '9', true);
        printer.printTriangle(sortedChars);

        sortedChars = printer.generateSortedChars('/', '!', false);
        printer.printTriangle(sortedChars);

        sortedChars = printer.generateSortedChars('A', 'J', false);
        printer.printTriangle(sortedChars);
    }

    private char[] generateSortedChars(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n", (int) start, (int) end);
            char temp = start;
            start = end;
            end = temp;
        }

        char[] chars = new char[end - start + 1];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (start + i);
        }

        if (!ascending) {
            int length = chars.length;
            for (int i = 0; i < length; i++) {
                char temp = chars[i];
                chars[i] = chars[--length];
                chars[length] = temp;
            }
        }
        return chars;
    }

    private void printTriangle(char[] chars) {
        int maxWidth = chars.length * 2 - 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            String line = String.valueOf(chars[i]).repeat(i * 2 + 1);
            sb.append(" ".repeat((maxWidth - line.length()) / 2)).append(line).append("\n");
        }
        System.out.print(sb);
    }
}