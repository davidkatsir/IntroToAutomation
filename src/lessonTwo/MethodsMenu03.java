package lessonTwo;

import java.util.Scanner;

public class MethodsMenu03 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Now we want to add a Wine option but dependant of the age
        // We will create a new version of the 'Menu' method (see below)
        // and this time we will call menu with its parameter
        menu(17);
        menu(18);
        scanner.close();
    }

    public static void menu(int age) {
        System.out.println("Please choose from the menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Paste");
        System.out.println("3. Salad");
        System.out.println("4. Water");
        if (age >= 18) {
            System.out.println("5. Wine");
        }
        int option = scanner.nextInt();
        System.out.println("You chose option - " + option);
    }
}