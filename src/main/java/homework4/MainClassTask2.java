package homework4;

import java.util.Collections;
import java.util.LinkedList;

//ЗАДАЧА 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class MainClassTask2 {
    public static void main(String[] args) {
        ex2();
    }

    public static void ex2() {
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon", "blueberry");
        System.out.println("Оригинальный список: " + wordsList);

        LinkedList<String> reversWordsList = new LinkedList<>();
        for (int i = wordsList.size() - 1; i >= 0; i--) {
            reversWordsList.add(wordsList.get(i));
        }
        System.out.println("Перевернутый список: " + reversWordsList);
    }
}

