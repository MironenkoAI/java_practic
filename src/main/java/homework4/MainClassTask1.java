package homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//ЗАДАЧА 1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class MainClassTask1 {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();

        while (true) {
            System.out.print("Введите строку: ");
            String text = in.nextLine();
            int SIZE = wordsList.size();

            if (text.equals("print")) {
                Deque<String> reversWordList = new LinkedList<>();
                for (int i = SIZE - 1; i >= 0; i--) {
                    reversWordList.add(wordsList.get(i));
                }
                System.out.println(reversWordList);

            } else if (text.equals("revert")) {
                wordsList.remove(SIZE - 1);
                System.out.println(wordsList);

            } else {
                wordsList.add(text);
                System.out.println(wordsList);
            }
        }
    }
}