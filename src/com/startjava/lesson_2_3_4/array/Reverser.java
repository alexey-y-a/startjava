package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        reverseArray(emptyArray);
        printArray(emptyArray);

        int[] nullArray = null;
        reverseArray(nullArray);
        printArray(nullArray);

        int[] array1 = {6, 8, 9, 1};
        reverseArray(array1);
        printArray(array1);

        int[] array2 = {13, 8, 5, 3, 2, 1, 1};
        reverseArray(array2);
        printArray(array2);
    }

    private static void reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = tmp;
        }
    }

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("Массив является null.");
        } else if (array.length == 0) {
            System.out.println("Массив пустой");
        } else {
            System.out.println("После реверса: " + Arrays.toString(array));
        }
    }
}