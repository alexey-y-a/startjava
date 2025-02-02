package com.startjava.lesson_2_3_4.array;

public class ArrayReverseValuesMain {

    public static void main(String[] args) {
        final int[] emptyArray = new int[0];
        final int[] nullArray = null;
        final int[] array1 = {6, 8, 9, 1};
        final int[] array2 = {13, 8, 5, 3, 2, 1, 1};
        reversePrint(emptyArray);
        reversePrint(nullArray);
        reversePrint(array1);
        reversePrint(array2);
    }

    public static void reversePrint(int[] array) {
        if (array == null) {
            System.out.println("Массив является null.");
            return;
        }
        if (array.length == 0) {
            System.out.println("Массив пустой.");
            return;
        }

        System.out.print("До реверса: ");
        printArray(array);

        reverseArray(array);

        System.out.print("После реверса: ");
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = tmp;
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
