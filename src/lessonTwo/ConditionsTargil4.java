package lessonTwo;

import java.util.Scanner;

public class ConditionsTargil4 {
    public static void main(String[] args) {
        // רמה מתקדמת
        // תרגיל 1

        // In Google we will search: 'Scanner Java example'
        // and we will learn by our selves from:'https://www.w3schools.com/java/java_user_input.asp'

        // יצירת אובייקט מסוג Scanner לקריאת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);

        // הדפסת הוראה למשתמש
        System.out.print("Please write your age: ");

        // קריאת הקלט מהמשתמש
        int age = scanner.nextInt();

        // הדפסת הגיל שהוזן
        System.out.println("Your age is: " + age);

        // סגירת ה-Scanner
        scanner.close();
    }
}