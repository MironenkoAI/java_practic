package homework1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*ЗАДАЧА 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы*/
public class MainClassTask1 {
    public static void main(String[] args) {
        array();
    }
    private static void array() {
        Scanner sz = new Scanner(System.in); //запрос к пользователю
        System.out.printf("Введите длину массива: "); //обращение к пользователю
        int size = sz.nextInt();            //присвоение переменной введенного числа
        sz.close();

        int[] arr = new int[size];         //создание массива
        Random random = new Random();      //рандомное заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arr));  //вывод массива

        int min = arr[0];      //присвоение min первого элемента
        int max = arr[0];      //присвоение max первого элемента
        for (int num : arr) {   //проверка элементов по порядку
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.printf("Максимальный элемент: %d%n", max);  //вывод max
        System.out.printf("Минимальный элемент: %d", min);     //вывод min
    }
}