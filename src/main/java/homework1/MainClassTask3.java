package homework1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*3*. В консоли запросить имя пользователя. В зависимости от текущего времени,
    вывести приветствие вида:
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */
public class MainClassTask3 {
    public static void main(String[] args) {
        helloName();
    }
    private static void helloName() {
        System.out.printf("Как к вам обращаться? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();

        Calendar calendar = new GregorianCalendar();

        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}
