package lesson1;

//проверка
/*public class MainClassFromLessonOne {
    public static void main(String[] args) {
        exOne();
    }
    private static void exOne() {
        System.out.println("Hello, world");
    }
}*/

/*1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”*/


import java.util.Scanner;
/*
public class MainClassFromLessonOne {
    public static void main(String[] args) {
        exOne();
    }

    private static void exOne() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Привет, %s!", name);
        scan.close();
    }
}*/

/*
2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
количество подряд идущих 1.

ВАРИАНТ 1:*/
/*
public class MainClassFromLessonOne {
    public static void main(String[] args) {
        size2();
    }

    private static void size2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 1};
        int count = 0;
        int max = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.printf("Большая последовательность %s", max);
    }
}*/

// ВАРИАНТ 2 (преподавателя):
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
//        inputNameAndPrint();
        int n = getRandomArrMaxCount(20);
        System.out.println(n);
    }
    private static int getRandomArrMaxCount(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2); //0-1
//            arr[i] = random.nextInt(3, 10); //3-9
        }

/*        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println(num);
        }*/

        int count = 0;
        int maxCount = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return maxCount;
    }
}

