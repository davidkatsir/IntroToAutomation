package lessonTwo;

import java.util.Scanner;

public class MethodsTargil6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // רמה מתקדמת
        // תרגיל 1
        getNumbersCallAllMethodsAndPrintAll();
        scanner.close();
    }

    public static int biggestOutOfThree(int a, int b, int c) {
        int biggestNumber = a;
        if (a < b) {
            biggestNumber = b;
        }
        if (biggestNumber < c) {
            biggestNumber = c;
        }
        return biggestNumber;
    }

    public static int smallestOutOfThree(int a, int b, int c) {
        int smallestNumber = a;
        if (a > b) {
            smallestNumber = b;
        }
        if (smallestNumber > c) {
            smallestNumber = c;
        }
        return smallestNumber;
    }

    public static int sumOfAllThree(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // בעיקרון ממוצע יכול להיות מס' עשרוני ולכן הכי נכון היה
    //  להשתמש כאן ב- DOUBLE גם בקלט ובפלט של המתודה
    // אבל אז היינו צריכים גם לשנות את a,b,c
    // בכל שאר הפונקציות, אז נוותר על זה
    public static int averageOfAllThree(int a, int b, int c) {
        int average = sumOfAllThree(a, b, c) / 3;
        return average;
    }

    // בתור בונוס קטן, אוסיף כאן פונקציה שקוראת לכולם ביחד ומדפיסה את כולם ביחד
    public static void getNumbersCallAllMethodsAndPrintAll() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a number (3 in total): ");
            int number = scanner.nextInt();
            if (i == 0) {
                a = number;
            } else if (i == 1) {
                b = number;
            } else c = number;
        }
        System.out.println("Biggest number out of the three is: " + biggestOutOfThree(a, b, c));
        System.out.println("Smallest number out of the three is: " + smallestOutOfThree(a, b, c));
        System.out.println("Sum of all three is: " + sumOfAllThree(a, b, c));
        System.out.println("Average of all three is: " + averageOfAllThree(a, b, c));
    }
}