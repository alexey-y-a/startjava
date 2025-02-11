package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ThresholdFilter {

    public static void main(String[] args) {
        ThresholdFilter filter = new ThresholdFilter();
        int[] testIndices = {-1, 15, 0, 14};

        for (int index : testIndices) {
            float[] array = filter.createRandomArray(15);

            if (index < 0 || index >= array.length) {
                System.out.printf("Ошибка: значение индекса (%d) должно быть от 0 до %d%n", index, array.length - 1);
                continue;
            }

            System.out.printf("\nЗначение из ячейки [%d]: %.3f%n", index, array[index]);
            filter.printArray(array, 8, "До обнуления:");

            int count = filter.filterMoreThanElement(array, index);

            if (count != -1) {
                filter.printArray(array, 7, "После обнуления");
                System.out.printf("Количество обнуленных ячеек = %d%n", count);
            }
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
        float limit = array[index];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > limit) {
                array[i] = 0.0f;
                count++;
            }
        }
        return count;
    }

    private void printArray(float[] array, int numbersLine, String header) {
        System.out.println(header);
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