package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainClassFromLessonFour {

    public static void main(String[] args) {
        ex0(); //засекаем разницу производительности LinkedList и ArrayList
    }
    private static void ex0() {
        final int SIZE = 10_000_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}
