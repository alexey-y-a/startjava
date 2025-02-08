package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ThresholdFilter {

    public static void main(String[] args) {
        ThresholdFilter filter = new ThresholdFilter();
        float[] array;

        array = filter.createRandomArray(15);
        System.out.println("Исходный массив:");
        filter.printArray(array, 8);
        int count = filter.filterMoreThanElement(array, -1);
        if (count == -1) {
            return;
        }
        System.out.println("Измененный массив:");
        filter.printArray(array, 7);
        filter.printResults(array, -1, count);

        array = filter.createRandomArray(15);
        System.out.println("Исходный массив:");
        filter.printArray(array, 8);
        count = filter.filterMoreThanElement(array, 15);
        if (count == -1) {
            return;
        }
        System.out.println("Измененный массив:");
        filter.printArray(array, 7);
        filter.printResults(array, 15, count);

        array = filter.createRandomArray(15);
        System.out.println("Исходный массив:");
        filter.printArray(array, 8);
        count = filter.filterMoreThanElement(array, 0);
        if (count == -1) {
            return;
        }
        System.out.println("Измененный массив:");
        filter.printArray(array, 7);
        filter.printResults(array, 0, count);

        array = filter.createRandomArray(15);
        System.out.println("Исходный массив:");
        filter.printArray(array, 8);
        count = filter.filterMoreThanElement(array, 14);
        if (count == -1) {
            return;
        }
        System.out.println("Измененный массив:");
        filter.printArray(array, 7);
        filter.printResults(array, 14, count);
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
            System.out.println("Ошибка: индекс " + index + " выходит за пределы массива.");
            return -1;
        }

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

    private void printResults(float[] array, int index, int count) {
        if (count == -1) return;
        System.out.printf("Значение из ячейки по индексу %d: %.3f%n", index, array[index]);
        System.out.printf("Количество обнуленных ячеек: %d%n", count);
    }
}