package lessonTwo;

import java.util.Scanner;

public class MethodsMenu02 {
    // Create a single Scanner object for the entire class
    // זה נועד למנוע פתיחה וסגירה של האובייקט SCANNER שוב ושוב
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Instead of writing code several times
        // we will write a method outside the Main class and then call it
        // from within Main, as many times as we want, like here:
        menu();
        menu();
        // Close the Scanner object here, after all the menu calls
        // This ensures that the System.in stream remains open
        // for the entire duration of the program.
        scanner.close();
    }

    // זו דוגמא למתודה שלא מקבלת שום דבר וגם לא מחזירה שום דבר
    public static void menu() {
        System.out.println("Please choose from the menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Paste");
        System.out.println("3. Salad");
        System.out.println("4. Water");

        int option = scanner.nextInt();
        System.out.println("You chose option - " + option);
    }
}