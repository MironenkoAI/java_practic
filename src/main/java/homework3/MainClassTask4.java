package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ЗАДАЧА 4*. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
public class MainClassTask4 {
    public static void main(String[] args) {
        ex4();
    }

    private static void ex4() {
        List<String> list = new ArrayList<>(Arrays.asList("8", "I", "14", "love", "2", "you", "12", "lol", "10"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(list);
    }
}