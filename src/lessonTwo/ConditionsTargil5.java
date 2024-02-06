package lessonTwo;

import java.util.Scanner;

public class ConditionsTargil5 {
    public static void main(String[] args) {
        // רמה מתקדמת
        // תרגיל 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input any number"); // אנחנו מניחים שהמספרים הם רק מספרים שלמים
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number you have given: " + num + " is even");
        } else {
            System.out.println("The number you have given: " + num + " is odd");
        }
        scanner.close();
    }
}