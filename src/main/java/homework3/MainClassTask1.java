package homework3;
//ЗАДАЧА 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.*;

public class MainClassTask1 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int size;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите длину списка: ");
            size = scan.nextInt();
        }

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(-10, 20));
        }
        System.out.println(numbers);
        numbers.removeIf(e -> (e % 2) == 0);
        System.out.println("Новый список: " + numbers);
    }
}
