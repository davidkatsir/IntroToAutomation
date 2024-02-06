package lessonTwo;

import java.util.Scanner;

public class LoopsTargil6 {
    public static void main(String[] args) {
        // רמה בינונית
        // תרגיל 2
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != -1) {
            System.out.print("Enter a number (enter -1 to exit): ");
            number = scanner.nextInt();

            if (number != -1) {
                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
            }
        }
        System.out.println("Program exited.");
    }
}