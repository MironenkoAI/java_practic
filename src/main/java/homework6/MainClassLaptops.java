package homework6;

import java.util.*;

public class MainClassLaptops {
    public static void main(String[] args) {

        laptop lp1 = new laptop("53013ERX");
        lp1.brand = "HUAWEI";
        lp1.diagonal = 15.6;
        lp1.screenResolution = "1920x1080 пикс.";
        lp1.processor = "Intel Core i5 1135G7 2.4 ГГц";
        lp1.RAM = 16;
        lp1.OS = "Windows 11";
        lp1.country = "Китай";
        lp1.warranty = 36;

        laptop lp2 = new laptop("TUF Gaming F15 FX506HCB-US51");
        lp2.brand = "ASUS";
        lp2.diagonal = 15.6;
        lp2.screenResolution = "1920x1080 пикс.";
        lp2.processor = "Intel Core i5 11400H 2.7 ГГц";
        lp2.RAM = 16;
        lp2.OS = "Windows 11";
        lp2.country = "Китай";
        lp2.warranty = 12;

        laptop lp3 = new laptop("MacBook Air MLXX3");
        lp3.brand = "Apple";
        lp3.diagonal = 13.6;
        lp3.screenResolution = "2560x1664 пикс.";
        lp3.processor = "Apple M2 M2 3.49 ГГц";
        lp3.RAM = 8;
        lp3.OS = "macOS Monterey";
        lp3.country = "Китай";
        lp3.warranty = 12;

        laptop lp4 = new laptop("MacBook Pro 16 M1");
        lp4.brand = "Apple";
        lp4.diagonal = 16.2;
        lp4.screenResolution = "3456x2234 пикс.";
        lp4.processor = "Apple M1 Pro";
        lp4.RAM = 16;
        lp4.OS = "macOS";
        lp4.country = "Китай";
        lp4.warranty = 36;

        laptop lp5 = new laptop("EVE 14 C415");
        lp5.brand = "Digma";
        lp5.diagonal = 14.0;
        lp5.screenResolution = "1920x1080 пикс.";
        lp5.processor = "Intel Celeron N3350 1.1 ГГц";
        lp5.RAM = 4;
        lp5.OS = "Windows 10";
        lp5.country = "Китай";
        lp5.warranty = 12;

        List<laptop> laptopsList = new ArrayList<>();
        laptopsList.add(lp1);
        laptopsList.add(lp2);
        laptopsList.add(lp3);
        laptopsList.add(lp4);
        laptopsList.add(lp5);


        System.out.println("Представленные ноутбуки: ");
        System.out.println();
        for (var item : laptopsList) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер оперативной памяти: ");
        int minRAM = scanner.nextInt();

        System.out.print("Введите бренд ноутбука: ");
        String myBrand = scanner.next();

        ArrayList<laptop> filteredLaptops = new ArrayList<>();
        for (laptop laptop : laptopsList) {
            if (laptop.getRAM() >= minRAM && laptop.getBrand().equalsIgnoreCase(myBrand)) {
                filteredLaptops.add(laptop);
            }
        }
        System.out.println();
        System.out.println("Отфильтрованные ноутбуки:");
        System.out.println();
        for (laptop laptop : filteredLaptops) {
            System.out.println(laptop.toString());
        }
    }
}
