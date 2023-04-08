package homework5;
// ЗАДАЧА 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a phone number");
            System.out.println("Enter 2 to print all numbers");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter name:");
                String name = scanner.next().toUpperCase();
                System.out.println("Enter phone number:");
                String number = scanner.next();
                phoneBook.addPhoneNumber(name, number);
            } else if (choice == 2) {
                phoneBook.printAllNumbers();
            }
        }
    }
    HashMap<String, List<String>> contacts = new HashMap<>();

    public void addPhoneNumber(String name, String number) {
        List<String> numbers;
        if (contacts.containsKey(name)) {
            numbers = contacts.get(name);
        } else {
            numbers = new ArrayList<>();
            contacts.put(name, numbers);
        }
        numbers.add(number);
    }

    public void printAllNumbers() {
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            List<String> numbers = contacts.get(name);
            for (Object number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
