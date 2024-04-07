package org.example.GBrains;

import java.util.Arrays;

public class MethodsPool {

    public int howManyEvenNumbers(int[] array) {
        int howManyEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++howManyEvenNumbers;
            }
        }
        System.out.println("В массиве " + Arrays.toString(array) + " количество четных чисел " + howManyEvenNumbers);
        return howManyEvenNumbers;
    }

    public int substractBiggestFrSmallest(int[] array) {
        Arrays.sort(array);
        int biggest = array[array.length - 1];
        int smallest = array[0];
        int result = biggest - smallest;
        System.out.println("В массиве " + Arrays.toString(array) + " результат вычитания из наибольшего значения " + biggest + " наименьшего " + smallest + " будет " + result);
        return result;
    }

    public boolean isThereTwoZeroTogether(int[] array) {
        boolean isThereTwoZeroTogether = false;
        for (int i = 0; i < array.length; i++) {
            if (array [i] != array.length - 1) {
                if (array[i] == 0 && array [i+1] == 0) {
                    isThereTwoZeroTogether = true;
                    i = array.length;
                }
            }
        }
        if (isThereTwoZeroTogether) {
            System.out.println("В массиве " + Arrays.toString(array) + " есть два нуля идущих друг за другом");
        } else {
            System.out.println("В массиве " + Arrays.toString(array) + " нет двух нулей идущих друг за другом");
        }
        return isThereTwoZeroTogether;
    }
}
