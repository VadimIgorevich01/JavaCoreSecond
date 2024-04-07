package org.example.GBrains;


public class Main {
    //Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    //Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
    //Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static void main(String[] args) {
        MethodsPool methodsPool = new MethodsPool();
        int[] array = {1,2,3,4,5,6,23,2,45,444,3,6,0,8,6,0,0,4,3,1};
        methodsPool.howManyEvenNumbers(array);
        methodsPool.substractBiggestFrSmallest(array);
        methodsPool.isThereTwoZeroTogether(array);
    }
}