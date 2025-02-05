package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {

    public static void main(String[] args) {
        int[] emptyArray = new int[0];
        printArray("   До реверса", emptyArray);
        reverseArray(emptyArray);
        printArray("После реверса", emptyArray);

        int[] nullArray = null;
        printArray("   До реверса", nullArray);
        reverseArray(nullArray);
        printArray("После реверса", nullArray);

        int[] array1 = {6, 8, 9, 1};
        printArray("   До реверса", array1);
        reverseArray(array1);
        printArray("После реверса", array1);

        int[] array2 = {13, 8, 5, 3, 2, 1, 1};
        printArray("   До реверса", array2);
        reverseArray(array2);
        printArray("После реверса", array2);
    }

    private static void reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            length--;
            int tmp = array[i];
            array[i] = array[length];
            array[length] = tmp;
        }
    }

    private static void printArray(String message, int[] array) {
        if (array == null) {
            System.out.println(message + ": null");
        } else if (array.length == 0) {
            System.out.println(message + ": []");
        } else {
            System.out.println(message + ": " + Arrays.toString(array));
        }
    }
}