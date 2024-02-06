package lessonTwo;

import java.util.Scanner;

public class MethodsMenu01 {
    // Create a single Scanner object for the entire class
    // זה נועד למנוע פתיחה וסגירה של האובייקט SCANNER שוב ושוב
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please choose from the menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Paste");
        System.out.println("3. Salad");
        System.out.println("4. Water");
        int option = scanner.nextInt();
        System.out.println("You chose option - " + option);

        System.out.println("Please choose from the menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Paste");
        System.out.println("3. Salad");
        System.out.println("4. Water");
        option = scanner.nextInt();
        System.out.println("You chose option - " + option);
        scanner.close();
        // Without using methods, this is the only way we can
        // choose multiple selections from the menu
    }
}