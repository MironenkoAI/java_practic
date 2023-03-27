package lesson2;

public class MainClassFromLessonTwo {
    public static void main(String[] args) {
        test();
        returnLengthN();
        stringCompression();
    }

    //пример из семинара про StringBuilder
    private static void test() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append("i: ").append(i).append(" -> ").append((char) i).append(System.lineSeparator());
        }
        System.out.println(sb);
    }


    // ЗАДАЧА 1: вывести буквы поочереди и посчитать
    private static void returnLengthN() {
        int n = 8;
        String a = "a";
        String b = "B";
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c.append(a);
            } else {
                c.append(b);
            }
        }
        System.out.println(c);
    }


    // Напишите метод, который сжимает строку.
//      Пример: вход aaaabbbcdd.

    // НАША ВЕРСИЯ
    /*private static void stringCompression() {
        String str = "aaaabbbcddeeew";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(str.charAt(i)).append(count);
                } else {
                    res.append(str.charAt(i));
                }
                count = 1;
            }
        }
        if (count > 1) {
            res.append(str.charAt(str.length() - 1)).append(count);
        } else {
            res.append(str.charAt(str.length() - 1));
        }

        System.out.println(res);
    }*/

    // ОПТИМИЗИРОВАНО!
    private static void stringCompression() {
        String str = "aaaabbbccdff";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                res.append(str.charAt(i));
                res.append(count > 1 ? count: "");
                count = 0;
            }
            count++;
        }
        res.append(str.charAt(str.length() - 1));
        res.append(count > 1 ? count: "");

        System.out.println(res);
    }
}
