package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        reversePrint(emptyArray);

        int[] nullArray = null;
        reversePrint(nullArray);

        int[] array1 = {6, 8, 9, 1};
        reversePrint(array1);

        int[] array2 = {13, 8, 5, 3, 2, 1, 1};
        reversePrint(array2);
    }

    private static void reversePrint(int[] array) {
        if (array == null) {
            System.out.println("Массив является null.");
            return;
        }
        if (array.length == 0) {
            System.out.println("Массив пустой.");
            return;
        }

        System.out.println("\nДо реверса: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("После реверса: " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = tmp;
        }
    }
}