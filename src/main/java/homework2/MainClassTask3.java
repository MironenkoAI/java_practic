package homework2;
import java.io.File;

/*3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла:
        4 Расширение файла: jpg*/
public class MainClassTask3 {
    public static void main(String... args) {
        File dir = new File("src/main/java/homework2");
        showTypes(dir.listFiles());
    }

    public static void showTypes(File[] files) {
        int n = 1;
        for (File file : files) {
            System.out.println(n + ". Расширение файла: " + getFileExtension(file));
            n++;
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }
}