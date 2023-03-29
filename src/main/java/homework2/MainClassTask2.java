package homework2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*ЗАДАЧА 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 который запишет эту строку в простой текстовый файл, обработайте исключения.*/
public class MainClassTask2 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST ".repeat(100));

        try (PrintWriter pw = new PrintWriter("src/main/resources/output.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
