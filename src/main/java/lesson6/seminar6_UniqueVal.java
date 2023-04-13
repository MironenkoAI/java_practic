package lesson6;
/*1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
  2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
  уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
  процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class seminar6_UniqueVal {
    public static void main(String[] args) {
        int n = 1000;
        Integer[] arr = fillArray(n);
        System.out.println(Arrays.toString(arr));
        double uniqueValue = uniqueValuesInArray(arr);
        System.out.println(uniqueValue);
    }

    private static Integer[] fillArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    private static double uniqueValuesInArray(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        return 1.0 * set.size() * 100 / array.length;
    }
}