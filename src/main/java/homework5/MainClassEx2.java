package homework5;
/*ЗАДАЧА 2. Пусть дан список сотрудников. Написать программу, которая найдёт и выведет повторяющиеся
имена с количеством повторений. Отсортировать по убыванию популярности. */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainClassEx2 {
    public static void main(String[] args) {
        ex2();
    }

    private static void ex2() {
        String[] list = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> coworkers = new HashMap<>();
        for (String s : list) {
            String name = s.split(" ")[0];
            if (coworkers.containsKey(name)) {
                coworkers.replace(name, coworkers.get(name) + 1);
            } else {
                coworkers.put(name, 1);
            }
        }
        System.out.println("Имя = количество повторов");
        coworkers.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);
    }
}
