package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ThresholdFilter {

    public static void main(String[] args) {
        ThresholdFilter filter = new ThresholdFilter();

        float[] array = filter.createRandomArray(15);
        filter.filterMoreThanElement(array, -1);

        array = filter.createRandomArray(15);
        filter.filterMoreThanElement(array, 15);

        array = filter.createRandomArray(15);
        int count = filter.filterMoreThanElement(array, 0);
        if (count != -1) {
            System.out.println("После обнуления:");
            filter.printArray(array, 7);
            System.out.printf("Количество обнуленных ячеек = %d%n", count);
        }

        array = filter.createRandomArray(15);
        count = filter.filterMoreThanElement(array, 14);
        if (count != -1) {
            System.out.println("После обнуления:");
            filter.printArray(array, 7);
            System.out.printf("Количество обнуленных ячеек = %d%n", count);
        }
    }

    private float[] createRandomArray(int size) {
        float[] array = new float[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }

    private int filterMoreThanElement(float[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.printf("Ошибка: значение индекса (%d) должно быть от 0 до %d%n", index, array.length - 1);
            return -1;
        }

        float limit = array[index];

        System.out.printf("\nЗначение из ячейки [%d]: %.3f%n", index, limit);
        System.out.println("До обнуления:");
        printArray(array, 8);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > limit) {
                array[i] = 0.0f;
                count++;
            }
        }
        return count;
    }

    private void printArray(float[] array, int numbersLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if ((i + 1) % numbersLine == 0) {
                System.out.println();
            }
        }
        if (array.length % numbersLine != 0) {
            System.out.println();
        }
    }
}