package lessonTwo;

import java.util.Scanner;

public class LoopsTargil7 {
    public static void main(String[] args) {
        // רמה בינונית
        // תרגיל 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number (enter 0 to exit): ");
        int number = scanner.nextInt();

        while (number != 0) {
            number *= number;
            if (number > 30) {
                System.out.println(number);
                System.out.print("Please enter a number (enter 0 to exit): ");
                number = scanner.nextInt();
            } else {      // Question: What happens if we do not add this else block and input 5 or less?
                System.out.print("Please enter a number (enter 0 to exit): ");
                number = scanner.nextInt();
            }
        }
        System.out.println("Program exited.");
    }
}