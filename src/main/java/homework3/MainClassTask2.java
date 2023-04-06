package homework3;

import java.util.*;

//ЗАДАЧА 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее арифметическое из этого списка.
public class MainClassTask2 {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int size = scan.nextInt();
        scan.close();

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(50));
        }
        System.out.println(numbers);
        System.out.println("Максимальное число в списке: " + Collections.max(numbers));
        System.out.println("Минимальное число в списке: " + Collections.min(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            sum = sum + numbers.get(i);
        }

        //чтобы целое сделать дробным, умножить на 1.0 или добавить (double)
        double mean = 1.0 * (sum + numbers.get(numbers.size() - 1)) / numbers.size();
        //double mean = (double) (sum + numbers.get(numbers.size() - 1)) / numbers.size();

        System.out.println("Среднее арифметическое: " + mean);
    }
}
