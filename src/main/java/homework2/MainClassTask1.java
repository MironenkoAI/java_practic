package homework2;
/*ЗАДАЧА 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка
палиндромом (возвращает boolean значение).*/

import java.util.Scanner;

public class MainClassTask1 {
    public static void main(String[] args) {
        System.out.printf("Введите текст: ");
        Scanner txt = new Scanner(System.in);
        String str = txt.nextLine().toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        System.out.println(Palindrome(str));
        //palindrome();
    }

    private static boolean Palindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

    //РЕШЕНИЕ через цикл
    /*private static void palindrome() {
        System.out.printf("Введите текст: ");
        Scanner txt = new Scanner(System.in);
        String str = txt.nextLine().toLowerCase().replaceAll("[^a-zа-я0-9]", "");
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Строка не является палиндромом!");
                return;
            }
            j--;
        }
        System.out.println("Строка является палиндромом!");
    }*/
}
