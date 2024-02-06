package lessonTwo;

import java.util.Scanner;

public class LoopsTargil5 {
    public static void main(String[] args) {
        // רמה בינונית
        // תרגיל 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int yourAge = scanner.nextInt();    //Question: What will happen if we enter a number with a decimal here?
//        float yourAge = scanner.nextInt();
//        float yourAge = scanner.nextFloat();
        System.out.println("Your age is: " + yourAge);

        while (yourAge != -1) {
            System.out.println("Please enter a number ");
            yourAge = scanner.nextInt();
//            yourAge = scanner.nextFloat();
            System.out.println("Your age is: " + yourAge);
        }
        System.out.println("End");
    }
}