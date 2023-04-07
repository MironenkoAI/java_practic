package lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassEx1 {
    public static void main(String[] args) {
        String number = "MMCMXCIX";
        System.out.println(fromRomanToArabic(number));
        //System.out.println("MMCMXCIX -> " + ex3("MMCMXCIX"));
    }

    // РЕШЕНИЕ В ГРУППАХ НА СЕМИНАРЕ:
    private static int fromRomanToArabic(String num) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);

        int sumNum = 0;
        int next = -1;
        for (int i = 0; i < num.length() - 1; i++) {
            int current = numbers.get(num.charAt(i) + "");
            next = numbers.get(num.charAt(i + 1) + "");
            if (current < next) {
                sumNum -= current;
            } else {
                sumNum += current;
            }
        }
        sumNum += next;
        return sumNum;
    }
}

// МЕТОД ПРЕПОДАВАТЕЛЯ:
   /* private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }
        return decimalNum;
    }
}*/
