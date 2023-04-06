package lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassEx0 {

    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        Map<String, String> passportsToSernameMap = new HashMap<>();
        passportsToSernameMap.put("134234", "Иванов");
        passportsToSernameMap.put("345345", "Петров");
        passportsToSernameMap.put("546456", "Васильев");

        // 3 СПОСОБА вывести на экран Map:

/*        System.out.println(passportsToSernameMap);

        for (Map.Entry<String, String> entry : passportsToSernameMap.entrySet()) {
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }*/

/*        for (String key : passportsToSernameMap.keySet()) {
            System.out.printf("%s\t%s%n", key, passportsToSernameMap.get(key));
        }*/

        passportsToSernameMap.forEach((key, value) -> System.out.printf(
                "%s\t%s%n",
                key, value)
        );
    }
}
