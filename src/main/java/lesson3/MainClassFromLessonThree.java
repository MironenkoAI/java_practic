package lesson3;

import java.util.*;

public class MainClassFromLessonThree {


//РЕШЕНИЕ 1: Планеты рандомно написать, посчитать сколько и вывести

/*    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {

        String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        List<String> planet1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planet1.add(planet[random.nextInt(9)]);
        }
        System.out.println(planet1);
        Collections.sort(planet1);
        System.out.println(planet1);


        int k = 1;

        for (int i = 0; i < planet1.size() - 1; i++) {

            if (planet1.get(i).equals(planet1.get(i + 1))) {
                k++;
            } else {
                System.out.println(planet1.get(i) + k);
                k = 1;
            }

        }
        System.out.println(planet1.get(planet1.size() - 1) + k);
    }

}*/

    public static void main(String[] args) {
        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append((list.get(list.size() - 1) + ": ")).append(count).append(".");
        System.out.println(sb);
    }
}