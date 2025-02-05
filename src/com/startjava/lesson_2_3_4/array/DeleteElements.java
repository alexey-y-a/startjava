package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class DeleteElements {

    public static void main(String[] args) {
        DeleteElements processor = new DeleteElements();
        double[] array;

        array = processor.generateRandomArray(15);
        System.out.println("Исходный массив:");
        processor.printArray(array, 8);
        int count = processor.processArray(array, -1);
        System.out.println("Измененный массив:");
        processor.printArray(array, 7);
        processor.printResults(array, -1, count);

        array = processor.generateRandomArray(15);
        System.out.println("Исходный массив:");
        processor.printArray(array, 8);
        count = processor.processArray(array, 15);
        System.out.println("Измененный массив:");
        processor.printArray(array, 7);
        processor.printResults(array, 15, count);

        array = processor.generateRandomArray(15);
        System.out.println("Исходный массив:");
        processor.printArray(array, 8);
        count = processor.processArray(array, 0);
        System.out.println("Измененный массив:");
        processor.printArray(array, 7);
        processor.printResults(array, 0, count);

        array = processor.generateRandomArray(15);
        System.out.println("Исходный массив:");
        processor.printArray(array, 8);
        count = processor.processArray(array, 14);
        System.out.println("Измененный массив:");
        processor.printArray(array, 7);
        processor.printResults(array, 14, count);
    }

    private double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    private int processArray(double[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Ошибка: индекс " + index + " выходит за пределы массива.");
            return 0;
        }

        double limit = array[index];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > limit) {
                array[i] = 0.0;
                count++;
            }
        }
        return count;
    }

    private void printArray(double[] array, int numbersLine) {
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

    private void printResults(double[] array, int index, int count) {
        if (index >= 0 && index < array.length) {
            System.out.printf("Значение из ячейки по индексу %d: %.3f%n", index, array[index]);
        }
        System.out.printf("Количество обнуленных ячеек: %d%n", count);
    }
}